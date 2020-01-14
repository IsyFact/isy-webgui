package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.eingabefeld;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class EingabeBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelFormInput = new PanelModel(true);

    /** Speicherung des Ergebnisses der Texteingabe. **/
    private String formInputTextButtonActionResult;

    /** Speicherung des Ergebnisses der Passworteingabe. **/
    private String formInputPasswortButtonActionResult;

    public PanelModel getPanelModelFormInput() {
        return panelModelFormInput;
    }

    public void setPanelModelFormInput(PanelModel panelModelFormInput) {
        this.panelModelFormInput = panelModelFormInput;
    }

    public String getFormInputTextButtonActionResult() {
        return formInputTextButtonActionResult;
    }

    public void setFormInputTextButtonActionResult(String formInputTextButtonActionResult) {
        this.formInputTextButtonActionResult = formInputTextButtonActionResult;
    }

    public String getFormInputPasswortButtonActionResult() {
        return formInputPasswortButtonActionResult;
    }

    public void setFormInputPasswortButtonActionResult(String formInputPasswortButtonActionResult) {
        this.formInputPasswortButtonActionResult = formInputPasswortButtonActionResult;
    }
}
