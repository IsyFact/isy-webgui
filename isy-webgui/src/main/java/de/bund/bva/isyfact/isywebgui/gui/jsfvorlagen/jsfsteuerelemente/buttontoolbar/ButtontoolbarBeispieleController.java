package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.buttontoolbar;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import org.springframework.stereotype.Controller;

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
