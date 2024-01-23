package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

@Controller
public class ListeBeispieleController extends AbstractGuiController<ListeBeispieleModel> {

    @Override
    protected Class<ListeBeispieleModel> getMaskenModelKlasseZuController() {
        return ListeBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(ListeBeispieleModel model) {
        List<String> dummyData = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4");
        model.setFormSelectListInhalt(dummyData);

        //Vorauswahl zu Gui-Demo-Zwecken
        model.setListAuswahlSelectOne1(dummyData.get(0)); //oder nicht initialisiert
        model.setListAuswahlSelectOne2(dummyData.get(1));
        model.setListAuswahlSelectOne3(dummyData.get(2));
        model.setListAuswahlSelectOne4(dummyData.get(3));

        //Vorauswahl für SelectMany, muss mindestens mit leerer Liste initialisiert sein
        model.setListAuswahlSelectMany1(new ArrayList<>());
        model.setListAuswahlSelectMany2(new ArrayList<>(dummyData.subList(0, 2)));
        model.setListAuswahlSelectMany3(new ArrayList<>(dummyData.subList(0, 2)));
        model.setListAuswahlSelectMany4(new ArrayList<>(dummyData.subList(1, 3)));
    }
}
