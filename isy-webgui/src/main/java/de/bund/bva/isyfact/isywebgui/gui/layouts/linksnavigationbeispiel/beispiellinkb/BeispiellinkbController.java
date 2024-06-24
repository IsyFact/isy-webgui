package de.bund.bva.isyfact.isywebgui.gui.layouts.linksnavigationbeispiel.beispiellinkb;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 * Der Controller für den Beispiellink B.
 *
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
