package de.bund.bva.pliscommon.pliswebgui.gui.jsfvorlagen.jsfsteuerelemente;

import java.util.ArrayList;

import com.google.common.collect.Lists;

import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableController;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableModel.DatatableOperationMode;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTablePaginationModel.PaginationType;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableRequest;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableResult;

/**
 * Controller für die Trefferliste.
 *
 * @author Capgemini, Tobias Groeger
 * @version $Id: JsfSteuerelementeTrefferlistenClientController.java 166449 2016-06-06 12:15:53Z sdm_arichter
 *          $
 */
public class JsfSteuerelementeTrefferlistenClientController extends
    DataTableController<JsfSteuerelementeTreffer, JsfSteuerelementeTrefferlistenModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialisiereModel(JsfSteuerelementeTrefferlistenModel model) {

        model.getPaginationModel().setPageSize(3);
        model.getPaginationModel().setType(PaginationType.NORMAL);
        model.setMode(DatatableOperationMode.CLIENT);

        updateDisplayItems(model);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateDisplayItems(JsfSteuerelementeTrefferlistenModel model) {
        // tu nichts, da clientseitig
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected DataTableResult<JsfSteuerelementeTreffer> readItems(JsfSteuerelementeTrefferlistenModel model,
        DataTableRequest request) {
        JsfSteuerelementeTreffer treffer1 = new JsfSteuerelementeTreffer();
        treffer1.setNummer("1");
        treffer1.setLogin("peter");
        treffer1.setNachname("Pan");
        treffer1.setVorname("Peter");

        JsfSteuerelementeTreffer treffer2 = new JsfSteuerelementeTreffer();
        treffer2.setNummer("2");
        treffer2.setLogin("micky");
        treffer2.setNachname("Mickey");
        treffer2.setVorname("Mouse");

        JsfSteuerelementeTreffer treffer3 = new JsfSteuerelementeTreffer();
        treffer3.setNummer("3");
        treffer3.setLogin("donald");
        treffer3.setNachname("Duck");
        treffer3.setVorname("Donald");

        JsfSteuerelementeTreffer treffer4 = new JsfSteuerelementeTreffer();
        treffer4.setNummer("4");
        treffer4.setLogin("miney");
        treffer4.setNachname("Mouse");
        treffer4.setVorname("Miney");

        JsfSteuerelementeTreffer treffer5 = new JsfSteuerelementeTreffer();
        treffer5.setNummer("5");
        treffer5.setLogin("goofy");
        treffer5.setNachname("Goof");
        treffer5.setVorname("Goofy");

        JsfSteuerelementeTreffer treffer6 = new JsfSteuerelementeTreffer();
        treffer6.setNummer("6");
        treffer6.setLogin("daisy");
        treffer6.setNachname("Duck");
        treffer6.setVorname("Daisy");

        DataTableResult<JsfSteuerelementeTreffer> result = new DataTableResult<>();
        ArrayList<JsfSteuerelementeTreffer> treffer =
            Lists.newArrayList(treffer1, treffer2, treffer3, treffer4, treffer5, treffer6);
        result.setItems(treffer);
        result.setItemCount(treffer.size());
        return result;
    }

}
