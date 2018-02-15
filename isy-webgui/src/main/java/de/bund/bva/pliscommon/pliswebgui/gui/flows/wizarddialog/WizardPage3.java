package de.bund.bva.pliscommon.pliswebgui.gui.flows.wizarddialog;

import java.util.ArrayList;
import java.util.List;

import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogPage;
import de.bund.bva.isyfact.common.web.validation.ValidationMessage;

/**
 * Eine Beispielseite.
 * @author Capgemini, Andreas Hoerning
 * @version $Id: WizardPage3.java 135254 2015-04-27 10:42:55Z sdm_tgroeger $
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
