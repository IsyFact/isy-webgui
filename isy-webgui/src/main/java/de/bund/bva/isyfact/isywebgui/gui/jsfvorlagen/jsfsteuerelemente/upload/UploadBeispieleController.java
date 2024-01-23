package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.upload;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.GlobalFlowController;
import de.bund.bva.isyfact.common.web.jsf.components.upload.DateitypEnum;
import de.bund.bva.isyfact.common.web.jsf.components.upload.UploadHelper;
import de.bund.bva.isyfact.common.web.validation.ValidationMessage;
import de.bund.bva.isyfact.isywebgui.common.konstanten.FehlerSchluessel;

@Controller
public class UploadBeispieleController extends AbstractGuiController<UploadBeispieleModel> {

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

    @Override
    protected Class<UploadBeispieleModel> getMaskenModelKlasseZuController() {
        return UploadBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(UploadBeispieleModel model) {
    }

    @Autowired
    public UploadBeispieleController(GlobalFlowController globalFlowController) {
        this.globalFlowController = globalFlowController;
    }

    /**
     * Gibt ein Bild als data-uri zurück.
     *
     * @param bild Das Bild als Byte-Array.
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
     * @param model das zu speichernende Model
     */
    public void uploadSpeichern(UploadBeispieleModel model) {

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
     * @param model Das JsfSteuerelementeModel.
     * @return true, Wenn die Validierung der Upload-Anteile des Formulars erfolgreich war.
     */
    protected boolean validiereFormular(final UploadBeispieleModel model) {

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
}
