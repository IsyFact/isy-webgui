package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.tab;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import org.springframework.stereotype.Controller;

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
