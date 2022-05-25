package de.bund.bva.isyfact.isywebgui.gui.common.constant;

import de.bund.bva.isyfact.common.web.jsf.components.datatable.SortDirection;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.datatable.JsfSteuerelementeSortierattribut;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.togglefilter.ToggleFilterTableDataSortAttribut;
import org.springframework.stereotype.Component;

/**
 * Eine Konstantenklasse, um JSF den Zugriff auf Enums zu ermöglichen.
 *
 * @author Capgemini
 * @version $Id: EnumConstants.java 130046 2015-02-10 10:43:52Z sdm_tgroeger $
 */
@Component
public class EnumConstants {

    public ToggleFilterTableDataSortAttribut getTOGGLEFILTERTABLEDATASORTATTRIBUT_ID() {
        return TOGGLEFILTERTABLEDATASORTATTRIBUT_ID;
    }

    public ToggleFilterTableDataSortAttribut getTOGGLEFILTERTABLEDATASORTATTRIBUT_NAME() {
        return TOGGLEFILTERTABLEDATASORTATTRIBUT_NAME;
    }

    public ToggleFilterTableDataSortAttribut getTOGGLEFILTERTABLEDATASORTATTRIBUT_INDUSTRY() {
        return TOGGLEFILTERTABLEDATASORTATTRIBUT_INDUSTRY;
    }

    public ToggleFilterTableDataSortAttribut getTOGGLEFILTERTABLEDATASORTATTRIBUT_COUNTRY_CODE() {
        return TOGGLEFILTERTABLEDATASORTATTRIBUT_COUNTRY_CODE;
    }

    public ToggleFilterTableDataSortAttribut getTOGGLEFILTERTABLEDATASORTATTRIBUT_MAIN_LOCATION() {
        return TOGGLEFILTERTABLEDATASORTATTRIBUT_MAIN_LOCATION;
    }

    /**
     * Ein Sortierattribut.
     */
    private ToggleFilterTableDataSortAttribut TOGGLEFILTERTABLEDATASORTATTRIBUT_ID =
            ToggleFilterTableDataSortAttribut.ID;

    /**
     * Ein Sortierattribut.
     */
    private ToggleFilterTableDataSortAttribut TOGGLEFILTERTABLEDATASORTATTRIBUT_NAME =
            ToggleFilterTableDataSortAttribut.NAME;

    /**
     * Ein Sortierattribut.
     */
    private ToggleFilterTableDataSortAttribut TOGGLEFILTERTABLEDATASORTATTRIBUT_INDUSTRY =
            ToggleFilterTableDataSortAttribut.INDUSTRY;

    /**
     * Ein Sortierattribut.
     */
    private ToggleFilterTableDataSortAttribut TOGGLEFILTERTABLEDATASORTATTRIBUT_COUNTRY_CODE =
            ToggleFilterTableDataSortAttribut.COUNTRY_CODE;

    /**
     * Ein Sortierattribut.
     */
    private ToggleFilterTableDataSortAttribut TOGGLEFILTERTABLEDATASORTATTRIBUT_MAIN_LOCATION =
            ToggleFilterTableDataSortAttribut.MAIN_LOCATION;

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
