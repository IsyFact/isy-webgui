package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.aktionseingabe;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class AktionseingabeBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelActionInput = new PanelModel(true);

    /** Speicherung des Ergebnisses des actionInput-Felds. **/
    private String actionInputResult;

    /** Speicherung des Ergebnisses des actionInputDisabled-Felds. **/
    private String actionInputResultDisabled;

    /** Speicherung des Ergebnisses des formActionInput-Felds. **/
    private String formActionInputResult;

    /** Speicherung des Ergebnisses des formActionInputResultDisabled-Felds. **/
    private String formActionInputResultDisabled;

    public PanelModel getPanelModelActionInput() {
        return panelModelActionInput;
    }

    public void setPanelModelActionInput(PanelModel panelModelActionInput) {
        this.panelModelActionInput = panelModelActionInput;
    }

    public String getActionInputResult() {
        return actionInputResult;
    }

    public void setActionInputResult(String actionInputResult) {
        this.actionInputResult = actionInputResult;
    }

    public String getActionInputResultDisabled() {
        return actionInputResultDisabled;
    }

    public void setActionInputResultDisabled(String actionInputResultDisabled) {
        this.actionInputResultDisabled = actionInputResultDisabled;
    }

    public String getFormActionInputResult() {
        return formActionInputResult;
    }

    public void setFormActionInputResult(String formActionInputResult) {
        this.formActionInputResult = formActionInputResult;
    }

    public String getFormActionInputResultDisabled() {
        return formActionInputResultDisabled;
    }

    public void setFormActionInputResultDisabled(String formActionInputResultDisabled) {
        this.formActionInputResultDisabled = formActionInputResultDisabled;
    }
}
