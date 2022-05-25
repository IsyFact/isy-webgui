package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.togglefilter;

import de.bund.bva.isyfact.common.web.jsf.components.datatable.SortAttribute;
import de.bund.bva.isyfact.common.web.sorting.InMemoryPropertySortAttribute;

public enum ToggleFilterTableDataSortAttribut implements SortAttribute, InMemoryPropertySortAttribute {

    /**
     * Ein Sortierattribut.
     */
    ID("number"),

    /**
     * Ein Sortierattribut.
     */
    NAME("name"),

    /**
     * Ein Sortierattribut.
     */
    INDUSTRY("industry"),

    /**
     * Ein Sortierattribut.
     */
    COUNTRY_CODE("countryCode"),

    /**
     * Ein Sortierattribut.
     */
    MAIN_LOCATION("mainLocation");

    /**
     * Der Propertyname des Sortierattributs.
     */
    private String sortProperty;

    /**
     * Konstruktor.
     *
     * @param sortProperty
     *            Der Propertyname des Sortierattributs.
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
