package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.datepicker;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

@Controller
public class DatepickerBeispieleController extends AbstractGuiController<DatepickerBeispieleModel> {
    @Override
    protected Class<DatepickerBeispieleModel> getMaskenModelKlasseZuController() {
        return DatepickerBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(DatepickerBeispieleModel model) {
    }

}
