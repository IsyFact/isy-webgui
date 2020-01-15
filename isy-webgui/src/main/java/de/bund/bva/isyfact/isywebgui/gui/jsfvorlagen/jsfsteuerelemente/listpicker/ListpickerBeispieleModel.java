package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.listpicker.Listpickerangabe;
import de.bund.bva.isyfact.common.web.jsf.components.listpicker.behoerde.BehoerdeListpickerModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class ListpickerBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelListpicker = new PanelModel(true);

    /**
     * Model für Listpicker (ohne AJAX).
     */
    private JsfSteuerelementeListpickerModel listpickerModel;

    /**
     * Listpickermodel für den Staatsangehörigkeits-Listpicker.
     */
    private JsfSteuerelementeStaatsangListpickerModel staatsangListpickerModel;

    /**
     * Listpickermodel für den Behörde-Listpicker.
     */
    private BehoerdeListpickerModel behoerdeListpickerModel;

    /**
     * Model für Listpicker (mit AJAX).
     */
    private JsfSteuerelementeListpickerModel ajaxListpickerModel;

    /**
     * Model für Servlet-Listpicker.
     */
    private JsfSteuerelementeListpickerModel servletListpickerModel;

    /**
     * Auswahl des Behörde-Listpickers.
     */
    private Listpickerangabe behoerdeListpickerAngabe;

    /**
     * Auswahl des Listpickers (ohne AJAX).
     */
    private String listpickerAuswahl;


    private Listpickerangabe staatsangListpickerAuswahl;


    /**
     * Auswahl des Listpickers (mit AJAX).
     */
    private String ajaxListpickerAuswahl;

    /**
     * Auswahl des Servlet-Listpickers.
     */
    private String servletListpickerAuswahl;

    public PanelModel getPanelModelListpicker() {
        return panelModelListpicker;
    }

    public void setPanelModelListpicker(PanelModel panelModelListpicker) {
        this.panelModelListpicker = panelModelListpicker;
    }

    public JsfSteuerelementeListpickerModel getListpickerModel() {
        return listpickerModel;
    }

    public void setListpickerModel(JsfSteuerelementeListpickerModel listpickerModel) {
        this.listpickerModel = listpickerModel;
    }

    public JsfSteuerelementeStaatsangListpickerModel getStaatsangListpickerModel() {
        return staatsangListpickerModel;
    }

    public void setStaatsangListpickerModel(
        JsfSteuerelementeStaatsangListpickerModel staatsangListpickerModel) {
        this.staatsangListpickerModel = staatsangListpickerModel;
    }

    public BehoerdeListpickerModel getBehoerdeListpickerModel() {
        return behoerdeListpickerModel;
    }

    public void setBehoerdeListpickerModel(BehoerdeListpickerModel behoerdeListpickerModel) {
        this.behoerdeListpickerModel = behoerdeListpickerModel;
    }

    public Listpickerangabe getBehoerdeListpickerAngabe() {
        return behoerdeListpickerAngabe;
    }

    public void setBehoerdeListpickerAngabe(Listpickerangabe behoerdeListpickerAngabe) {
        this.behoerdeListpickerAngabe = behoerdeListpickerAngabe;
    }

    public JsfSteuerelementeListpickerModel getAjaxListpickerModel() {
        return ajaxListpickerModel;
    }

    public void setAjaxListpickerModel(JsfSteuerelementeListpickerModel ajaxListpickerModel) {
        this.ajaxListpickerModel = ajaxListpickerModel;
    }

    public JsfSteuerelementeListpickerModel getServletListpickerModel() {
        return servletListpickerModel;
    }

    public void setServletListpickerModel(JsfSteuerelementeListpickerModel servletListpickerModel) {
        this.servletListpickerModel = servletListpickerModel;
    }

    public String getListpickerAuswahl() {
        return listpickerAuswahl;
    }

    public void setListpickerAuswahl(String listpickerAuswahl) {
        this.listpickerAuswahl = listpickerAuswahl;
    }

    public String getAjaxListpickerAuswahl() {
        return ajaxListpickerAuswahl;
    }

    public void setAjaxListpickerAuswahl(String ajaxListpickerAuswahl) {
        this.ajaxListpickerAuswahl = ajaxListpickerAuswahl;
    }

    public String getServletListpickerAuswahl() {
        return servletListpickerAuswahl;
    }

    public void setServletListpickerAuswahl(String servletListpickerAuswahl) {
        this.servletListpickerAuswahl = servletListpickerAuswahl;
    }

    public Listpickerangabe getStaatsangListpickerAuswahl() {
        return staatsangListpickerAuswahl;
    }

    public void setStaatsangListpickerAuswahl(Listpickerangabe staatsangListpickerAuswahl) {
        this.staatsangListpickerAuswahl = staatsangListpickerAuswahl;
    }
}
