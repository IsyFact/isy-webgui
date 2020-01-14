package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.aktionseingabe;

import com.google.common.base.Strings;
import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import org.springframework.stereotype.Controller;

@Controller
public class AktionseingabeBeispieleController extends AbstractGuiController<AktionseingabeBeispieleModel> {
    @Override
    protected Class<AktionseingabeBeispieleModel> getMaskenModelKlasseZuController() {
        return AktionseingabeBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(AktionseingabeBeispieleModel model) {

    }

    public void actionInputAction(AktionseingabeBeispieleModel model) {
        model.setActionInputResult("Eingabe:" + Strings.nullToEmpty(model.getActionInputResult()));
    }

    public void formActionInputAction(AktionseingabeBeispieleModel model) {
        model.setFormActionInputResult("Eingabe:" + Strings.nullToEmpty(model.getFormActionInputResult()));
    }
}
