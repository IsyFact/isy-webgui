package de.bund.bva.pliscommon.pliswebgui.gui.flows.awkwrapper.impl;

import de.bund.bva.pliscommon.pliswebgui.common.konstanten.FehlerSchluessel;
import de.bund.bva.pliscommon.pliswebgui.gui.flows.awkwrapper.FlowAwkWrapper;
import de.bund.bva.pliscommon.util.exception.MessageSourceFehlertextProvider;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * AWK-Wrapper für den Flow.
 *
 * @author Capgemini, Tobias Groeger
 * @version $Id: FlowAwkWrapperImpl.java 130125 2015-02-11 10:46:07Z sdm_tgroeger $
 */
public class FlowAwkWrapperImpl implements FlowAwkWrapper {

    @SuppressWarnings("null")
    @Override
    @SuppressFBWarnings(
            value = "NP_ALWAYS_NULL",
            justification = "Solved with IFE-394"
    )
    public void rufeAwkAuf() {

        // Hier könnte ein AWK-Aufruf Stattfinden

        // Erzeuge Runtime-Excption;
        String test = null;
        test.equals("123");
    }

    @Override
    public void rufeAwkFachlicheAuf() throws FachlicheAwkException {
        throw new FachlicheAwkException(FehlerSchluessel.MSG_PARAMETER_UNGUELTIG,
            new MessageSourceFehlertextProvider(), "bhknz", "12$");
    }

}
