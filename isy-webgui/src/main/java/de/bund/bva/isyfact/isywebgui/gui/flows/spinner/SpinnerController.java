package de.bund.bva.isyfact.isywebgui.gui.flows.spinner;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 * Controller für den Spinner.
 *
 * @author Capgemini
 * @version $Id: SpinnerController.java 130053 2015-02-10 12:46:06Z sdm_tgroeger $
 */
@Controller
public class SpinnerController extends AbstractGuiController<SpinnerModel> {

    @Override
    public void initialisiereModel(SpinnerModel model) {
        // Hier ist nichts zu tun

    }

    @Override
    protected Class<SpinnerModel> getMaskenModelKlasseZuController() {
        return SpinnerModel.class;
    }

}
