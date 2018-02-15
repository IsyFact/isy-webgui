package de.bund.bva.pliscommon.pliswebgui.gui.flows.awkwrapper;

import de.bund.bva.pliscommon.pliswebgui.gui.flows.awkwrapper.impl.FachlicheAwkException;

/**
 * Der Flow-AWK-Wrapper.
 *
 * @author Capgemini, Tobias Groeger
 * @version $Id: FlowAwkWrapper.java 130125 2015-02-11 10:46:07Z sdm_tgroeger $
 */
public interface FlowAwkWrapper {

    /**
     * Ruft den AWK auf.
     */
    public void rufeAwkAuf();

    /**
     * Ruft den AWK fachlich auf.
     * @throws FachlicheAwkException
     *             Fachlicher Fehler im AWK
     */
    public void rufeAwkFachlicheAuf() throws FachlicheAwkException;

}
