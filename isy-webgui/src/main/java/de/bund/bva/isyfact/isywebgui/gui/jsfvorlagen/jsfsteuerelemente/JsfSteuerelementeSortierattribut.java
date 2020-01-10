package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente;

import de.bund.bva.isyfact.common.web.jsf.components.datatable.SortAttribute;
import de.bund.bva.isyfact.common.web.sorting.InMemoryPropertySortAttribute;

/**
 * Das Sortierattribut.
 *
 * @author Capgemini, Tobias Gröger
 * @version $Id: JsfSteuerelementeSortierattribut.java 165302 2016-05-20 11:50:30Z sdm_arichter $
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
