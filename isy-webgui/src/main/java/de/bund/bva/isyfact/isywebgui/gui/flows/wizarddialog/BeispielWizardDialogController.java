package de.bund.bva.isyfact.isywebgui.gui.flows.wizarddialog;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.GlobalFlowController;
import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogController;
import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogModel;
import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogPage;
import de.bund.bva.isyfact.common.web.validation.ValidationMessage;


/**
 * An example controller.
 *
 */
@Controller
public class BeispielWizardDialogController extends WizardDialogController {

    /** An ID of the wizard page. */
    private static final String ID_PAGE_1 = "1";

    /** An ID of the wizard page. */
    private static final String ID_PAGE_2 = "2";

    /** An ID of the wizard page. */
    private static final String ID_PAGE_3 = "3";

    /** An ID of the wizard page. */
    private static final String ID_PAGE_4 = "4";

    /** A title of the wizard page. */
    private static final String TITLE_PAGE_1 = "Seite 1";

    /** A title of the wizard page. */
    private static final String TITLE_PAGE_2 = "Seite 2";

    /** A title of the wizard page. */
    private static final String TITLE_PAGE_3 = "Seite 3";

    /** A title of the wizard page. */
    private static final String TITLE_PAGE_4 = "Seite 4";

    /** The global flow controller. */
    private GlobalFlowController globalFlowController;

    @Autowired
    public BeispielWizardDialogController(GlobalFlowController globalFlowController) {
        this.globalFlowController = globalFlowController;
    }

    /**
     * Initialises the wizard.
     * @param model
     *        The model.
     */
    public void initializeWizard(WizardModel model) {

        // FocusOnload activate
        this.globalFlowController.getMaskenModelZuController().setFocusOnloadActive(true);

        if (model.getWizardDialogModel().getWizardDialogPages().isEmpty()) {

            // Delete old data
            model.getWizardDialogModel().getWizardDialogPages().clear();

            // Load dialogue
            model.getWizardDialogModel().getWizardDialogPages().add(new WizardPage1(ID_PAGE_1, TITLE_PAGE_1));
            model.getWizardDialogModel().getWizardDialogPages().add(new WizardPage2(ID_PAGE_2, TITLE_PAGE_2));
            model.getWizardDialogModel().getWizardDialogPages().add(new WizardPage3(ID_PAGE_3, TITLE_PAGE_3));
            model.getWizardDialogModel().getWizardDialogPages().add(new WizardPage4(ID_PAGE_4, TITLE_PAGE_4));

            // Set default behaviour
            super.initializeDefaultPages(model.getWizardDialogModel());

            List<SelectItem> selectItems = new ArrayList<>();
            for (int i = 0; i <= 10; i++) {
                selectItems.add(new SelectItem(String.valueOf(i), "Item " + i));
            }
            model.setDropdownAuswahlListe(selectItems);

            model.setInitialisiert(true);
        } else if (model.getWizardDialogModel().getNextActiveWizardDialogPageId() != null) {

            // Set active page
            model.getWizardDialogModel()
                .setActiveWizardDialogPageId(model.getWizardDialogModel().getNextActiveWizardDialogPageId());

            // Write validation errors if required
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

        // Here follows the application logic

        // Show validation error on first page
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
}
