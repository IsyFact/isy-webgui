package de.bund.bva.isyfact.isywebgui.gui.flows.wizarddialog;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;

import org.springframework.beans.factory.annotation.Autowired;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.MessageController;
import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogModel;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.JsfSteuerelementeHelper;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeStaatsangListpickerModel;

import org.springframework.stereotype.Controller;

/**
 * Controller für den Wizard Dialog.
 *
 * @author Capgemini
 * @version $Id: WizardController.java 134128 2015-04-08 13:53:41Z sdm_ahoerning $
 */
@Controller
public class WizardController extends AbstractGuiController<WizardModel> {

    /**
     * Der MessageController.
     */
    private MessageController messageController;

    private JsfSteuerelementeHelper jsfSteuerelementeHelper;

    @Autowired
    public WizardController(MessageController messageController, JsfSteuerelementeHelper jsfSteuerelementeHelper) {

        this.messageController = messageController;
        this.jsfSteuerelementeHelper = jsfSteuerelementeHelper;
    }

    @Override
    public void initialisiereModel(WizardModel model) {

        JsfSteuerelementeStaatsangListpickerModel staatsangListpickerModel =
            new JsfSteuerelementeStaatsangListpickerModel();
        staatsangListpickerModel.setItems(this.jsfSteuerelementeHelper
            .getJsfSteuerelementeStaatsangListpickerController().erzeugeListpickerItemListe());
        model.setStaatsangListpickerModel(staatsangListpickerModel);
        // Wizard Model
        model.setWizardDialogModel(new WizardDialogModel());

    }

    /**
     * Aufruf von Speichern.
     * @param model
     *        das Model des Modalen Dialogs
     */
    public void speichern(WizardModel model) {
        this.messageController.writeInfoMessage("Erfolgreich gespeichert");
    }

    /**
     * Aufruf von Abbrechen.
     * @param model
     *        das Model des Modalen Dialogs
     */
    public void abbrechen(WizardModel model) {
        this.messageController.writeWarnMessage("Abbruch!", "Fehler");
    }

    public void dropdownWertAusgewaehlt(ValueChangeEvent event) throws AbortProcessingException {
        getMaskenModelZuController().setDropdownAuswahl(String.valueOf(event.getNewValue()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<WizardModel> getMaskenModelKlasseZuController() {
        return WizardModel.class;
    }


}
