package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.browsecollect;

import java.util.List;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class BrowseAndCollectBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelBrowseAndCollect = new PanelModel(true);

    /** Auswahloptionen. **/
    private List<String> formSelectListInhalt;

    /** Derzeit ausgewählt. **/
    private List<String> browseAndCollectAuswahl;

    /** Derzeit ausgewählt zweite Demo. **/
    private List<String> browseAndCollectAuswahl2;

    public PanelModel getPanelModelBrowseAndCollect() {
        return panelModelBrowseAndCollect;
    }

    public void setPanelModelBrowseAndCollect(PanelModel panelModelBrowseAndCollect) {
        this.panelModelBrowseAndCollect = panelModelBrowseAndCollect;
    }

    public List<String> getFormSelectListInhalt() {
        return formSelectListInhalt;
    }

    public void setFormSelectListInhalt(List<String> formSelectListInhalt) {
        this.formSelectListInhalt = formSelectListInhalt;
    }

    public List<String> getBrowseAndCollectAuswahl() {
        return browseAndCollectAuswahl;
    }

    public void setBrowseAndCollectAuswahl(List<String> browseAndCollectAuswahl) {
        this.browseAndCollectAuswahl = browseAndCollectAuswahl;
    }

    public List<String> getBrowseAndCollectAuswahl2() {
        return browseAndCollectAuswahl2;
    }

    public void setBrowseAndCollectAuswahl2(List<String> browseAndCollectAuswahl2) {
        this.browseAndCollectAuswahl2 = browseAndCollectAuswahl2;
    }
}
