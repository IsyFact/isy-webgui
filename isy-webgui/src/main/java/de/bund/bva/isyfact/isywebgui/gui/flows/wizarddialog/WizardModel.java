package de.bund.bva.isyfact.isywebgui.gui.flows.wizarddialog;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogModel;

/**
 * Model für den Modalen Dialog.
 *
 * @author Capgemini, Tobias Groeger
 * @version $Id: WizardModel.java 134241 2015-04-09 14:37:26Z sdm_ahoerning $
 */
public class WizardModel extends AbstractMaskenModel {

    /**
     * Die Serial-Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Ob die Wizardinitialisierung bereits durchgeführt wurde.
     */
    private boolean initialisiert;

    /**
     * Das Model für den Wizard.
     */
    private WizardDialogModel wizardDialogModel;

    public WizardDialogModel getWizardDialogModel() {
        return this.wizardDialogModel;
    }

    public void setWizardDialogModel(WizardDialogModel wizardDialogModel) {
        this.wizardDialogModel = wizardDialogModel;
    }

    public boolean isInitialisiert() {
        return this.initialisiert;
    }

    public void setInitialisiert(boolean initialisiert) {
        this.initialisiert = initialisiert;
    }

}
