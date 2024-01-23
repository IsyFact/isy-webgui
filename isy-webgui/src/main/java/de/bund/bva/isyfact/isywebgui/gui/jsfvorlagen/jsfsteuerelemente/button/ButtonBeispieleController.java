package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.button;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

@Controller
public class ButtonBeispieleController extends AbstractGuiController<ButtonBeispieleModel> {

    @Override
    protected Class<ButtonBeispieleModel> getMaskenModelKlasseZuController() {
        return ButtonBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(ButtonBeispieleModel model) {
    }

    /**
     * Führt eine Action auf dem Button aus.
     *
     * @param model das Model
     */
    public void buttonAction(ButtonBeispieleModel model) {
        model.setButtonActionResult("Aktion auf Button ausgeführt");
    }

    /**
     * Führt eine Action auf dem block-Button aus.
     *
     * @param model das Model
     */
    public void blockButtonAction(ButtonBeispieleModel model) {
        model.setBlockButtonActionResult("Aktion auf BlockButton ausgeführt");
    }
}
