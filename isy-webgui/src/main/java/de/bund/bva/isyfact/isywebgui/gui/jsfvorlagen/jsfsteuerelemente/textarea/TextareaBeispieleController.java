package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.textarea;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

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
