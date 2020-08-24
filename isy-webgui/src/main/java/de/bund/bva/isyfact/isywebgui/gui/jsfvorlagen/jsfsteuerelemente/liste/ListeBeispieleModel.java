package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.liste;

import java.util.List;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class ListeBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel listPanel = new PanelModel(true);

    /** Auswahloptionen. **/
    private List<String> formSelectListInhalt;

    /** Gewählte Option. **/
    private String listAuswahlSelectOne1;

    /** Gewählte Option. **/
    private String listAuswahlSelectOne2;

    /** Gewählte Option. **/
    private String listAuswahlSelectOne3;

    /** Gewählte Option. **/
    private String listAuswahlSelectOne4;

    /** Gewählte Optionen. **/
    private List<String> listAuswahlSelectMany1;

    /** Gewählte Optionen. **/
    private List<String> listAuswahlSelectMany2;

    /** Gewählte Optionen. **/
    private List<String> listAuswahlSelectMany3;

    /** Gewählte Optionen. **/
    private List<String> listAuswahlSelectMany4;



    public PanelModel getListPanel() {
        return listPanel;
    }

    public void setListPanel(PanelModel listPanel) {
        this.listPanel = listPanel;
    }

    public List<String> getFormSelectListInhalt() {
        return formSelectListInhalt;
    }

    public void setFormSelectListInhalt(List<String> formSelectListInhalt) {
        this.formSelectListInhalt = formSelectListInhalt;
    }

    public String getListAuswahlSelectOne1() {
        return listAuswahlSelectOne1;
    }

    public void setListAuswahlSelectOne1(String listAuswahlSelectOne1) {
        this.listAuswahlSelectOne1 = listAuswahlSelectOne1;
    }

    public String getListAuswahlSelectOne2() {
        return listAuswahlSelectOne2;
    }

    public void setListAuswahlSelectOne2(String listAuswahlSelectOne2) {
        this.listAuswahlSelectOne2 = listAuswahlSelectOne2;
    }

    public String getListAuswahlSelectOne3() {
        return listAuswahlSelectOne3;
    }

    public void setListAuswahlSelectOne3(String listAuswahlSelectOne3) {
        this.listAuswahlSelectOne3 = listAuswahlSelectOne3;
    }

    public String getListAuswahlSelectOne4() {
        return listAuswahlSelectOne4;
    }

    public void setListAuswahlSelectOne4(String listAuswahlSelectOne4) {
        this.listAuswahlSelectOne4 = listAuswahlSelectOne4;
    }

    public List<String> getListAuswahlSelectMany1() {
        return listAuswahlSelectMany1;
    }

    public void setListAuswahlSelectMany1(List<String> listAuswahlSelectMany1) {
        this.listAuswahlSelectMany1 = listAuswahlSelectMany1;
    }

    public List<String> getListAuswahlSelectMany2() {
        return listAuswahlSelectMany2;
    }

    public void setListAuswahlSelectMany2(List<String> listAuswahlSelectMany2) {
        this.listAuswahlSelectMany2 = listAuswahlSelectMany2;
    }

    public List<String> getListAuswahlSelectMany3() {
        return listAuswahlSelectMany3;
    }

    public void setListAuswahlSelectMany3(List<String> listAuswahlSelectMany3) {
        this.listAuswahlSelectMany3 = listAuswahlSelectMany3;
    }

    public List<String> getListAuswahlSelectMany4() {
        return listAuswahlSelectMany4;
    }

    public void setListAuswahlSelectMany4(List<String> listAuswahlSelectMany4) {
        this.listAuswahlSelectMany4 = listAuswahlSelectMany4;
    }
}
