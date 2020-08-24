package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.tab;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class TabBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelTab = new PanelModel(true);

    /**
     * Model für AuskunftTab.
     */
    private JsfSteuerelementeAuskunftTabModel auskunftTabModel;

    public PanelModel getPanelModelTab() {
        return panelModelTab;
    }

    public void setPanelModelTab(PanelModel panelModelTab) {
        this.panelModelTab = panelModelTab;
    }

    public JsfSteuerelementeAuskunftTabModel getAuskunftTabModel() {
        return auskunftTabModel;
    }

    public void setAuskunftTabModel(JsfSteuerelementeAuskunftTabModel auskunftTabModel) {
        this.auskunftTabModel = auskunftTabModel;
    }
}
