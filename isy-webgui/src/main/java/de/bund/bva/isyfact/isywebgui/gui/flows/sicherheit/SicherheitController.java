package de.bund.bva.isyfact.isywebgui.gui.flows.sicherheit;

import de.bund.bva.isyfact.aufrufkontext.AufrufKontext;
import de.bund.bva.isyfact.aufrufkontext.AufrufKontextVerwalter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.google.common.base.Joiner;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import org.springframework.stereotype.Controller;

/**
 * Controller für die Sicherheit.
 *
 * @author Capgemini, Tobias Groeger
 * @version $Id: SicherheitController.java 130053 2015-02-10 12:46:06Z sdm_tgroeger $
 */
@Controller
public class SicherheitController extends AbstractGuiController<SicherheitModel> {
    /**
     * Der AufrufKontextVerwalter.
     */
    private AufrufKontextVerwalter<AufrufKontext> aufrufKontextVerwalter;

    @Autowired
    public SicherheitController(AufrufKontextVerwalter<AufrufKontext> aufrufKontextVerwalter) {
        this.aufrufKontextVerwalter = aufrufKontextVerwalter;
    }

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

}
