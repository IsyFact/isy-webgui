package de.bund.bva.isyfact.isywebgui.gui.flows.wizarddialog;

import java.util.ArrayList;
import java.util.List;

import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogPage;
import de.bund.bva.isyfact.common.web.validation.ValidationMessage;

/**
 * Eine Beispielseite.
 */
public class WizardPage3 extends WizardDialogPage {

    /**
     * Die Serial-Version-UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Enthält Validierungsfehler.
     */
    private List<ValidationMessage> validierungsfehler = new ArrayList<>();

    /**
     * Konstruktor.
     * @param wizardDialogPageId
     *            Die Id des Dialogs.
     * @param title
     *            Titel der Seite.
     */
    public WizardPage3(String wizardDialogPageId, String title) {
        super(wizardDialogPageId, title);
    }

    public List<ValidationMessage> getValidierungsfehler() {
        return this.validierungsfehler;
    }

    public void setValidierungsfehler(List<ValidationMessage> validierungsfehler) {
        this.validierungsfehler = validierungsfehler;
    }

}
