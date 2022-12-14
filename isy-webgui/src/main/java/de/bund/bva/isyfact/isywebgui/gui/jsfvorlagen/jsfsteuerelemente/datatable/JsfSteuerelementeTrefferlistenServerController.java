package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.datatable;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;

import com.google.common.collect.Lists;

import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableInMemoryController;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableInMemoryModel;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableModel.DatatableOperationMode;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTablePaginationModel.PaginationType;

/**
 * Controller for the Trefferliste.
 */
@Controller
public class JsfSteuerelementeTrefferlistenServerController extends
    DataTableInMemoryController<JsfSteuerelementeTreffer, DataTableInMemoryModel<JsfSteuerelementeTreffer>> {

    @Override
    public void initialisiereModel(DataTableInMemoryModel<JsfSteuerelementeTreffer> model) {
        model.getPaginationModel().setType(PaginationType.SIMPLE);
        model.getPaginationModel().setPageSize(3);
        model.setMode(DatatableOperationMode.SERVER);
    }

    @Override
    public List<JsfSteuerelementeTreffer> getAllItems(DataTableInMemoryModel<JsfSteuerelementeTreffer> model) {
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

        return Lists.newArrayList(treffer1, treffer2, treffer3, treffer4, treffer5, treffer6);
    }

    public Optional<JsfSteuerelementeTreffer> getSingleDetailViewItem(DataTableInMemoryModel<JsfSteuerelementeTreffer> model) {
        final Optional<JsfSteuerelementeTreffer> result;

        final Optional<JsfSteuerelementeTreffer> optionalDetailViewItem = model
                .getDetailViewModel()
                .getDetailViewItems()
                .stream()
                .map(id -> getItemById(model, id))
                .findFirst();

        if (optionalDetailViewItem.isPresent()) {
            result = optionalDetailViewItem;
        } else {
            result = showFirstItemDetails(model);
        }

        return result;
    }

    public Optional<JsfSteuerelementeTreffer> showFirstItemDetails(DataTableInMemoryModel<JsfSteuerelementeTreffer> model) {
        // Boilerplate code because DataTableInMemoryModel.getAllitems() can return null
        final Optional<JsfSteuerelementeTreffer> result = Optional.ofNullable(model.getAllitems())
                .flatMap(items -> items.stream().findFirst());

        result.ifPresent(item -> showDetails(model, item.getIdentifierForItem(), true));

        return result;
    }

}
