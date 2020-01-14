package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.datepicker;

import java.time.LocalDate;
import java.util.List;
import javax.faces.model.SelectItem;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class DatepickerBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelDatepicker = new PanelModel(true);

    /** Uebernommenes Datum. **/
    private String datum;

    public PanelModel getPanelModelDatepicker() {
        return panelModelDatepicker;
    }

    public void setPanelModelDatepicker(PanelModel panelModelDatepicker) {
        this.panelModelDatepicker = panelModelDatepicker;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }
}
