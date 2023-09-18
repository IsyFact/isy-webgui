package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.tooltip;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

@Controller
public class TooltipBeispieleController extends AbstractGuiController<TooltipBeispieleModel> {

    @Override
    protected Class<TooltipBeispieleModel> getMaskenModelKlasseZuController() {
        return TooltipBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(TooltipBeispieleModel model) {
    }
}
