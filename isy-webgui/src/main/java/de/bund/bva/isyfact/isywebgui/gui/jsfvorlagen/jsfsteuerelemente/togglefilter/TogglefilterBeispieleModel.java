package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.togglefilter;

import java.util.List;
import javax.faces.model.SelectItem;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class TogglefilterBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelToggleFilter = new PanelModel(true);

    /**
     * Elemente für Toggle-Filter.
     */
    private List<SelectItem> toggleFilterListe;

    /** Aktuell aktive Auswahl. **/
    private String toggleFilterAuswahl;

    public PanelModel getPanelModelToggleFilter() {
        return panelModelToggleFilter;
    }

    public void setPanelModelToggleFilter(PanelModel panelModelToggleFilter) {
        this.panelModelToggleFilter = panelModelToggleFilter;
    }

    public List<SelectItem> getToggleFilterListe() {
        return toggleFilterListe;
    }

    public void setToggleFilterListe(List<SelectItem> toggleFilterListe) {
        this.toggleFilterListe = toggleFilterListe;
    }

    public String getToggleFilterAuswahl() {
        return toggleFilterAuswahl;
    }

    public void setToggleFilterAuswahl(String toggleFilterAuswahl) {
        this.toggleFilterAuswahl = toggleFilterAuswahl;
    }
}
