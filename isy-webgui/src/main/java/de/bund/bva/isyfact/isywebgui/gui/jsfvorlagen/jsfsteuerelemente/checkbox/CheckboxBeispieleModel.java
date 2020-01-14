package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.checkbox;

import java.util.List;
import javax.faces.model.SelectItem;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class CheckboxBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelCheckbox = new PanelModel(true);

    /**
     * Elemente der Checkbox.
     */
    private List<SelectItem> checkboxListe;

    /**
     * Auswahl der Checkbox.
     */
    private List<String> checkboxAuswahl;

    /**
     * Checkbox ausgewählt oder nicht.
     */
    private boolean checkboxBoolean1;

    /**
     * Checkbox ausgewählt oder nicht.
     */
    private boolean checkboxBoolean2;

    /**
     * Checkbox ausgewählt oder nicht.
     */
    private boolean checkboxBoolean3;

    /**
     * Checkbox ausgewählt oder nicht.
     */
    private boolean checkboxBoolean4;

    /**
     * Anzahl der Klick Events der Checkbox.
     */
    private int checkboxBooleanGeklicktAnzahl;

    /**
     * Checkbox ausgewählt oder nicht.
     */
    private String checkboxBooleanNeuerWert;

    public PanelModel getPanelModelCheckbox() {
        return panelModelCheckbox;
    }

    public void setPanelModelCheckbox(PanelModel panelModelCheckbox) {
        this.panelModelCheckbox = panelModelCheckbox;
    }

    public List<SelectItem> getCheckboxListe() {
        return checkboxListe;
    }

    public void setCheckboxListe(List<SelectItem> checkboxListe) {
        this.checkboxListe = checkboxListe;
    }

    public List<String> getCheckboxAuswahl() {
        return checkboxAuswahl;
    }

    public void setCheckboxAuswahl(List<String> checkboxAuswahl) {
        this.checkboxAuswahl = checkboxAuswahl;
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

    public boolean isCheckboxBoolean3() {
        return checkboxBoolean3;
    }

    public void setCheckboxBoolean3(boolean checkboxBoolean3) {
        this.checkboxBoolean3 = checkboxBoolean3;
    }

    public boolean isCheckboxBoolean4() {
        return checkboxBoolean4;
    }

    public void setCheckboxBoolean4(boolean checkboxBoolean4) {
        this.checkboxBoolean4 = checkboxBoolean4;
    }

    public int getCheckboxBooleanGeklicktAnzahl() {
        return checkboxBooleanGeklicktAnzahl;
    }

    public void setCheckboxBooleanGeklicktAnzahl(int checkboxBooleanGeklicktAnzahl) {
        this.checkboxBooleanGeklicktAnzahl = checkboxBooleanGeklicktAnzahl;
    }

    public String getCheckboxBooleanNeuerWert() {
        return checkboxBooleanNeuerWert;
    }

    public void setCheckboxBooleanNeuerWert(String checkboxBooleanNeuerWert) {
        this.checkboxBooleanNeuerWert = checkboxBooleanNeuerWert;
    }
}
