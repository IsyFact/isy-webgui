package de.bund.bva.isyfact.isywebgui.gui.flows.modalerdialog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.MessageController;

/**
 * Controller für den Modalen Dialog.
 *
 */
@Controller
public class ModalerDialogController extends AbstractGuiController<ModalerDialogModel> {

    /**
     * Der MessageController.
     */
    private MessageController messageController;

    @Autowired
    public ModalerDialogController(MessageController messageController) {
        this.messageController = messageController;
    }

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

}
