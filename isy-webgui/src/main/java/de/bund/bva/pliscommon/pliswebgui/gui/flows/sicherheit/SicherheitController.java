package de.bund.bva.pliscommon.pliswebgui.gui.flows.sicherheit;

import org.springframework.beans.factory.annotation.Required;

import com.google.common.base.Joiner;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.pliscommon.aufrufkontext.AufrufKontext;
import de.bund.bva.pliscommon.aufrufkontext.AufrufKontextVerwalter;

/**
 * Controller für die Sicherheit.
 *
 * @author Capgemini, Tobias Groeger
 * @version $Id: SicherheitController.java 130053 2015-02-10 12:46:06Z sdm_tgroeger $
 */
public class SicherheitController extends AbstractGuiController<SicherheitModel> {
    /**
     * Der AufrufKontextVerwalter.
     */
    private AufrufKontextVerwalter<AufrufKontext> aufrufKontextVerwalter;

    @Override
    public void initialisiereModel(SicherheitModel model) {

        model.setBenutzername(this.aufrufKontextVerwalter.getAufrufKontext()
            .getDurchfuehrenderSachbearbeiterName());
        model.setKennung(this.aufrufKontextVerwalter.getAufrufKontext()
            .getDurchfuehrenderBenutzerInterneKennung());
        model.setLogin(this.aufrufKontextVerwalter.getAufrufKontext().getDurchfuehrenderBenutzerKennung());
        model.setRollen(Joiner.on(", ").join(this.aufrufKontextVerwalter.getAufrufKontext().getRolle()));

    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<SicherheitModel> getMaskenModelKlasseZuController() {
        return SicherheitModel.class;
    }

    @Required
    public void setAufrufKontextVerwalter(AufrufKontextVerwalter<AufrufKontext> aufrufKontextVerwalter) {
        this.aufrufKontextVerwalter = aufrufKontextVerwalter;
    }

}