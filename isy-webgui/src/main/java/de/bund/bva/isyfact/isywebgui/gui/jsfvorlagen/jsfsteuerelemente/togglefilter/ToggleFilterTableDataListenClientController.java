package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.togglefilter;

import org.springframework.stereotype.Component;

import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableController;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableModel;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTablePaginationModel;

/**
 * Client-sided Controller
 */
@Component
public class ToggleFilterTableDataListenClientController extends
        DataTableController<ToggleFilterTableData, ToggleFilterTableDataListenModel> {

    /**
     * {@inheritDoc}
     */
    public void initialisiereModel(ToggleFilterTableDataListenModel model) {

        model.getPaginationModel().setPageSize(3);
        model.getPaginationModel().setType(DataTablePaginationModel.PaginationType.NORMAL);
        model.setMode(DataTableModel.DatatableOperationMode.CLIENT);

        updateDisplayItems(model);
    }

    /**
     * {@inheritDoc}
     */
    public void updateDisplayItems(ToggleFilterTableDataListenModel model) {
        // do nothing cause client-sided
    }

}


