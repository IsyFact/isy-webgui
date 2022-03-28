package de.bund.bva.pliscommon.pliswebgui.gui.flows.wizarddialog;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;

import org.springframework.beans.factory.annotation.Required;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.MessageController;
import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogModel;
import de.bund.bva.pliscommon.pliswebgui.gui.jsfvorlagen.jsfsteuerelemente.JsfSteuerelementeHelper;
import de.bund.bva.pliscommon.pliswebgui.gui.jsfvorlagen.jsfsteuerelemente.JsfSteuerelementeStaatsangListpickerModel;

/**
 * Controller for the Wizard dialogue.
 *
 * @author Capgemini
 * @version $Id: WizardController.java 134128 2015-04-08 13:53:41Z sdm_ahoerning $
 */
public class WizardController extends AbstractGuiController<WizardModel> {

    /**
     * The MessageController.
     */
    private MessageController messageController;

    /**
     * The JsfSteuerelementeHelper.
     */
    private JsfSteuerelementeHelper jsfSteuerelementeHelper;

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

    @Required
    public void setMessageController(MessageController messageController) {
        this.messageController = messageController;
    }

    @Required
    public void setJsfSteuerelementeHelper(JsfSteuerelementeHelper jsfSteuerelementeHelper) {
        this.jsfSteuerelementeHelper = jsfSteuerelementeHelper;
    }

}
