package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.dropdown;

import java.util.List;
import javax.faces.model.SelectItem;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class DropdownBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelDropdown = new PanelModel(true);

    /** Liste an Dropdown-Auswahlen. */
    private List<SelectItem> dropdownAuswahlListe;

    /** Auswahl des Dropdowns nach Absenden des Forms. */
    private String dropdownAuswahl;

    /** Aktuell ausgewählter Wert. */
    private String dropdownAuswahlAjax;

    /** Auswahl des disabled Dropdowns. */
    private String disabledDropdownAuswahl;

    /** Auswahl des readonly Dropdowns. */
    private String readonlyDropdownAuswahl;

    public PanelModel getPanelModelDropdown() {
        return panelModelDropdown;
    }

    public void setPanelModelDropdown(PanelModel panelModelDropdown) {
        this.panelModelDropdown = panelModelDropdown;
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

    public String getDropdownAuswahlAjax() {
        return dropdownAuswahlAjax;
    }

    public void setDropdownAuswahlAjax(String dropdownAuswahlAjax) {
        this.dropdownAuswahlAjax = dropdownAuswahlAjax;
    }

    public String getDisabledDropdownAuswahl() {
        return disabledDropdownAuswahl;
    }

    public void setDisabledDropdownAuswahl(String disabledDropdownAuswahl) {
        this.disabledDropdownAuswahl = disabledDropdownAuswahl;
    }

    public String getReadonlyDropdownAuswahl() {
        return readonlyDropdownAuswahl;
    }

    public void setReadonlyDropdownAuswahl(String readonlyDropdownAuswahl) {
        this.readonlyDropdownAuswahl = readonlyDropdownAuswahl;
    }
}
