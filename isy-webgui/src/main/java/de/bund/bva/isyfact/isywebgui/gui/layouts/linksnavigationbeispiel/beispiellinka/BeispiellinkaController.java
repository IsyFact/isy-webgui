package de.bund.bva.isyfact.isywebgui.gui.layouts.linksnavigationbeispiel.beispiellinka;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 * Der Controller für den Beispiellink B.
 *
 */
@Controller
public class BeispiellinkaController extends AbstractGuiController<BeispiellinkaModel> {

    @Override
    public void initialisiereModel(BeispiellinkaModel model) {
        // Hier ist nichts zu tun
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<BeispiellinkaModel> getMaskenModelKlasseZuController() {
        return BeispiellinkaModel.class;
    }
}
