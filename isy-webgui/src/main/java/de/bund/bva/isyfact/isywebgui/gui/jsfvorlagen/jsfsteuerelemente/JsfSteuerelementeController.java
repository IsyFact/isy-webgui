package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 * Controller für die JSF-Steuerelemente.
 *
 */
@Controller
public class JsfSteuerelementeController extends AbstractGuiController<JsfSteuerelementeModel> {

    @Override
    protected Class<JsfSteuerelementeModel> getMaskenModelKlasseZuController() {
        return JsfSteuerelementeModel.class;
    }

    @Override
    public void initialisiereModel(JsfSteuerelementeModel model) {

    }
}

