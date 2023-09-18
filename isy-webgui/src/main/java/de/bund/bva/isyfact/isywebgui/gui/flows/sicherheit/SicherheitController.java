package de.bund.bva.isyfact.isywebgui.gui.flows.sicherheit;

import com.google.common.base.Joiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.security.core.Berechtigungsmanager;

/**
 * Controller for security.
 *
 * @author Capgemini
 * @version $Id: SicherheitController.java 130053 2015-02-10 12:46:06Z sdm_tgroeger $
 */
@Controller
public class SicherheitController extends AbstractGuiController<SicherheitModel> {

    /**
     * Berechtigungsmanager bean.
     */
    private final Berechtigungsmanager berechtigungsmanager;

    @Autowired
    public SicherheitController(Berechtigungsmanager berechtigungsmanager) {
        this.berechtigungsmanager = berechtigungsmanager;
    }

    @Override
    public void initialisiereModel(SicherheitModel model) {
        model.setBenutzername((String) berechtigungsmanager.getTokenAttribute("name"));
        model.setKennung((String) berechtigungsmanager.getTokenAttribute("internekennung"));
        model.setLogin((String) berechtigungsmanager.getTokenAttribute("preferred_username"));
        model.setRollen(Joiner.on(", ").join(berechtigungsmanager.getRollen()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<SicherheitModel> getMaskenModelKlasseZuController() {
        return SicherheitModel.class;
    }

}
