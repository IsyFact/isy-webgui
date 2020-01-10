package de.bund.bva.isyfact.isywebgui.gui.layouts.maskentexte;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 *
 * Das Model für die Maskentexte.
 * @author Capgemini, Tobias Gröger
 * @version $Id: MaskentexteController.java 130047 2015-02-10 10:52:10Z sdm_tgroeger $
 */
public class MaskentexteController extends AbstractGuiController<MaskentexteModel> {

    @Override
    public void initialisiereModel(MaskentexteModel model) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<MaskentexteModel> getMaskenModelKlasseZuController() {
        return MaskentexteModel.class;
    }
}
