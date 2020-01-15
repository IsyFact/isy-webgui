package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.datatable;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableInMemoryModel;
import de.bund.bva.isyfact.isywebgui.common.stub.StubdatenGenerator;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.JsfSteuerelementeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DataTableBeispieleController extends AbstractGuiController<DataTableBeispieleModel> {

    /** Controller für die Trefferliste Client. **/
    private JsfSteuerelementeTrefferlistenClientController jsfSteuerelementeTrefferlistenClientController;

    /** Controller für die Trefferliste Server. **/
    private JsfSteuerelementeTrefferlistenServerController jsfSteuerelementeTrefferlistenServerController;

    @Autowired
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
        JsfSteuerelementeTrefferlistenModel trefferlistenClientModel =
            new JsfSteuerelementeTrefferlistenModel();
        trefferlistenClientModel.getDataModel()
            .setDisplayItems(StubdatenGenerator.erzeugePersonalienTrefferliste());
        model.setTrefferlistenClientModel(trefferlistenClientModel);

        // Trefferliste ServerModel
        DataTableInMemoryModel<JsfSteuerelementeTreffer> trefferlistenServerModel =
            new DataTableInMemoryModel<>();
        model.setTrefferlistenServerModel(trefferlistenServerModel);
    }



    /**
     * Führt eine Suche aus.
     *
     * @param model das Model
     */
    public void fuehreSucheAusClient(DataTableBeispieleModel model) {
        jsfSteuerelementeTrefferlistenClientController
            .updateDisplayItems(model.getTrefferlistenClientModel());
    }

    /**
     * Führt eine Suche aus.
     *
     * @param model das Model
     */
    public void fuehreSucheAusServer(DataTableBeispieleModel model) {
        jsfSteuerelementeTrefferlistenServerController.updateDisplayItems(model.getTrefferlistenServerModel());
    }
}
