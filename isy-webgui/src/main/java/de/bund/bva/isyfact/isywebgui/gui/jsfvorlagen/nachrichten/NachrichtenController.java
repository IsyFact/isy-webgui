package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.nachrichten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.MessageController;

/**
 * Controller für Nachrichten.
 *
 */
@Controller
public class NachrichtenController extends AbstractGuiController<NachrichtenModel> {
    /**
     * Der Message-Controller.
     */
    private MessageController messageController;

    @Autowired
    public NachrichtenController(MessageController messageController) {
        this.messageController = messageController;
    }

    @Override
    public void initialisiereModel(NachrichtenModel model) {
        // Hier ist nichts zu tun.
    }

    /**
     * Zeigt einzeilige Nachrichten an.
     *
     * @param model das NachrichtenModel
     */
    public void zeigeEinzeiligeNachrichten(NachrichtenModel model) {

        // SUCCESS
        this.messageController.writeSuccessMessage("Dies ist eine einzeilige Erfolgsnachricht.");

        // INFO
        this.messageController.writeInfoMessage("Dies ist eine einzeilige Informationsnachricht.");

        // WARN
        this.messageController.writeWarnMessage("Dies ist eine einzeilige Warnnachricht.",
                "Unzulässige Eingaben");

        // ERROR
        this.messageController.writeErrorMessage("Dies ist eine einzeilige Fehlernachricht.",
                "Technischer Fehler");

    }

    /**
     * Zeigt zweizeilige Nachrichten an.
     *
     * @param model das NachrichtenModel
     */
    public void zeigeZweizeiligeNachrichten(NachrichtenModel model) {

        // SUCCESS
        this.messageController.writeSuccessMessage("Dies ist eine zweizeilige Informationsnachricht.");
        this.messageController.writeSuccessMessage("2.Teil");

        // INFO
        this.messageController.writeInfoMessage("Dies ist eine zweizeilige Informationsnachricht.");
        this.messageController.writeInfoMessage("2.Teil");

        // WARN
        this.messageController.writeWarnMessage("Dies ist eine einzeilige Warnnachricht.",
                "Unzulässige Eingaben");
        this.messageController.writeWarnMessage("2.Teil", "Unzulässige Eingaben");

        // ERROR
        this.messageController.writeErrorMessage("Dies ist eine einzeilige Fehlernachricht.",
                "Technischer Fehler");
        this.messageController.writeErrorMessage("2.Teil", "Technischer Fehler");

    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<NachrichtenModel> getMaskenModelKlasseZuController() {
        return NachrichtenModel.class;
    }
}
