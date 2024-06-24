package de.bund.bva.isyfact.isywebgui.gui.flows.validierung;

import java.util.List;

import com.google.common.collect.Lists;

import de.bund.bva.isyfact.common.web.jsf.components.listpicker.ListpickerModel;

/**
 * Model für den StaatListpicker.
 *
 */
public class StaatListpickerModel extends ListpickerModel<StaatSchluessel> {

    /**
     * Die Serial-Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Konstruktor.
     */
    public StaatListpickerModel() {
        super();
        getItems().add(new StaatSchluessel("DEU", "Deutschland"));
        getItems().add(new StaatSchluessel("FRA", "Frankreich"));
        getItems().add(new StaatSchluessel("ITA", "Italien"));
        getItems().add(new StaatSchluessel("NED", "Niederlande"));
    }

    @Override
    public List<String> getColumnPropertyKeys() {
        return Lists.newArrayList("schluessel", "wert");
    }

}
