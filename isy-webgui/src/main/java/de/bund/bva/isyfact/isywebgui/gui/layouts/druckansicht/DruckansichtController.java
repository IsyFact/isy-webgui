package de.bund.bva.isyfact.isywebgui.gui.layouts.druckansicht;

import org.springframework.beans.factory.annotation.Required;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.layout.BasisController;

/**
 * Der Controller für die Druckansicht.
 *
 * @author Capgemini, Tobias Gröger
 * @version $Id: DruckansichtController.java 164631 2016-05-11 12:16:09Z sdm_arichter $
 */
public class DruckansichtController extends AbstractGuiController<DruckansichtModel> {

    /**
     * Der Basis-Controller.
     */
    private BasisController basisController;

    @Override
    public void initialisiereModel(DruckansichtModel model) {

        this.basisController.getMaskenModelZuController().getSeitentoolbarModel().setAnzeigen(true);
        // TODO: Wie funktioniert das jetzt ?
        // this.basisController.getMaskenModelZuController().getSeitentoolbarModel().setZeigeDruckButton(true);
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
