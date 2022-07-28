package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.togglefilter;

import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableInMemoryController;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableInMemoryModel;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableModel;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTablePaginationModel;
import org.springframework.stereotype.Controller;

/**
 * Server-sided Controller
 */
@Controller
public class ToggleFilterTableDataListenServerController extends
        DataTableInMemoryController<ToggleFilterTableData, DataTableInMemoryModel<ToggleFilterTableData>> {

    /**
     * {@inheritDoc}
     */
    public void initialisiereModel(DataTableInMemoryModel<ToggleFilterTableData> model) {
        model.getPaginationModel().setType(DataTablePaginationModel.PaginationType.SIMPLE);
        model.getPaginationModel().setPageSize(3);
        model.setMode(DataTableModel.DatatableOperationMode.SERVER);
    }

}
