package de.bund.bva.isyfact.isywebgui.gui.flows.wizarddialog;

import java.util.List;

import javax.faces.model.SelectItem;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.listpicker.Listpickerangabe;
import de.bund.bva.isyfact.common.web.jsf.components.wizard.WizardDialogModel;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeStaatsangListpickerModel;

/**
 * Model für den Modalen Dialog.
 *
 * @author Capgemini
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

    /**
     * Auswahl des Dropdowns.
     */
    private String dropdownAuswahl;

    /**
     * Liste an Dropdown-Auswahlen.
     */
    private List<SelectItem> dropdownAuswahlListe;

    /**
     * Listpickermodel für den Staatsangehörigkeits-Listpicker.
     */
    private JsfSteuerelementeStaatsangListpickerModel staatsangListpickerModel;

    /**
     * Auswahl des Staatsangehörigkeits-Listpickers.
     */
    private Listpickerangabe staatsangListpickerAngabe;

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

    public String getDropdownAuswahl() {
        return this.dropdownAuswahl;
    }

    public void setDropdownAuswahl(String dropdownAuswahl) {
        this.dropdownAuswahl = dropdownAuswahl;
    }

    public List<SelectItem> getDropdownAuswahlListe() {
        return this.dropdownAuswahlListe;
    }

    public void setDropdownAuswahlListe(List<SelectItem> dropdownAuswahlListe) {
        this.dropdownAuswahlListe = dropdownAuswahlListe;
    }

    public JsfSteuerelementeStaatsangListpickerModel getStaatsangListpickerModel() {
        return this.staatsangListpickerModel;
    }

    public void setStaatsangListpickerModel(
        JsfSteuerelementeStaatsangListpickerModel staatsangListpickerModel) {
        this.staatsangListpickerModel = staatsangListpickerModel;
    }

    public Listpickerangabe getStaatsangListpickerAngabe() {
        return this.staatsangListpickerAngabe;
    }

    public void setStaatsangListpickerAngabe(Listpickerangabe staatsangListpickerAngabe) {
        this.staatsangListpickerAngabe = staatsangListpickerAngabe;
    }

}
