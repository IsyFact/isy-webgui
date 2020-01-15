package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.browsecollect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import org.springframework.stereotype.Controller;

@Controller
public class BrowseAndCollectBeispieleController extends AbstractGuiController<BrowseAndCollectBeispieleModel> {

    @Override
    protected Class<BrowseAndCollectBeispieleModel> getMaskenModelKlasseZuController() {
        return BrowseAndCollectBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(BrowseAndCollectBeispieleModel model) {
        List<String> dummyData = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4");
        model.setFormSelectListInhalt(dummyData);

        //Vorauswahl für BrowseAndSelect, muss mindestens mit leerer Liste initialisiert sein
        model.setBrowseAndCollectAuswahl(new ArrayList<>());
        model.setBrowseAndCollectAuswahl2(new ArrayList<>(dummyData.subList(0, 2)));
    }
}
