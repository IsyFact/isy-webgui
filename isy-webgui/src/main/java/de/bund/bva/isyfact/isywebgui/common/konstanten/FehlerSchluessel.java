package de.bund.bva.isyfact.isywebgui.common.konstanten;

/**
 * Diese Klasse enthält Konstanten Fehlerschluessel.
 *
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
