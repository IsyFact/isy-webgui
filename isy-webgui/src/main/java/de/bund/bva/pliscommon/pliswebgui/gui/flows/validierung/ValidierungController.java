package de.bund.bva.pliscommon.pliswebgui.gui.flows.validierung;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.global.GlobalFlowController;
import de.bund.bva.isyfact.common.web.validation.ValidationMessage;

/**
 * Controller für die Validierung.
 *
 * @author Capgemini, Tobias Groeger
 * @version $Id: ValidierungController.java 130053 2015-02-10 12:46:06Z sdm_tgroeger $
 */
public class ValidierungController extends AbstractGuiController<ValidierungModel> {
    /**
     * Der GlobalFlowController.
     */
    private GlobalFlowController globalFlowController;

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

    @Required
    public void setGlobalFlowController(GlobalFlowController globalFlowController) {
        this.globalFlowController = globalFlowController;
    }
}
