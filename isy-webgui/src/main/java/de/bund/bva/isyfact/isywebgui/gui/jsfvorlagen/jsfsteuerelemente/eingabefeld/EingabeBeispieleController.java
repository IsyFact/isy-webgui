package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.eingabefeld;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import org.springframework.stereotype.Controller;

@Controller
public class EingabeBeispieleController extends AbstractGuiController<EingabeBeispieleModel> {
    @Override
    protected Class<EingabeBeispieleModel> getMaskenModelKlasseZuController() {
        return EingabeBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(EingabeBeispieleModel model) {

    }
}
