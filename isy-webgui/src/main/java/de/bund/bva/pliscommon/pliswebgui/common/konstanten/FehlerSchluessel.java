package de.bund.bva.pliscommon.pliswebgui.common.konstanten;

/**
 * Diese Klasse enthält Konstanten Fehlerschluessel.
 *
 * @author Capgemini, Jonas Zitz
 * @version $Id: FehlerSchluessel.java 130053 2015-02-10 12:46:06Z sdm_tgroeger $
 */
public abstract class FehlerSchluessel {

    /** Validierungsfehler. */
    public static final String MSG_ALLGEMEINER_VALIDIERUNGSFEHLER = "WEBGI20000";

    // //////////// Allgemeine technische Fehler ///////////////////

    /** Es ist ein technischer Fehler im Modul plisweb-gui aufgetreten: {0} . */
    public static final String MSG_ALLGEMEINER_TECHNISCHER_FEHER_MIT_PARAMETER = "WEBGI90000";

    /** Der übergebene Parameter {0} besitzt den ungültigen Wert {1}. */
    public static final String MSG_PARAMETER_UNGUELTIG = "WEBGI90001";

    /** Es ist ein technischer Fehler im Modul plisweb-gui aufgetreten. */
    public static final String MSG_ALLGEMEINER_TECHNISCHER_FEHLER = "WEBGI99999";

}
