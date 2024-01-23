package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.togglefilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableInMemoryModel;
import de.bund.bva.isyfact.isywebgui.common.stub.StubdatenGenerator;


@Controller
public class TogglefilterBeispieleController extends AbstractGuiController<TogglefilterBeispieleModel> {

    /**
     * Client-sided controller.
     **/
    private ToggleFilterTableDataListenClientController toggleFilterTableDataListenClientController;
    /**
     * Server-sided Controller.
     **/
    private ToggleFilterTableDataListenServerController toggleFilterTableDataListenServerController;

    @Autowired
    public TogglefilterBeispieleController(
            ToggleFilterTableDataListenClientController toggleFilterTableDataListenClientController,
            ToggleFilterTableDataListenServerController toggleFilterTableDataListenServerController) {
        this.toggleFilterTableDataListenClientController = toggleFilterTableDataListenClientController;
        this.toggleFilterTableDataListenServerController = toggleFilterTableDataListenServerController;
    }

    @Override
    protected Class<TogglefilterBeispieleModel> getMaskenModelKlasseZuController() {
        return TogglefilterBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(TogglefilterBeispieleModel model) {

        model.setToggleFilterListe(initToggleFilterList());
        model.setToggleFilterAuswahl("0");

        // TableData ClientModel
        ToggleFilterTableDataListenModel toggleFilterTableDataListenModel =
                new ToggleFilterTableDataListenModel();
        toggleFilterTableDataListenModel.getDataModel()
                .setDisplayItems(StubdatenGenerator.createDummyToggleFilterTableData());
        model.setTrefferlistenClientModel(toggleFilterTableDataListenModel);

        // TableData ServerModel
        DataTableInMemoryModel<ToggleFilterTableData> dataTableInMemoryModelOfToggleFilterTableData =
                new DataTableInMemoryModel<>();
        dataTableInMemoryModelOfToggleFilterTableData.getDataModel().setAllItems(StubdatenGenerator.createDummyToggleFilterTableData());
        model.setTrefferlistenServerModel(dataTableInMemoryModelOfToggleFilterTableData);

    }

    private ArrayList<SelectItem> initToggleFilterList() {
        ArrayList<SelectItem> toggleFilterList = new ArrayList<>();
        SelectItem defaultNoFilter = new SelectItem(String.valueOf(0), "Alle");
        toggleFilterList.add(defaultNoFilter);
        SelectItem filter1 = new SelectItem(String.valueOf(1), "DE");
        toggleFilterList.add(filter1);
        SelectItem filter2 = new SelectItem(String.valueOf(2), "FR");
        toggleFilterList.add(filter2);
        SelectItem filter3 = new SelectItem(String.valueOf(3), "Unterhaltung");
        toggleFilterList.add(filter3);
        SelectItem filter4 = new SelectItem(String.valueOf(4), "Essen & Trinken");
        toggleFilterList.add(filter4);

        return toggleFilterList;
    }

    /**
     * Function to filter the given table data with specific parameters given by the toggle filter
     *
     * @param model the model
     */
    public void filterTableData(TogglefilterBeispieleModel model) {
        switch (model.getToggleFilterAuswahl()) {
            case "1":
                model.getTrefferlistenClientModel().getDataModel().setDisplayItems(filterTableDataListForCountryDE(model));
                break;
            case "2":
                model.getTrefferlistenClientModel().getDataModel().setDisplayItems(filterTableDataListForCountryFR(model));
                break;
            case "3":
                model.getTrefferlistenClientModel().getDataModel().setDisplayItems(filterTableDataListForIndustryUnterhaltung(model));
                break;
            case "4":
                model.getTrefferlistenClientModel().getDataModel().setDisplayItems(filterTableDataListForIndustryEssenTrinken(model));
                break;
            default:
                model.getTrefferlistenClientModel().getDataModel().setDisplayItems(model.getTrefferlistenServerModel().getAllitems());
                break;
        }

        toggleFilterTableDataListenClientController
                .updateDisplayItems(model.getTrefferlistenClientModel());
    }

    private List<ToggleFilterTableData> filterTableDataListForCountryDE(TogglefilterBeispieleModel model) {
        return model.getTrefferlistenServerModel().getAllitems().stream().filter(x -> x.getCountryCode().equals("DE")).collect(Collectors.toList());
    }

    private List<ToggleFilterTableData> filterTableDataListForCountryFR(TogglefilterBeispieleModel model) {
        return model.getTrefferlistenServerModel().getAllitems().stream().filter(x -> x.getCountryCode().equals("FR")).collect(Collectors.toList());
    }

    private List<ToggleFilterTableData> filterTableDataListForIndustryUnterhaltung(TogglefilterBeispieleModel model) {
        return model.getTrefferlistenServerModel().getAllitems().stream().filter(x -> x.getIndustry().equals("Unterhaltung")).collect(Collectors.toList());
    }

    private List<ToggleFilterTableData> filterTableDataListForIndustryEssenTrinken(TogglefilterBeispieleModel model) {
        return model.getTrefferlistenServerModel().getAllitems().stream().filter(x -> x.getIndustry().equals("Essen & Trinken")).collect(Collectors.toList());
    }

}
