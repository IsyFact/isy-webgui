package de.bund.bva.pliscommon.pliswebgui.gui.layouts.druckansicht;

import org.springframework.beans.factory.annotation.Required;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.layout.BasisController;
import de.bund.bva.isyfact.logging.IsyLogger;
import de.bund.bva.isyfact.logging.IsyLoggerFactory;

/**
 * Controller for the print view.
 */
public class DruckansichtController extends AbstractGuiController<DruckansichtModel> {

    /** Logger. */
    private static final IsyLogger LOGGER = IsyLoggerFactory.getLogger(DruckansichtController.class);

    /**
     * Controller for the template "Basis".
     */
    private BasisController basisController;

    @Override
    public void initialisiereModel(DruckansichtModel model) {
        // show sidebar
        this.basisController.getMaskenModelZuController().getSeitentoolbarModel().setAnzeigen(true);
        // init model
        model.setPostCounter(0);
    }

    /**
     * Action for the action button on the page.
     * Increments the postcounter to track how often the button has been pressed.
     * @param model the DruckansichtModel containing the modeldata for this controller.
     * */
    public void incrementCounter(DruckansichtModel model) {
        model.setPostCounter(model.getPostCounter() + 1);
        LOGGER.debug("TestAufruf Controller");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<DruckansichtModel> getMaskenModelKlasseZuController() {
        return DruckansichtModel.class;
    }

    @Required
    public void setBasisController(BasisController basisController) {
        this.basisController = basisController;
    }

}
