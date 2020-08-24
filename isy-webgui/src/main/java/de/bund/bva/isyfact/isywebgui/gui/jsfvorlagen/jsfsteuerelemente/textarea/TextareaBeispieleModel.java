package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.textarea;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class TextareaBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelFormTextarea = new PanelModel(true);

    /** Speicherung des Ergebnisses der Texteingabe. **/
    private String textBoxButtonActionResult;

    public PanelModel getPanelModelFormTextarea() {
        return panelModelFormTextarea;
    }

    public void setPanelModelFormTextarea(PanelModel panelModelFormTextarea) {
        this.panelModelFormTextarea = panelModelFormTextarea;
    }

    public String getTextBoxButtonActionResult() {
        return textBoxButtonActionResult;
    }

    public void setTextBoxButtonActionResult(String textBoxButtonActionResult) {
        this.textBoxButtonActionResult = textBoxButtonActionResult;
    }
}
