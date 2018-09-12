package de.bund.bva.pliscommon.pliswebgui.gui.jsfvorlagen.jsfsteuerelemente;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.UUID;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Required;

import com.google.common.collect.Lists;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.GlobalFlowController;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableInMemoryModel;
import de.bund.bva.isyfact.common.web.jsf.components.listpicker.behoerde.BehoerdeListpickerModel;
import de.bund.bva.isyfact.common.web.jsf.components.tab.TabGroupModel;
import de.bund.bva.isyfact.common.web.jsf.components.upload.DateitypEnum;
import de.bund.bva.isyfact.common.web.jsf.components.upload.UploadHelper;
import de.bund.bva.isyfact.common.web.validation.ValidationMessage;
import de.bund.bva.pliscommon.pliswebgui.common.konstanten.FehlerSchluessel;

/**
 * Controller für die JSF-Steuerelemente.
 *
 * @author Capgemini, Tobias Gröger
 * @version $Id: JsfSteuerelementeController.java 166449 2016-06-06 12:15:53Z sdm_arichter $
 */
public class JsfSteuerelementeController extends AbstractGuiController<JsfSteuerelementeModel> {

    // Konstanten für die Upload-Funktionalität
    private static final String REFERENCE_TEXT = "text";

    private static final String READABLEREFERENCE_TEXT = "Text";

    private static final String REFERENCE_BILD = "bild";

    private static final String READABLEREFERENCE_BILD = "Bild";

    private static final String MIMETYPE_PREFIX_BILD = "image/";

    /**
     * Der GlobalFlowController.
     */
    private GlobalFlowController globalFlowController;

    /**
     * Helper für die JSF-Steuerelement.
     */
    private JsfSteuerelementeHelper jsfSteuerelementeHelper;

    /**
     * Controller für die Trefferliste (Client-Modus).
     */
    private JsfSteuerelementeTrefferlistenClientController jsfSteuerelementeTrefferlistenClientController;

    /**
     * Controller für die Trefferliste (Server-Modus).
     */
    private JsfSteuerelementeTrefferlistenServerController jsfSteuerelementeTrefferlistenServerController;

    @Override
    public void initialisiereModel(JsfSteuerelementeModel model) {

        // Dropdown
        List<SelectItem> selectItems = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            selectItems.add(new SelectItem(String.valueOf(i), "Item " + i));
        }
        model.setDropdownAuswahlListe(selectItems);

        // Radio Button
        selectItems = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {

            SelectItem selectItem = new SelectItem(String.valueOf(i), "Item " + i);

            if (i == 2) {
                selectItem.setDisabled(true);
            }

            selectItems.add(selectItem);
        }
        model.setRadioButtonAuswahl("2");
        model.setRadioButtonListe(selectItems);

        // Checkbox
        selectItems = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {

            SelectItem selectItem = new SelectItem(String.valueOf(i), "CB " + i);

            if (i == 4) {
                selectItem.setDisabled(true);
            }

            selectItems.add(selectItem);
        }
        model.setCheckboxAuswahl(Lists.newArrayList("4"));
        model.setCheckboxListe(selectItems);

        // Trefferliste
        JsfSteuerelementeTrefferlistenModel trefferlistenClientModel =
            new JsfSteuerelementeTrefferlistenModel();
        model.setTrefferlistenClientModel(trefferlistenClientModel);

        DataTableInMemoryModel<JsfSteuerelementeTreffer> trefferlistenServerModel =
            new DataTableInMemoryModel<>();
        model.setTrefferlistenServerModel(trefferlistenServerModel);

        // Listpicker ohne AJAX
        JsfSteuerelementeListpickerModel listpickerModel = new JsfSteuerelementeListpickerModel();
        listpickerModel.setItems(this.jsfSteuerelementeHelper.getJsfSteuerelementeListpickerController()
            .erzeugeListpickerItemListe());
        model.setListpickerModel(listpickerModel);

        // Staatsangehoerigkeit-Listpicker ohne AJAX
        JsfSteuerelementeStaatsangListpickerModel staatsangListpickerModel = new JsfSteuerelementeStaatsangListpickerModel();
        staatsangListpickerModel.setItems(this.jsfSteuerelementeHelper.getJsfSteuerelementeStaatsangListpickerController()
            .erzeugeListpickerItemListe());
        model.setStaatsangListpickerModel(staatsangListpickerModel);

        // Listpicker mit AJAX
        JsfSteuerelementeListpickerModel ajaxListpickerModel = new JsfSteuerelementeListpickerModel();
        List<JsfSteuerelementeListpickerItem> items = this.jsfSteuerelementeHelper
            .getJsfSteuerelementeListpickerController().erzeugeListpickerItemListe();
        ajaxListpickerModel.setItems(items);

        this.jsfSteuerelementeHelper.getJsfSteuerelementeListpickerController()
            .begrenzeItems(ajaxListpickerModel);

        model.setAjaxListpickerModel(ajaxListpickerModel);

        // Behörde Listpicker (mit AJAX)
        BehoerdeListpickerModel behoerdeListpickerModel = new BehoerdeListpickerModel();
        behoerdeListpickerModel.setItems(this.jsfSteuerelementeHelper
            .getJsfSteuerelementeBehoerdeListpickerController().erzeugeBehoerdeListpickerItemListe());
        model.setBehoerdeListpickerModel(behoerdeListpickerModel);

        // Tabs
        model.setTabGroupModel(new TabGroupModel());

        List<String> formSelectListInhalt = Arrays.asList("Item 1", "Item 2", "Item 3");
        model.setFormSelectListInhalt(formSelectListInhalt);

        model.setBrowseAndCollectAuswahl(Arrays.asList("Item 2"));

        // Toggle-Filter
        selectItems = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {

            SelectItem selectItem = new SelectItem(String.valueOf(i), "Filter " + i);

            if (i == 4) {
                selectItem.setDisabled(true);
            }

            selectItems.add(selectItem);
        }
        System.out.println("");
        model.setToggleFilterAuswahl("4");
        model.setToggleFilterListe(selectItems);

    }

    /**
     * Führt eine Suche aus.
     * @param model
     *            das Model
     */
    public void fuehreSucheAusClient(JsfSteuerelementeModel model) {
        this.jsfSteuerelementeTrefferlistenClientController.search(model.getTrefferlistenClientModel());
    }

    /**
     * Führt eine Suche aus.
     * @param model
     *            das Model
     */
    public void fuehreSucheAusServer(JsfSteuerelementeModel model) {
        this.jsfSteuerelementeTrefferlistenServerController.search(model.getTrefferlistenServerModel());
    }

    /**
     * Führt eine Action auf dem Button aus.
     * @param model
     *            das Model
     */
    public void buttonAction(JsfSteuerelementeModel model) {
        model.setButtonActionResult(UUID.randomUUID().toString());
    }

    /**
     * Führt eine Action auf dem block-Button aus.
     * @param model
     *            das Model
     */
    public void blockButtonAction(JsfSteuerelementeModel model) {
        model.setBlockButtonActionResult(UUID.randomUUID().toString());
    }

    /**
     * Führt eine Action auf dem Button zum FormInput aus.
     * @param model
     *            das Model
     */
    public void formInputButtonAction(JsfSteuerelementeModel model) {
        // Nichts tun
    }

    /**
     * Führt eine Action auf dem Button zur TextBox aus.
     * @param model
     *            das Model
     */
    public void textBoxButtonAction(JsfSteuerelementeModel model) {
        // Nichts tun
    }

    /**
     * Führt eine Action auf dem Dropdown-Button aus.
     * @param model
     *            das Model
     */
    public void dropdownButtonAction(JsfSteuerelementeModel model) {
        // Nichts tun
    }

    /**
     * Führt eine Action auf dem Datum-Button aus.
     * @param model
     *            das Model
     */
    public void datumButtonAction(JsfSteuerelementeModel model) {
        // Nichts tun
    }

    /**
     * Führt eine Action auf dem Radion-Button aus.
     * @param model
     *            das Model
     */
    public void radioButtonAction(JsfSteuerelementeModel model) {
        // Nichts tun
    }

    public JsfSteuerelementeTrefferlistenClientController getJsfSteuerelementeTrefferlistenClientController() {
        return this.jsfSteuerelementeTrefferlistenClientController;
    }

    @Required
    public void setJsfSteuerelementeTrefferlistenClientController(
        JsfSteuerelementeTrefferlistenClientController jsfSteuerelementeTrefferlistenClientController) {
        this.jsfSteuerelementeTrefferlistenClientController = jsfSteuerelementeTrefferlistenClientController;
    }

    @Required
    public void setJsfSteuerelementeHelper(JsfSteuerelementeHelper jsfSteuerelementeHelper) {
        this.jsfSteuerelementeHelper = jsfSteuerelementeHelper;
    }

    @Override
    protected Class<JsfSteuerelementeModel> getMaskenModelKlasseZuController() {
        return JsfSteuerelementeModel.class;
    }

    public void checkboxAusgewaehlt(ValueChangeEvent event) throws AbortProcessingException {
        getMaskenModelZuController()
            .setCheckboxBooleanNeuerWert(event.getComponent().getClientId() + ": " + event.getNewValue());
    }

    public void checkboxBooleanGeklickt(AjaxBehaviorEvent event) {
        getMaskenModelZuController().setCheckboxBooleanGeklicktAnzahl(
            getMaskenModelZuController().getCheckboxBooleanGeklicktAnzahl() + 1);
    }

    public void dropdownWertAusgewaehlt(ValueChangeEvent event) throws AbortProcessingException {
        getMaskenModelZuController().setDropdownAuswahlAjax(String.valueOf(event.getNewValue()));
    }

    public void actionInputAction(JsfSteuerelementeModel model) {
        model.setActionInputResult(UUID.randomUUID().toString());
    }

    public JsfSteuerelementeTrefferlistenServerController getJsfSteuerelementeTrefferlistenServerController() {
        return this.jsfSteuerelementeTrefferlistenServerController;
    }

    @Required
    public void setJsfSteuerelementeTrefferlistenServerController(
        JsfSteuerelementeTrefferlistenServerController jsfSteuerelementeTrefferlistenServerController) {
        this.jsfSteuerelementeTrefferlistenServerController = jsfSteuerelementeTrefferlistenServerController;
    }

    /**
     * Gibt ein Bild als data-uri zurück.
     *
     * @param bild
     *            Das Bild als Byte-Array.
     * @return the image
     */
    public String getEncodedImage(byte[] bild) {

        if (bild == null) {
            return null;
        }
        return Base64.getEncoder().encodeToString(bild);
    }

    /**
     * Speichert etwaige Uploaddaten im Model.
     *
     * @param model
     *            das zu speichernende Model
     */
    public void uploadSpeichern(JsfSteuerelementeModel model) {

        if (!validiereFormular(model)) {
            return;
        }
        // lese Text-Datei
        byte[] fileData = null;
        try {
            fileData = model.getTextUpload() != null
                ? IOUtils.toByteArray(model.getTextUpload().getInputStream()) : null;
        } catch (IOException e) {
            List<ValidationMessage> validationMessages = new ArrayList<ValidationMessage>();
            validationMessages.add(new ValidationMessage(FehlerSchluessel.MSG_ALLGEMEINER_VALIDIERUNGSFEHLER,
                REFERENCE_TEXT, READABLEREFERENCE_TEXT, "Fehler beim Lesen der hochgeladenen Daten."));
            this.globalFlowController.getValidationController().processValidationMessages(validationMessages);
            return;
        }
        model.setHochgeladenerText(fileData != null ? new String(fileData, Charset.defaultCharset()) : null);
        // lese Bild-Datei
        model.setHochgeladenesBild(null);
        if (model.getBildUpload() != null) {
            try {
                fileData = IOUtils.toByteArray(model.getBildUpload().getInputStream());
            } catch (IOException e) {
                List<ValidationMessage> validationMessages = new ArrayList<ValidationMessage>();
                validationMessages.add(
                    new ValidationMessage(FehlerSchluessel.MSG_ALLGEMEINER_VALIDIERUNGSFEHLER, REFERENCE_BILD,
                        READABLEREFERENCE_BILD, "Fehler beim Lesen der hochgeladenen Daten."));
                this.globalFlowController.getValidationController()
                    .processValidationMessages(validationMessages);
                return;
            }
            model.setHochgeladenesBild(fileData);
        }
    }

    /**
     * Validiert die Formulareingaben für den Upload.
     *
     * @param model
     *            Das JsfSteuerelementeModel.
     * @return true, Wenn die Validierung der Upload-Anteile des Formulars erfolgreich war.
     */
    protected boolean validiereFormular(final JsfSteuerelementeModel model) {

        List<ValidationMessage> validationMessages = new ArrayList<ValidationMessage>();

        // validiere Text-Datei
        if (model.getTextUpload() != null) {
            if (model.getTextUpload().getSize() > 10240) {
                validationMessages.add(new ValidationMessage("ERR001", REFERENCE_TEXT, READABLEREFERENCE_TEXT,
                    "Die hochgeladene Datei ist größer als 10Kb."));
            }
            // normalerweise reicht nach dem MimeType zu valiederen
            if (!DateitypEnum.TXT.getMimeType().equals(model.getTextUpload().getContentType()) && UploadHelper
                .getFileName(model.getTextUpload()).endsWith(DateitypEnum.TXT.getDateiErweiterung())) {
                validationMessages.add(new ValidationMessage("ERR02", REFERENCE_TEXT, READABLEREFERENCE_TEXT,
                    "Die hochgeladene Datei ist keine Text-Datei."));
            }
        }
        // valiedere Bild-Datei
        if (model.getBildUpload() != null) {
            if (model.getBildUpload().getSize() > 102400) {
                validationMessages.add(new ValidationMessage("ERR001", REFERENCE_BILD, READABLEREFERENCE_BILD,
                    "Die hochgeladene Datei ist größer als 100Kb."));
            }
            if (!model.getBildUpload().getContentType().startsWith(MIMETYPE_PREFIX_BILD)) {
                validationMessages.add(new ValidationMessage("ERR02", REFERENCE_BILD, READABLEREFERENCE_BILD,
                    "Die hochgeladene Datei ist keine Bild-Datei."));
            }
        }
        this.globalFlowController.getValidationController().processValidationMessages(validationMessages);
        return validationMessages.isEmpty();
    }

    @Required
    public void setGlobalFlowController(GlobalFlowController globalFlowController) {
        this.globalFlowController = globalFlowController;
    }
}
