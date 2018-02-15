package de.bund.bva.pliscommon.pliswebgui.gui.flows.modalerdialog;

import org.springframework.beans.factory.annotation.Required;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.MessageController;

/**
 * Controller für den Modalen Dialog.
 *
 * @author Capgemini, Tobias Groeger
 * @version $Id: ModalerDialogController.java 134128 2015-04-08 13:53:41Z sdm_ahoerning $
 */
public class ModalerDialogController extends AbstractGuiController<ModalerDialogModel> {

    /**
     * Der MessageController.
     */
    private MessageController messageController;

    @Override
    public void initialisiereModel(ModalerDialogModel model) {

    }

    /**
     * Aufruf von Speichern.
     * @param model
     *            das Model des Modalen Dialogs
     */
    public void speichern(ModalerDialogModel model) {
        this.messageController.writeInfoMessage("Erfolgreich gespeichert");
    }

    /**
     * Aufruf von Abbrechen.
     * @param model
     *            das Model des Modalen Dialogs
     */
    public void abbrechen(ModalerDialogModel model) {
        this.messageController.writeWarnMessage("Abbruch!", "Fehler");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<ModalerDialogModel> getMaskenModelKlasseZuController() {
        return ModalerDialogModel.class;
    }

    @Required
    public void setMessageController(MessageController messageController) {
        this.messageController = messageController;
    }

}
