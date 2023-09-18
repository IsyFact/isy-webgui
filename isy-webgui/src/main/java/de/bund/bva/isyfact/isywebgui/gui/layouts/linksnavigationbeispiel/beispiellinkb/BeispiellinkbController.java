package de.bund.bva.isyfact.isywebgui.gui.layouts.linksnavigationbeispiel.beispiellinkb;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 * Der Controller für den Beispiellink B.
 *
 * @author Capgemini
 * @version $Id: BeispiellinkbController.java 130047 2015-02-10 10:52:10Z sdm_tgroeger $
 */
@Controller
public class BeispiellinkbController extends AbstractGuiController<BeispiellinkbModel> {

    @Override
    public void initialisiereModel(BeispiellinkbModel model) {
        // Hier ist nichts zu tun
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<BeispiellinkbModel> getMaskenModelKlasseZuController() {
        return BeispiellinkbModel.class;
    }
}
