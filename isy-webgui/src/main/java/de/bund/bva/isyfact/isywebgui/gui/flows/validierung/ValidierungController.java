package de.bund.bva.isyfact.isywebgui.gui.flows.validierung;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.GlobalFlowController;
import de.bund.bva.isyfact.common.web.validation.ValidationMessage;

/**
 * Controller für die Validierung.
 *
 */
@Controller
public class ValidierungController extends AbstractGuiController<ValidierungModel> {
    /**
     * Der GlobalFlowController.
     */
    private GlobalFlowController globalFlowController;

    @Autowired
    public ValidierungController(GlobalFlowController globalFlowController) {
        this.globalFlowController = globalFlowController;
    }

    @Override
    public void initialisiereModel(ValidierungModel model) {

        Person person = new Person();
        person.setNachname("Müller");
        person.setGeburtsdatum("12.03.2000");

        model.setPerson(person);
    }

    @Override
    protected Class<ValidierungModel> getMaskenModelKlasseZuController() {
        return ValidierungModel.class;
    }

    /**
     * Führt die Validierung durch.
     * @param model
     *            das ValidierungModel
     */
    public void fuehreValidierungDurch(ValidierungModel model) {

        // Hier kann eine vorgelagerte GUI-Validierung oder ein AWK-Aufruf stattfinden.

        // Beispiel Validierungsnachrichten erzeugen
        List<ValidationMessage> validationMessages = new ArrayList<>();
        validationMessages.add(new ValidationMessage("ABC", "person.nachname", "Nachname",
            "Das Feld enthält ungültige Zeichen."));
        validationMessages.add(new ValidationMessage("DAD", "person.geburtsdatum", "Geburtsdatum",
            "Kein gültiges Zeichen"));
        validationMessages.add(new ValidationMessage("CCC", "person.gefaehrlich", "Gefährliche Person",
            "Darf nicht leer sein"));
        validationMessages.add(new ValidationMessage("EEE", "person.geburtsstaat", "Geburtsstaat", "Falsch"));

        this.globalFlowController.getValidationController().processValidationMessages(validationMessages);
    }
}
