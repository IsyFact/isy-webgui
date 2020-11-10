package de.bund.bva.isyfact.isywebgui.gui.flows.awkwrapper.impl;

import de.bund.bva.isyfact.exception.BusinessException;
import de.bund.bva.isyfact.exception.FehlertextProvider;

/**
 * Fachliche AWK-Exception.
 *
 * @author Capgemini
 * @version $Id: FachlicheAwkException.java 130053 2015-02-10 12:46:06Z sdm_tgroeger $
 */
public class FachlicheAwkException extends BusinessException {

    /**
     * Die Serial-Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Konstruktor.
     * @param ausnahmeId
     *            Ausnahme-Id
     * @param fehlertextProvider
     *            Fehlertext-Provider
     * @param parameter
     *            die Parameter
     */
    public FachlicheAwkException(String ausnahmeId, FehlertextProvider fehlertextProvider,
        String... parameter) {
        super(ausnahmeId, fehlertextProvider, parameter);
    }

    /**
     * Konstruktor.
     * @param ausnahmeId
     *            Ausnahme-Id
     * @param throwable
     *            Throwable
     * @param fehlertextProvider
     *            Fehlertext-Provider
     * @param parameter
     *            die Parameter
     */
    public FachlicheAwkException(String ausnahmeId, Throwable throwable,
        FehlertextProvider fehlertextProvider, String... parameter) {
        super(ausnahmeId, throwable, fehlertextProvider, parameter);
    }

}
