package de.bund.bva.pliscommon.pliswebgui.gui.layouts.applikationdetailseite;

import org.springframework.beans.factory.annotation.Required;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.layout.BasisController;
import de.bund.bva.isyfact.common.web.layout.BasisModel;
import de.bund.bva.isyfact.common.web.layout.IconTyp;
import de.bund.bva.isyfact.common.web.layout.InformationsbereichModel;

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
            .setInhalt("Lorem Ipsum Dorlro askjdbn anslnknsad alsjdnljnljnsd asd sjkad as das das da d as."
                + "Lorem Ipsum Dorlro askjdbn anslnknsad alsjdnljnljnsd asd sjkad as das das da d as. Lorem"
                + "Ipsum Dorlro askjdbn anslnknsad alsjdnljnljnsd asd sjkad as das das da d as. Lorem Ipsum"
                + "Dorlro askjdbn anslnknsad alsjdnljnljnsd asd sjkad as das das da d as. Lorem Ipsum Dorlro"
                + "askjdbn anslnknsad alsjdnljnljnsd asd sjkad as das das da d as. Lorem Ipsum Dorlro"
                + "askjdbn anslnknsad alsjdnljnljnsd asd sjkad as das das da d as. Lorem Ipsum Dorlro"
                + "askjdbn anslnknsad alsjdnljnljnsd asd sjkad as das das da d as.");
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
