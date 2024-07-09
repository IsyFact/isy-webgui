package de.bund.bva.isyfact.isywebgui.gui.flows.awkwrapper;

import de.bund.bva.isyfact.isywebgui.gui.flows.awkwrapper.impl.FachlicheAwkException;

/**
 * Der Flow-AWK-Wrapper.
 *
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
