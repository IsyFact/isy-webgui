package de.bund.bva.isyfact.isywebgui.gui.layouts.applikationdetailseite;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

/**
 * Model für ApplikationDetailseite.
 *
 */
public class ApplikationDetailseiteModel extends AbstractMaskenModel {

    /**
     * Die Serial-Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * PanelModel für den Button.
     */
    private PanelModel panelModelButton = new PanelModel(false);

    public PanelModel getPanelModelButton() {
        return panelModelButton;
    }

    public void setPanelModelButton(PanelModel panelModelButton) {
        this.panelModelButton = panelModelButton;
    }
}
