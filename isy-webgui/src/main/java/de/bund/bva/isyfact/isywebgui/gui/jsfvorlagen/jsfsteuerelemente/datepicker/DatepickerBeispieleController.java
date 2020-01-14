package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.datepicker;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import org.springframework.stereotype.Controller;

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
