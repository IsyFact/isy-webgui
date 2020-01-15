package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.tooltip;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class TooltipBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelTooltip = new PanelModel(true);

    public PanelModel getPanelModelTooltip() {
        return panelModelTooltip;
    }

    public void setPanelModelTooltip(PanelModel panelModelTooltip) {
        this.panelModelTooltip = panelModelTooltip;
    }
}
