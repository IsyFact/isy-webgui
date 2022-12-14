package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.datatable;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableInMemoryModel;
import de.bund.bva.isyfact.common.web.jsf.components.panel.PanelModel;

public class DataTableBeispieleModel extends AbstractMaskenModel {

    /** Panelmodel for panel state */
    private PanelModel panelModelDataTable = new PanelModel(true);

    /**
     * Model for Trefferliste (client mode).
     */
    private JsfSteuerelementeTrefferlistenModel trefferlistenClientModel;

    /**
     * Model for Trefferliste (server mode).
     */
    private DataTableInMemoryModel<JsfSteuerelementeTreffer> trefferlistenServerModel;


    /**
     * Model for the master-detail-view table.
     */
    private DataTableInMemoryModel<JsfSteuerelementeTreffer> trefferlistenMasterDetailModel;

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

    public DataTableInMemoryModel<JsfSteuerelementeTreffer> getTrefferlistenMasterDetailModel() {
        return trefferlistenMasterDetailModel;
    }

    public void setTrefferlistenMasterDetailModel(DataTableInMemoryModel<JsfSteuerelementeTreffer> trefferlistenMasterDetailModel) {
        this.trefferlistenMasterDetailModel = trefferlistenMasterDetailModel;
    }
}
