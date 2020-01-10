package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.common.base.Strings;
import org.apache.commons.beanutils.PropertyUtils;

import com.google.common.collect.Lists;

import de.bund.bva.isyfact.common.web.comparator.NullSafeBeanComparator;
import de.bund.bva.isyfact.common.web.exception.IsyFactTechnicalRuntimeException;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableController;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableModel.DatatableOperationMode;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTablePaginationModel.PaginationType;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableRequest;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableResult;
import de.bund.bva.isyfact.common.web.jsf.components.datatable.SortDirection;

/**
 * Controller für die Trefferliste.
 *
 * @author Capgemini, Tobias Groeger
 * @version $Id: JsfSteuerelementeTrefferlistenController.java 165302 2016-05-20 11:50:30Z sdm_arichter $
 */
public class JsfSteuerelementeTrefferlistenServerController2 extends
    DataTableController<JsfSteuerelementeTreffer, JsfSteuerelementeTrefferlistenModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialisiereModel(JsfSteuerelementeTrefferlistenModel model) {

        model.getPaginationModel().setPageSize(3);
        model.getPaginationModel().setType(PaginationType.SIMPLE);
        model.setMode(DatatableOperationMode.SERVER);

        updateDisplayItems(model);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateDisplayItems(JsfSteuerelementeTrefferlistenModel model) {
        search(model);
        sortiere(model);
        filtere(model);

    }

    public void filtere(JsfSteuerelementeTrefferlistenModel model) {
        Map<String, String> filters = model.getFilterModel().getFilters();
        List<JsfSteuerelementeTreffer> result =
            new ArrayList<JsfSteuerelementeTreffer>(model.getDataModel().getDisplayItems());
        if ((filters == null) || filters.isEmpty()) {
            // nichts zu filtern
            return;
        }

        for (Iterator<JsfSteuerelementeTreffer> it = result.iterator(); it.hasNext();) {
            JsfSteuerelementeTreffer item = it.next();
            for (Map.Entry<String, String> filter : filters.entrySet()) {
                if (Strings.isNullOrEmpty(filter.getKey()) || Strings.isNullOrEmpty(filter.getValue())) {
                    continue;
                }
                Object value = null;
                try {
                    value = PropertyUtils.getProperty(item, filter.getKey());
                } catch (Exception e) {
                    IsyFactTechnicalRuntimeException exception =
                        new IsyFactTechnicalRuntimeException("DEV01", e);
                    throw exception;
                }
                if ((value == null)
                    || !value.toString().toLowerCase().contains(filter.getValue().toLowerCase())) {
                    // remove not matching item
                    it.remove();
                    break;
                }
            }
        }
        model.getDataModel().setDisplayItems(result);

    }

    public void sortiere(JsfSteuerelementeTrefferlistenModel model) {

        if (model.getSortModel().getProperty() != null && !model.getSortModel().getProperty().isEmpty()) {
            @SuppressWarnings("rawtypes")
            Comparator comparator = new NullSafeBeanComparator(model.getSortModel().getProperty());
            Collections.sort(model.getDataModel().getDisplayItems(), comparator);

            // Falls die Sortierung absteigend ist, muss hier die Liste umgedreht werden
            if (model.getSortModel().getDirection().equals(SortDirection.DESCENDING)) {
                Collections.reverse(model.getDataModel().getDisplayItems());
            }
        }

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

        DataTableResult result = new DataTableResult();
        ArrayList<JsfSteuerelementeTreffer> treffer =
            Lists.newArrayList(treffer1, treffer2, treffer3, treffer4, treffer5, treffer6);
        result.setItems(treffer);
        result.setItemCount(treffer.size());
        return result;
    }

}
