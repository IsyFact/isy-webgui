package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.vieraugen;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

@Controller
public class VierAugenBeispieleController extends AbstractGuiController<VierAugenBeispieleModel> {

    @Override
    protected Class<VierAugenBeispieleModel> getMaskenModelKlasseZuController() {
        return VierAugenBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(VierAugenBeispieleModel model) {
        // Dropdown
        List<SelectItem> selectItems = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            selectItems.add(new SelectItem(String.valueOf(i), "Item " + i));
        }
        model.setDropdownAuswahlListe(selectItems);
    }

    public void actionInputAction(VierAugenBeispieleModel model) {
        model.setActionInputResult("Aktion ausgelöst");
    }
}
