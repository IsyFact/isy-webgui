package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.datatable;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableInMemoryModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class DataTableBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel für Zustand des Panels. */
    private PanelModel panelModelDataTable = new PanelModel(true);

    /**
     * Model für Trefferliste (Client-Modus).
     */
    private JsfSteuerelementeTrefferlistenModel trefferlistenClientModel;

    /**
     * Model für Trefferliste (Server-Modus).
     */
    private DataTableInMemoryModel<JsfSteuerelementeTreffer> trefferlistenServerModel;

    public PanelModel getPanelModelDataTable() {
        return panelModelDataTable;
    }

    public void setPanelModelDataTable(PanelModel panelModelDataTable) {
        this.panelModelDataTable = panelModelDataTable;
    }

    public JsfSteuerelementeTrefferlistenModel getTrefferlistenClientModel() {
        return trefferlistenClientModel;
    }

    public void setTrefferlistenClientModel(JsfSteuerelementeTrefferlistenModel trefferlistenClientModel) {
        this.trefferlistenClientModel = trefferlistenClientModel;
    }

    public DataTableInMemoryModel<JsfSteuerelementeTreffer> getTrefferlistenServerModel() {
        return trefferlistenServerModel;
    }

    public void setTrefferlistenServerModel(
        DataTableInMemoryModel<JsfSteuerelementeTreffer> trefferlistenServerModel) {
        this.trefferlistenServerModel = trefferlistenServerModel;
    }
}
