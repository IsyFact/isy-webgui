package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.eingabefeld;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

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
