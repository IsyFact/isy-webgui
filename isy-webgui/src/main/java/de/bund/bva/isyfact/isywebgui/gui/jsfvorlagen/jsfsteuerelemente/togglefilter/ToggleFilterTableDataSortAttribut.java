package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.togglefilter;

import de.bund.bva.isyfact.common.web.jsf.components.datatable.SortAttribute;
import de.bund.bva.isyfact.common.web.sorting.InMemoryPropertySortAttribute;

public enum ToggleFilterTableDataSortAttribut implements SortAttribute, InMemoryPropertySortAttribute {

    /**
     * A sort attribut
     */
    ID("number"),

    /**
     * A sort attribut
     */
    NAME("name"),

    /**
     * A sort attribut
     */
    INDUSTRY("industry"),

    /**
     * A sort attribut
     */
    COUNTRY_CODE("countryCode"),

    /**
     * A sort attribut
     */
    MAIN_LOCATION("mainLocation");

    /**
     * property name of a sort attribut
     */
    private String sortProperty;

    /**
     * Constructor.
     *
     * @param sortProperty
     *                 property name of a sort attribut
     */
    private ToggleFilterTableDataSortAttribut(String sortProperty) {
        this.sortProperty = sortProperty;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSortProperty() {
        return this.sortProperty;
    }
}
