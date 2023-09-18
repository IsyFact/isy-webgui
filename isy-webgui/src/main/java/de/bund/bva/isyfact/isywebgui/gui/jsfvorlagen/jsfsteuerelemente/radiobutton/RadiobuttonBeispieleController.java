package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.radiobutton;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

@Controller
public class RadiobuttonBeispieleController extends AbstractGuiController<RadiobuttonBeispieleModel> {
    @Override
    protected Class<RadiobuttonBeispieleModel> getMaskenModelKlasseZuController() {
        return RadiobuttonBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(RadiobuttonBeispieleModel model) {
        // Optionen der RadioButtonListe
        List<SelectItem> selectItems = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            selectItems.add(new SelectItem(String.valueOf(i), "Item " + i));
        }
        model.setRadioButtonListe(selectItems);
    }

}
