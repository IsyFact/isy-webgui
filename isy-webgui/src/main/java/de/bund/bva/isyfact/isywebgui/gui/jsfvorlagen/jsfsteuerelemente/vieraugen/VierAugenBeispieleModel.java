package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.vieraugen;

import java.util.List;

import javax.faces.model.SelectItem;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class VierAugenBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelFourEyesIconPanel = new PanelModel(true);

    /** formInput. **/
    private String formInputTextButtonActionResult;

    /** actionInput. **/
    private String actionInputResult;

    /** Datumseingabe. **/
    private String datum;

    /** Textarea. **/
    private String textBoxButtonActionResult;

    /** Alle Dropdown-Optionen. **/
    private List<SelectItem> dropdownAuswahlListe;

    /** Ausgewähltes Element. **/
    private String dropdownAuswahl;

    /**
     * Checkbox ausgewählt oder nicht.
     */
    private boolean checkboxBoolean1;

    /**
     * Checkbox ausgewählt oder nicht.
     */
    private boolean checkboxBoolean2;


    public PanelModel getPanelModelFourEyesIconPanel() {
        return panelModelFourEyesIconPanel;
    }

    public void setPanelModelFourEyesIconPanel(PanelModel panelModelFourEyesIconPanel) {
        this.panelModelFourEyesIconPanel = panelModelFourEyesIconPanel;
    }

    public String getFormInputTextButtonActionResult() {
        return formInputTextButtonActionResult;
    }

    public void setFormInputTextButtonActionResult(String formInputTextButtonActionResult) {
        this.formInputTextButtonActionResult = formInputTextButtonActionResult;
    }

    public String getActionInputResult() {
        return actionInputResult;
    }

    public void setActionInputResult(String actionInputResult) {
        this.actionInputResult = actionInputResult;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getTextBoxButtonActionResult() {
        return textBoxButtonActionResult;
    }

    public void setTextBoxButtonActionResult(String textBoxButtonActionResult) {
        this.textBoxButtonActionResult = textBoxButtonActionResult;
    }

    public List<SelectItem> getDropdownAuswahlListe() {
        return dropdownAuswahlListe;
    }

    public void setDropdownAuswahlListe(List<SelectItem> dropdownAuswahlListe) {
        this.dropdownAuswahlListe = dropdownAuswahlListe;
    }

    public String getDropdownAuswahl() {
        return dropdownAuswahl;
    }

    public void setDropdownAuswahl(String dropdownAuswahl) {
        this.dropdownAuswahl = dropdownAuswahl;
    }

    public boolean isCheckboxBoolean1() {
        return checkboxBoolean1;
    }

    public void setCheckboxBoolean1(boolean checkboxBoolean1) {
        this.checkboxBoolean1 = checkboxBoolean1;
    }

    public boolean isCheckboxBoolean2() {
        return checkboxBoolean2;
    }

    public void setCheckboxBoolean2(boolean checkboxBoolean2) {
        this.checkboxBoolean2 = checkboxBoolean2;
    }
}
