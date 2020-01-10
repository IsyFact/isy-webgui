package de.bund.bva.isyfact.isywebgui.gui.flows.wizarddialog;

import org.springframework.beans.factory.annotation.Required;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.MessageController;
import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogModel;

/**
 * Controller für den Wizard Dialog.
 *
 * @author Capgemini, Tobias Groeger
 * @version $Id: WizardController.java 134128 2015-04-08 13:53:41Z sdm_ahoerning $
 */
public class WizardController extends AbstractGuiController<WizardModel> {

    /**
     * Der MessageController.
     */
    private MessageController messageController;

    @Override
    public void initialisiereModel(WizardModel model) {

        // Wizard Model
        model.setWizardDialogModel(new WizardDialogModel());

    }

    /**
     * Aufruf von Speichern.
     * @param model
     *            das Model des Modalen Dialogs
     */
    public void speichern(WizardModel model) {
        this.messageController.writeInfoMessage("Erfolgreich gespeichert");
    }

    /**
     * Aufruf von Abbrechen.
     * @param model
     *            das Model des Modalen Dialogs
     */
    public void abbrechen(WizardModel model) {
        this.messageController.writeWarnMessage("Abbruch!", "Fehler");
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

}
