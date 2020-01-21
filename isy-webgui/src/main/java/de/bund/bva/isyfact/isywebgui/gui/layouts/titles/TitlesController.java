package de.bund.bva.isyfact.isywebgui.gui.layouts.titles;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import org.springframework.stereotype.Controller;

/**
 * Controller für Titles.
 *
 * @author Capgemini, Tobias Gröger
 * @version $Id: TitlesController.java 130047 2015-02-10 10:52:10Z sdm_tgroeger $
 */
@Controller
public class TitlesController extends AbstractGuiController<TitlesModel> {

    @Override
    public void initialisiereModel(TitlesModel model) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<TitlesModel> getMaskenModelKlasseZuController() {
        return TitlesModel.class;
    }
}
