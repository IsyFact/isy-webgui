package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.radiobutton;

import java.util.List;

import javax.faces.model.SelectItem;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class RadiobuttonBeispieleModel extends AbstractMaskenModel {

    /**
     * Panelmodel für Zustand des Panels.
     */
    private PanelModel panelModelRadioButton = new PanelModel(true);

    /**
     * Auswahl des Radio-Buttons.
     */
    private String radioButtonAuswahl;

    /**
     * Auswahl der zweiten Radio-Buttons Gruppe.
     */
    private String radioButtonAuswahl2;

    /**
     * Elemente des Radio-Buttons.
     */
    private List<SelectItem> radioButtonListe;

    public PanelModel getPanelModelRadioButton() {
        return panelModelRadioButton;
    }

    public void setPanelModelRadioButton(PanelModel panelModelRadioButton) {
        this.panelModelRadioButton = panelModelRadioButton;
    }

    public String getRadioButtonAuswahl() {
        return radioButtonAuswahl;
    }

    public void setRadioButtonAuswahl(String radioButtonAuswahl) {
        this.radioButtonAuswahl = radioButtonAuswahl;
    }

    public String getRadioButtonAuswahl2() {
        return radioButtonAuswahl2;
    }

    public void setRadioButtonAuswahl2(String radioButtonAuswahl2) {
        this.radioButtonAuswahl2 = radioButtonAuswahl2;
    }

    public List<SelectItem> getRadioButtonListe() {
        return radioButtonListe;
    }

    public void setRadioButtonListe(List<SelectItem> radioButtonListe) {
        this.radioButtonListe = radioButtonListe;
    }
}
