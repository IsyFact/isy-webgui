package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.tab;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

@Controller
public class TabBeispieleController extends AbstractGuiController<TabBeispieleModel> {
    @Override
    protected Class<TabBeispieleModel> getMaskenModelKlasseZuController() {
        return TabBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(TabBeispieleModel model) {
        // Tabs (Maske JsfSteuerelemente: Tab [Vollauskunft|Personalien|Sachverhalte])
        JsfSteuerelementeAuskunftTabModel auskunftTabModel = new JsfSteuerelementeAuskunftTabModel();
        auskunftTabModel.setCurrentTab("V");
        model.setAuskunftTabModel(auskunftTabModel);
    }

}
