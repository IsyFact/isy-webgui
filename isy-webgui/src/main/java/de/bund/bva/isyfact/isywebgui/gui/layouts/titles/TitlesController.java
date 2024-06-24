package de.bund.bva.isyfact.isywebgui.gui.layouts.titles;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 * Controller für Titles.
 *
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
