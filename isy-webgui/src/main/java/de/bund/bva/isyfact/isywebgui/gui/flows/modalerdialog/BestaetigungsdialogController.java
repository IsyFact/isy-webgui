package de.bund.bva.isyfact.isywebgui.gui.flows.modalerdialog;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 * Controller für den Bestätigungsdialog.
 */
@Controller
public class BestaetigungsdialogController extends AbstractGuiController<BestaetigungsdialogModel> {

    @Override
    protected Class<BestaetigungsdialogModel> getMaskenModelKlasseZuController() {
        return BestaetigungsdialogModel.class;
    }

    @Override
    public void initialisiereModel(BestaetigungsdialogModel model) {
        model.setGetroffeneEntscheidung("Der Dialog wurde bisher nicht geöffnet.");
    }

    public void bestaetige(BestaetigungsdialogModel model) {
        model.setGetroffeneEntscheidung("Bestätigt.");
    }

    public void abbrechen(BestaetigungsdialogModel model) {
        model.setGetroffeneEntscheidung("Abgebrochen.");
    }

}
