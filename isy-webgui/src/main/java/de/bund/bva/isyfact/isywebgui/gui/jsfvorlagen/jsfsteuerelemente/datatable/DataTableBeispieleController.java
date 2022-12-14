package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.datatable;

import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableInMemoryModel;
import de.bund.bva.isyfact.isywebgui.common.stub.StubdatenGenerator;

@Controller
public class DataTableBeispieleController extends AbstractGuiController<DataTableBeispieleModel> {

    /**
     * Controller for the Trefferliste Client.
     */
    private final JsfSteuerelementeTrefferlistenClientController jsfSteuerelementeTrefferlistenClientController;

    /**
     * Controller for the Trefferliste Server.
     */
    private final JsfSteuerelementeTrefferlistenServerController jsfSteuerelementeTrefferlistenServerController;

    public DataTableBeispieleController(
            JsfSteuerelementeTrefferlistenClientController jsfSteuerelementeTrefferlistenClientController,
            JsfSteuerelementeTrefferlistenServerController jsfSteuerelementeTrefferlistenServerController) {
        this.jsfSteuerelementeTrefferlistenClientController = jsfSteuerelementeTrefferlistenClientController;
        this.jsfSteuerelementeTrefferlistenServerController = jsfSteuerelementeTrefferlistenServerController;
    }

    @Override
    protected Class<DataTableBeispieleModel> getMaskenModelKlasseZuController() {
        return DataTableBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(DataTableBeispieleModel model) {
        // Trefferliste ClientModel
        JsfSteuerelementeTrefferlistenModel trefferlistenClientModel = new JsfSteuerelementeTrefferlistenModel();
        trefferlistenClientModel.getDataModel().setDisplayItems(StubdatenGenerator.erzeugePersonalienTrefferliste());
        model.setTrefferlistenClientModel(trefferlistenClientModel);

        // Trefferliste ServerModel
        DataTableInMemoryModel<JsfSteuerelementeTreffer> trefferlistenServerModel = new DataTableInMemoryModel<>();
        model.setTrefferlistenServerModel(trefferlistenServerModel);

        // Trefferliste Master-Detail view
        model.setTrefferlistenMasterDetailModel(new DataTableInMemoryModel<>());
    }


    /**
     * Performs a search
     *
     * @param model the Model
     */
    public void fuehreSucheAusClient(DataTableBeispieleModel model) {
        jsfSteuerelementeTrefferlistenClientController.updateDisplayItems(model.getTrefferlistenClientModel());
    }

    /**
     * Performs a search
     *
     * @param model the Model
     */
    public void fuehreSucheAusServer(DataTableBeispieleModel model) {
        jsfSteuerelementeTrefferlistenServerController.updateDisplayItems(model.getTrefferlistenServerModel());
    }

    /**
     * Perform search for the master-detail-view table.
     *
     * @param model the table model
     */
    public void fuehreSucheAusMasterDetail(DataTableBeispieleModel model) {
        final DataTableInMemoryModel<JsfSteuerelementeTreffer> tableModel = model.getTrefferlistenMasterDetailModel();
        jsfSteuerelementeTrefferlistenServerController.updateDisplayItems(tableModel);
        jsfSteuerelementeTrefferlistenServerController.showFirstItemDetails(tableModel);
    }
}
