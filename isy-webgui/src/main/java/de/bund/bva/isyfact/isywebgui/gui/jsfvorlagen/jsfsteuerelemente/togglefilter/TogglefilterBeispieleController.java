package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.togglefilter;

import java.util.ArrayList;
import javax.faces.model.SelectItem;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import org.springframework.stereotype.Controller;

@Controller
public class TogglefilterBeispieleController extends AbstractGuiController<TogglefilterBeispieleModel> {

    @Override
    protected Class<TogglefilterBeispieleModel> getMaskenModelKlasseZuController() {
        return TogglefilterBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(TogglefilterBeispieleModel model) {

        ArrayList<SelectItem> selectItems = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            SelectItem selectItem = new SelectItem(String.valueOf(i), "Filter " + i);
            if (i == 4) {
                selectItem.setDisabled(true);
            }

            selectItems.add(selectItem);
        }
        model.setToggleFilterListe(selectItems);
        model.setToggleFilterAuswahl("3");

    }
}
