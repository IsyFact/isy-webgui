package de.bund.bva.pliscommon.pliswebgui.gui.common.constant;

import de.bund.bva.isyfact.common.web.jsf.components.datatable.SortDirection;
import de.bund.bva.pliscommon.pliswebgui.gui.jsfvorlagen.jsfsteuerelemente.JsfSteuerelementeSortierattribut;

/**
 * Eine Konstantenklasse, um JSF den Zugriff auf Enums zu ermöglichen.
 *
 * @author Capgemini, Andreas Hörning.
 * @version $Id: EnumConstants.java 130046 2015-02-10 10:43:52Z sdm_tgroeger $
 */
public class EnumConstants {

    /**
     * Ein Sortierattribut.
     */
    private JsfSteuerelementeSortierattribut JSFSTEUERELEMENTESORTIERATTRIBUT_VORNAME =
        JsfSteuerelementeSortierattribut.VORNAME;

    /**
     * Ein Sortierattribut.
     */
    private JsfSteuerelementeSortierattribut JSFSTEUERELEMENTESORTIERATTRIBUT_NACHNAME =
        JsfSteuerelementeSortierattribut.NACHNAME;

    /**
     * Ein Sortierattribut.
     */
    private JsfSteuerelementeSortierattribut JSFSTEUERELEMENTESORTIERATTRIBUT_LOGIN =
        JsfSteuerelementeSortierattribut.LOGIN;

    /**
     * Ein Sortierattribut.
     */
    private JsfSteuerelementeSortierattribut JSFSTEUERELEMENTESORTIERATTRIBUT_ID =
        JsfSteuerelementeSortierattribut.ID;

    /**
     * Ein Sortierattribut.
     */
    private SortDirection SORTDIRECTION_ASCENDING = SortDirection.ASCENDING;

    /**
     * Ein Sortierattribut.
     */
    private SortDirection SORTDIRECTION_DESCENDING = SortDirection.DESCENDING;

    public JsfSteuerelementeSortierattribut getJSFSTEUERELEMENTESORTIERATTRIBUT_VORNAME() {
        return this.JSFSTEUERELEMENTESORTIERATTRIBUT_VORNAME;
    }

    public SortDirection getSORTDIRECTION_ASCENDING() {
        return this.SORTDIRECTION_ASCENDING;
    }

    public SortDirection getSORTDIRECTION_DESCENDING() {
        return this.SORTDIRECTION_DESCENDING;
    }

    public JsfSteuerelementeSortierattribut getJSFSTEUERELEMENTESORTIERATTRIBUT_NACHNAME() {
        return this.JSFSTEUERELEMENTESORTIERATTRIBUT_NACHNAME;
    }

    public JsfSteuerelementeSortierattribut getJSFSTEUERELEMENTESORTIERATTRIBUT_LOGIN() {
        return this.JSFSTEUERELEMENTESORTIERATTRIBUT_LOGIN;
    }

    public JsfSteuerelementeSortierattribut getJSFSTEUERELEMENTESORTIERATTRIBUT_ID() {
        return this.JSFSTEUERELEMENTESORTIERATTRIBUT_ID;
    }

}
