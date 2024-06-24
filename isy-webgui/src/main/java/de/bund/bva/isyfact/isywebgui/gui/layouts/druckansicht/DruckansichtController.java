package de.bund.bva.isyfact.isywebgui.gui.layouts.druckansicht;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.layout.BasisController;

/**
 * Der Controller für die Druckansicht.
 *
 */
@Controller
public class DruckansichtController extends AbstractGuiController<DruckansichtModel> {

    /**
     * Der Basis-Controller.
     */
    private BasisController basisController;

    @Autowired
    public DruckansichtController(BasisController basisController) {
        this.basisController = basisController;
    }

    @Override
    public void initialisiereModel(DruckansichtModel model) {

        this.basisController.getMaskenModelZuController().getSeitentoolbarModel().setAnzeigen(true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<DruckansichtModel> getMaskenModelKlasseZuController() {
        return DruckansichtModel.class;
    }

}
