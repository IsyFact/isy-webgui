package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.upload;

import javax.servlet.http.Part;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class UploadBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelUpload = new PanelModel(true);

    // Attribute für die Upload-Demo.
    // Uploads müssen immer transient sein.
    /** Bildupload. **/
    private transient Part bildUpload;

    // Uploads müssen immer transient sein.
    /** Disabled-upload. **/
    private transient Part disabledUpload;

    // Uploads müssen immer transient sein.
    /** Textupload. **/
    private transient Part textUpload;

    // Nur für die Demo des Uploads
    /** Hochgeladener Text. Nur zu Demo-Zwecken.**/
    private String hochgeladenerText;

    // Nur für die Demo des Uploads
    /** Hochgeladenes Bild. Nur zu Demo-Zwecken. **/
    private byte[] hochgeladenesBild;

    public PanelModel getPanelModelUpload() {
        return panelModelUpload;
    }

    public void setPanelModelUpload(PanelModel panelModelUpload) {
        this.panelModelUpload = panelModelUpload;
    }

    public Part getBildUpload() {
        return bildUpload;
    }

    public void setBildUpload(Part bildUpload) {
        this.bildUpload = bildUpload;
    }

    public Part getDisabledUpload() {
        return disabledUpload;
    }

    public void setDisabledUpload(Part disabledUpload) {
        this.disabledUpload = disabledUpload;
    }

    public Part getTextUpload() {
        return textUpload;
    }

    public void setTextUpload(Part textUpload) {
        this.textUpload = textUpload;
    }

    public String getHochgeladenerText() {
        return hochgeladenerText;
    }

    public void setHochgeladenerText(String hochgeladenerText) {
        this.hochgeladenerText = hochgeladenerText;
    }

    public byte[] getHochgeladenesBild() {
        return hochgeladenesBild;
    }

    public void setHochgeladenesBild(byte[] hochgeladenesBild) {
        this.hochgeladenesBild = hochgeladenesBild;
    }
}
