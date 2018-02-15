package de.bund.bva.pliscommon.pliswebgui.gui.layouts.titles;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 * Controller für Titles.
 *
 * @author Capgemini, Tobias Gröger
 * @version $Id: TitlesController.java 130047 2015-02-10 10:52:10Z sdm_tgroeger $
 */
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
