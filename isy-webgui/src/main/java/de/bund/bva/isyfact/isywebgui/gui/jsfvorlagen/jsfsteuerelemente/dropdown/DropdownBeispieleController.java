package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.dropdown;

import java.util.ArrayList;
import java.util.List;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import org.springframework.stereotype.Controller;

@Controller
public class DropdownBeispieleController extends AbstractGuiController<DropdownBeispieleModel> {
    @Override
    protected Class<DropdownBeispieleModel> getMaskenModelKlasseZuController() {
        return DropdownBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(DropdownBeispieleModel model) {
        // Dropdown
        List<SelectItem> selectItems = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            selectItems.add(new SelectItem(String.valueOf(i), "Item " + i));
        }
        model.setDropdownAuswahlListe(selectItems);
    }

    public void dropdownWertAusgewaehlt(ValueChangeEvent event) throws AbortProcessingException {
        getMaskenModelZuController().setDropdownAuswahlAjax(String.valueOf(event.getNewValue()));
    }

}
