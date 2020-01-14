package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.checkbox;

import java.util.ArrayList;
import java.util.List;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import com.google.common.collect.Lists;
import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import org.springframework.stereotype.Controller;

@Controller
public class CheckboxBeispieleController extends AbstractGuiController<CheckboxBeispieleModel> {
    @Override
    protected Class<CheckboxBeispieleModel> getMaskenModelKlasseZuController() {
        return CheckboxBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(CheckboxBeispieleModel model) {
        // Checkbox
        List<SelectItem> selectItems = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {

            SelectItem selectItem = new SelectItem(String.valueOf(i), "CB " + i);

            if (i == 4) {
                selectItem.setDisabled(true);
            }

            selectItems.add(selectItem);
        }
        model.setCheckboxAuswahl(Lists.newArrayList("4"));
        model.setCheckboxListe(selectItems);
    }

    public void checkboxAusgewaehlt(ValueChangeEvent event) throws AbortProcessingException {
        getMaskenModelZuController()
            .setCheckboxBooleanNeuerWert(event.getComponent().getClientId() + ": " + event.getNewValue());
    }

    public void checkboxBooleanGeklickt(AjaxBehaviorEvent event) {
        getMaskenModelZuController().setCheckboxBooleanGeklicktAnzahl(
            getMaskenModelZuController().getCheckboxBooleanGeklicktAnzahl() + 1);
    }

}
