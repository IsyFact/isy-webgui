package de.bund.bva.pliscommon.pliswebgui.gui.flows.errorhandling;

import org.springframework.beans.factory.annotation.Required;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.MessageController;
import de.bund.bva.pliscommon.pliswebgui.gui.flows.awkwrapper.FlowAwkWrapper;
import de.bund.bva.pliscommon.pliswebgui.gui.flows.awkwrapper.impl.FachlicheAwkException;

/**
 * Controller für Error-Handling.
 *
 * @author Capgemini, Tobias Groeger
 * @version $Id: ErrorHandlingController.java 164792 2016-05-12 16:27:45Z sdm_arichter $
 */
public class ErrorHandlingController extends AbstractGuiController<ErrorHandlingModel> {

    /**
     * Der Flow-Awk-Wrapper.
     */
    private FlowAwkWrapper flowAwkWrapper;

    /**
     * Der MessageController.
     */
    private MessageController messageController;

    /**
     * Aufruf des AWKs mit NPE.
     */
    public void awkAufrufNullpointer() {
        try {
            this.flowAwkWrapper.rufeAwkAuf();
        } catch (Throwable e) {
            // Erfolgreich abgefangen. Hier könnten Aufbereitungen des Models stattfinden.

            this.messageController.writeAndLogException(e);
        }
    }

    /**
     * Aufruf des AWKs mit fachlichem Fehler.
     */
    public void awkAufrufFachlich() {
        try {
            this.flowAwkWrapper.rufeAwkFachlicheAuf();
        } catch (FachlicheAwkException e) {
            // Erfolgreich abgefangen. Hier könnten Aufbereitungen des Models stattfinden.
            this.messageController.writeException(e);
        } catch (Throwable e) {
            // Erfolgreich abgefangen. Hier könnten Aufbereitungen des Models stattfinden.
            this.messageController.writeAndLogException(e);

        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<ErrorHandlingModel> getMaskenModelKlasseZuController() {
        return ErrorHandlingModel.class;
    }

    @Required
    public void setFlowAwkWrapper(FlowAwkWrapper flowAwkWrapper) {
        this.flowAwkWrapper = flowAwkWrapper;
    }

    @Required
    public void setMessageController(MessageController messageController) {
        this.messageController = messageController;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialisiereModel(ErrorHandlingModel model) {
        // TODO Auto-generated method stub

    }

}
