package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.eingabefeld;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class EingabeBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelFormInput = new PanelModel(true);

    /** Panelmodel für Zustand des CurrencyPanels. */
    private PanelModel panelModelCurrency = new PanelModel(true);

    /** Panelmodel für Zustand des ZahlenPanels. */
    private PanelModel panelModelNumeric = new PanelModel(true);

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

    public PanelModel getPanelModelCurrency() {
        return panelModelCurrency;
    }

    public void setPanelModelCurrency(PanelModel panelModelCurrency) {
        this.panelModelCurrency = panelModelCurrency;
    }

    public PanelModel getPanelModelNumeric() {
        return panelModelNumeric;
    }

    public void setPanelModelNumeric(PanelModel panelModelNumeric) {
        this.panelModelNumeric = panelModelNumeric;
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
