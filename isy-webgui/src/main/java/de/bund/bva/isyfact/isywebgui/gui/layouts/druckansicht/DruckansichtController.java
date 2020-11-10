package de.bund.bva.isyfact.isywebgui.gui.layouts.druckansicht;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.layout.BasisController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Der Controller für die Druckansicht.
 *
 * @author Capgemini
 * @version $Id: DruckansichtController.java 164631 2016-05-11 12:16:09Z sdm_arichter $
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
