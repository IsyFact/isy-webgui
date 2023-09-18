package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 * Controller für die JSF-Steuerelemente.
 *
 * @author Capgemini
 * @version $Id: JsfSteuerelementeController.java 166449 2016-06-06 12:15:53Z sdm_arichter $
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

