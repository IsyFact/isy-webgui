package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.textarea;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import org.springframework.stereotype.Controller;

@Controller
public class TextareaBeispieleController extends AbstractGuiController<TextareaBeispieleModel> {
    @Override
    protected Class<TextareaBeispieleModel> getMaskenModelKlasseZuController() {
        return TextareaBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(TextareaBeispieleModel model) {

    }
}
