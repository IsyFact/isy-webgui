package de.bund.bva.isyfact.isywebgui.gui.flows.wizarddialog;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.MessageController;
import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogModel;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.JsfSteuerelementeHelper;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeStaatsangListpickerModel;



/**
 * Controller for the Wizard dialogue.
 *
 */
@Controller
public class WizardController extends AbstractGuiController<WizardModel> {

    /**
     * The MessageController.
     */
    private MessageController messageController;

    /**
     * The JsfSteuerelementeHelper.
     */
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
     * Call save.
     * @param model
     *      the model of the modal dialogue
     */
    public void speichern(WizardModel model) {
        this.messageController.writeInfoMessage("Erfolgreich gespeichert");
    }

    /**
     * Call Cancel.
     * @param model
     *      the model of the modal dialogue
     */
    public void abbrechen(WizardModel model) {
        this.messageController.writeWarnMessage("Abbruch!", "Fehler");
    }

    /**
     * Sets the chosen dropdown value for the model.
     *
     * @param event The ValueChangeEvent.
     * @throws AbortProcessingException Exception
     */
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
