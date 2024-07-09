package de.bund.bva.isyfact.isywebgui.gui.layouts.maskentexte;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 * Das Model für die Maskentexte.
 *
 */
@Controller
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
