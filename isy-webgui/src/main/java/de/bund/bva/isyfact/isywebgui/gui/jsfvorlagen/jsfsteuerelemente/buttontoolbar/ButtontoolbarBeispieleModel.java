package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.buttontoolbar;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class ButtontoolbarBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelButtonToolbar = new PanelModel(true);

    public PanelModel getPanelModelButtonToolbar() {
        return panelModelButtonToolbar;
    }

    public void setPanelModelButtonToolbar(PanelModel panelModelButtonToolbar) {
        this.panelModelButtonToolbar = panelModelButtonToolbar;
    }
}
