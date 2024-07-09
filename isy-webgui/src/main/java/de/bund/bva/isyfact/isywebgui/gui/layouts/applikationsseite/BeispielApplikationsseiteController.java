package de.bund.bva.isyfact.isywebgui.gui.layouts.applikationsseite;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 * Der Controller für die Maske.
 *
 */
@Controller
public class BeispielApplikationsseiteController extends AbstractGuiController<BeispielApplikationsseiteModel> {

    @Override
    public void initialisiereModel(BeispielApplikationsseiteModel model) {
        // Nichts zu tun
    }

    @Override
    protected Class<BeispielApplikationsseiteModel> getMaskenModelKlasseZuController() {
        return BeispielApplikationsseiteModel.class;
    }

}
