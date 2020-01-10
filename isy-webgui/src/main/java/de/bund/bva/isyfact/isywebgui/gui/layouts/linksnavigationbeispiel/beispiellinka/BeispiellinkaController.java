package de.bund.bva.isyfact.isywebgui.gui.layouts.linksnavigationbeispiel.beispiellinka;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 * Der Controller für den Beispiellink B.
 *
 * @author Capgemini, Tobias Gröger
 * @version $Id: BeispiellinkaController.java 130047 2015-02-10 10:52:10Z sdm_tgroeger $
 */
public class BeispiellinkaController extends AbstractGuiController<BeispiellinkaModel> {

    @Override
    public void initialisiereModel(BeispiellinkaModel model) {
        // Hier ist nichts zu tun
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<BeispiellinkaModel> getMaskenModelKlasseZuController() {
        return BeispiellinkaModel.class;
    }
}
