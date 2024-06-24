package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.datatable;

import de.bund.bva.isyfact.common.web.jsf.components.datatable.SortAttribute;
import de.bund.bva.isyfact.common.web.sorting.InMemoryPropertySortAttribute;

/**
 * Das Sortierattribut.
 *
 */
public enum JsfSteuerelementeSortierattribut implements SortAttribute, InMemoryPropertySortAttribute {

    /**
     * Ein Sortierattribut.
     */
    VORNAME("vorname"),

    /**
     * Ein Sortierattribut.
     */
    NACHNAME("nachname"),

    /**
     * Ein Sortierattribut.
     */
    LOGIN("login"),

    /**
     * Ein Sortierattribut.
     */
    ID("nummer");

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
    private JsfSteuerelementeSortierattribut(String sortProperty) {
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
