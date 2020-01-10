package de.bund.bva.isyfact.isywebgui.gui.layouts.applikationdetailseite;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.layout.BasisController;
import de.bund.bva.isyfact.common.web.layout.BasisModel;
import de.bund.bva.isyfact.common.web.layout.IconTyp;
import de.bund.bva.isyfact.common.web.layout.InformationsbereichModel;
import de.bund.bva.isyfact.common.web.layout.LocationBreadcrumbModel;
import org.springframework.beans.factory.annotation.Required;

/**
 * Der Controller für die ApplikationDetailseite.
 *
 * @author Capgemini, Tobias Gröger
 * @version $Id: ApplikationDetailseiteController.java 130053 2015-02-10 12:46:06Z sdm_tgroeger $
 */
public class ApplikationDetailseiteController extends AbstractGuiController<ApplikationDetailseiteModel> {
    /**
     * Der Basis-Controller.
     */
    private BasisController basisController;

    @Override
    public void initialisiereModel(ApplikationDetailseiteModel model) {

        // Seitenelemente initialisieren
        initialisiereInformationsbereich();
    }

    public void initialisiereBreadcrumbModel(LocationBreadcrumbModel model) {
        model.setObjektname("Testobjekt / ID-1234");
        model.pushHierarchiebene("Ebene 1");
        model.pushHierarchiebene("Ebene 2");
    }

    /**
     * Initialisiert den Informationsbreich seitenspezifisch.
     */
    private void initialisiereInformationsbereich() {
        // Informationsbereich
        BasisModel basisModel = this.basisController.getMaskenModelZuController();
        InformationsbereichModel informationsbereichModel = basisModel.getInformationsbereichModel();
        informationsbereichModel.setAnzeigen(true);
        informationsbereichModel.setIconTyp(IconTyp.INFO);
        informationsbereichModel
            .setInhalt("Lorem ipsum dolor sit amet, consectetur adipisici elit, sed eiusmod tempor incidunt"
                + " ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation"
                + " ullamco laboris nisi ut aliquid ex ea commodi consequat. Quis aute iure reprehenderit in"
                + " voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint obcaecat"
                + " cupiditat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        informationsbereichModel.setUeberschrift("Normal");
        informationsbereichModel.setUeberschrift_2("Message");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<ApplikationDetailseiteModel> getMaskenModelKlasseZuController() {
        return ApplikationDetailseiteModel.class;
    }

    @Required
    public void setBasisController(BasisController basisController) {
        this.basisController = basisController;
    }

}
