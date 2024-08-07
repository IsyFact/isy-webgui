package de.bund.bva.isyfact.isywebgui.gui.layouts.formulare;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 * Controller für Formulare.
 *
 */
@Controller
public class FormulareController extends AbstractGuiController<FormulareModel> {

    @Override
    public void initialisiereModel(FormulareModel model) {
        Formular formular = new Formular();
        formular.setFormularFeld1("Inhalt 1");
        formular.setFormularFeld2("Inhalt 2");
        formular.setFormularFeld3("Inhalt 3");
        formular.setFormularFeld4("Inhalt 4");
        formular.setFormularFeld5("Inhalt 5");
        formular.setFormularFeld6("Inhalt 6");
        formular.setFormularFeld7("Inhalt 7");
        formular.setFormularFeld8("Inhalt 8");

        model.setFormular(formular);

    }

    @Override
    protected Class<FormulareModel> getMaskenModelKlasseZuController() {
        return FormulareModel.class;
    }

}
