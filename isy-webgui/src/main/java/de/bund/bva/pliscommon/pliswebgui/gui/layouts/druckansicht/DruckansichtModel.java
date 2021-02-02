package de.bund.bva.pliscommon.pliswebgui.gui.layouts.druckansicht;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;

/**
 * Model for the print view.
 */
public class DruckansichtModel extends AbstractMaskenModel {
    /**
     * The serial version UID.
     */
    private static final long serialVersionUID = 1L;

    private int postCounter;

    public int getPostCounter() {
        return postCounter;
    }

    public void setPostCounter(int postCounter) {
        this.postCounter = postCounter;
    }
}
