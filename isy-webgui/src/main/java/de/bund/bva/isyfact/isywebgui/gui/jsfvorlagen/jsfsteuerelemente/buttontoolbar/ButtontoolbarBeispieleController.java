package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.buttontoolbar;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

@Controller
public class ButtontoolbarBeispieleController extends AbstractGuiController<ButtontoolbarBeispieleModel> {

    @Override
    protected Class<ButtontoolbarBeispieleModel> getMaskenModelKlasseZuController() {
        return ButtontoolbarBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(ButtontoolbarBeispieleModel model) {
    }
}
