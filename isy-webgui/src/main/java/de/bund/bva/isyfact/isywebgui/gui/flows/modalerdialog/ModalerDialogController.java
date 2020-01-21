package de.bund.bva.isyfact.isywebgui.gui.flows.modalerdialog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.MessageController;
import org.springframework.stereotype.Controller;

/**
 * Controller für den Modalen Dialog.
 *
 * @author Capgemini, Tobias Groeger
 * @version $Id: ModalerDialogController.java 134128 2015-04-08 13:53:41Z sdm_ahoerning $
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
