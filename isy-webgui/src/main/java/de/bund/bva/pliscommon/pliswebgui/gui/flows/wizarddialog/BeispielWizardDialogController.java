package de.bund.bva.pliscommon.pliswebgui.gui.flows.wizarddialog;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Required;

import de.bund.bva.isyfact.common.web.global.GlobalFlowController;
import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogController;
import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogModel;
import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogPage;
import de.bund.bva.isyfact.common.web.validation.ValidationMessage;

/**
 * Ein Beispielkontroller.
 *
 * @author Capgemini, Andreas Hoerning
 * @version $Id: BeispielWizardDialogController.java 135268 2015-04-27 12:19:05Z sdm_tgroeger $
 */
public class BeispielWizardDialogController extends WizardDialogController {

    /** Eine ID der Wizardseite. */
    private static final String ID_PAGE_1 = "1";

    /** Eine ID der Wizardseite. */
    private static final String ID_PAGE_2 = "2";

    /** Eine ID der Wizardseite. */
    private static final String ID_PAGE_3 = "3";

    /** Eine ID der Wizardseite. */
    private static final String ID_PAGE_4 = "4";

    /** Ein Titel der Wizardseite. */
    private static final String TITLE_PAGE_1 = "Seite 1";

    /** Ein Titel der Wizardseite. */
    private static final String TITLE_PAGE_2 = "Seite 2";

    /** Ein Titel der Wizardseite. */
    private static final String TITLE_PAGE_3 = "Seite 3";

    /** Ein Titel der Wizardseite. */
    private static final String TITLE_PAGE_4 = "Seite 4";

    /** Der globale Flow Controller. */
    private GlobalFlowController globalFlowController;

    /**
     * Initialisiert den Wizard.
     * @param model
     *        Das Model.
     */
    public void initializeWizard(WizardModel model) {

        // FocusOnload aktivieren
        this.globalFlowController.getMaskenModelZuController().setFocusOnloadActive(true);

        if (model.getWizardDialogModel().getWizardDialogPages().isEmpty()) {

            // Alte Daten löschen
            model.getWizardDialogModel().getWizardDialogPages().clear();

            // Dialog laden
            model.getWizardDialogModel().getWizardDialogPages().add(new WizardPage1(ID_PAGE_1, TITLE_PAGE_1));
            model.getWizardDialogModel().getWizardDialogPages().add(new WizardPage2(ID_PAGE_2, TITLE_PAGE_2));
            model.getWizardDialogModel().getWizardDialogPages().add(new WizardPage3(ID_PAGE_3, TITLE_PAGE_3));
            model.getWizardDialogModel().getWizardDialogPages().add(new WizardPage4(ID_PAGE_4, TITLE_PAGE_4));

            // Standardverhalten festlegen
            super.initializeDefaultPages(model.getWizardDialogModel());

            List<SelectItem> selectItems = new ArrayList<>();
            for (int i = 0; i <= 10; i++) {
                selectItems.add(new SelectItem(String.valueOf(i), "Item " + i));
            }
            model.setDropdownAuswahlListe(selectItems);

            model.setInitialisiert(true);
        } else if (model.getWizardDialogModel().getNextActiveWizardDialogPageId() != null) {

            // Aktive Seite setzen
            model.getWizardDialogModel()
                .setActiveWizardDialogPageId(model.getWizardDialogModel().getNextActiveWizardDialogPageId());

            // Bei Bedarf Validierungsfehler schreiben
            WizardDialogPage page = model.getWizardDialogModel().getActiveWizardDialogPage();
            if (page.getWizardDialogPageId().equals(ID_PAGE_1)) {
                if (!((WizardPage1) page).isPageSuccessful()) {
                    this.globalFlowController.getValidationController()
                        .processValidationMessages(((WizardPage1) page).getValidierungsfehler());
                }
            } else if (page.getWizardDialogPageId().equals(ID_PAGE_3)) {
                if (!((WizardPage3) page).isPageSuccessful()) {
                    this.globalFlowController.getValidationController()
                        .processValidationMessages(((WizardPage3) page).getValidierungsfehler());
                }
            }

            model.getWizardDialogModel().setNextActiveWizardDialogPageId(null);

        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean cancel(WizardDialogModel model) {

        model.getWizardDialogPages().clear();

        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean finish(WizardDialogModel model) {

        // Hier folgt die Anwendungslogik

        // Validierungsfehler auf erster Seite anzeigen
        WizardDialogPage page = model.getWizardDialogPage(ID_PAGE_1);
        page.setPageDone(true);
        page.setPageSuccessful(false);
        model.setActiveWizardDialogPageId(page.getWizardDialogPageId());
        WizardPage1 wp1 = (WizardPage1) page;
        wp1.getValidierungsfehler().add(new ValidationMessage("ABC", "person.nachname", "Nachname",
            "Das Feld enthält ungültige Zeichen."));
        wp1.getValidierungsfehler()
            .add(new ValidationMessage("ABC", null, null, "Das Feld enthält ungültige Zeichen."));

        this.globalFlowController.getValidationController()
            .processValidationMessages(wp1.getValidierungsfehler());

        page = model.getWizardDialogPage(ID_PAGE_2);
        page.setPageDone(true);
        page.setPageSuccessful(true);

        page = model.getWizardDialogPage(ID_PAGE_3);
        page.setPageDone(true);
        page.setPageSuccessful(false);
        WizardPage3 wp3 = (WizardPage3) page;
        wp3.getValidierungsfehler()
            .add(new ValidationMessage("ABC", null, null, "Das Feld enthält ungültige Zeichen."));

        page = model.getWizardDialogPage(ID_PAGE_4);
        page.setPageDone(true);
        page.setPageSuccessful(true);

        this.globalFlowController.getMessageController().writeException(new RuntimeException("Test"));

        return false;

    }

    @Required
    public void setGlobalFlowController(GlobalFlowController globalFlowController) {
        this.globalFlowController = globalFlowController;
    }
}
