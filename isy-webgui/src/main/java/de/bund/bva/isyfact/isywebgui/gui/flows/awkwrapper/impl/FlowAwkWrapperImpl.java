package de.bund.bva.isyfact.isywebgui.gui.flows.awkwrapper.impl;

import de.bund.bva.isyfact.util.exception.MessageSourceFehlertextProvider;
import de.bund.bva.isyfact.isywebgui.common.konstanten.FehlerSchluessel;
import de.bund.bva.isyfact.isywebgui.gui.flows.awkwrapper.FlowAwkWrapper;

/**
 * AWK-Wrapper for the Flow.
 */
public class FlowAwkWrapperImpl implements FlowAwkWrapper {

    @Override
    public void rufeAwkAuf() {

        // AWK-call could be here

        // create Runtime-Exception:
        throw new NullPointerException("Test NPE");
    }

    @Override
    public void rufeAwkFachlicheAuf() throws FachlicheAwkException {
        throw new FachlicheAwkException(FehlerSchluessel.MSG_PARAMETER_UNGUELTIG,
            new MessageSourceFehlertextProvider(), "bhknz", "12$");
    }

}
