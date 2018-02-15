package de.bund.bva.pliscommon.pliswebgui.gui.flows.modalerdialog;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;

/**
 * Model für den Bestätigungsdialog.
 */
public class BestaetigungsdialogModel extends AbstractMaskenModel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String getroffeneEntscheidung;

    public String getGetroffeneEntscheidung() {
        return this.getroffeneEntscheidung;
    }

    public void setGetroffeneEntscheidung(String getroffeneEntscheidung) {
        this.getroffeneEntscheidung = getroffeneEntscheidung;
    }
}
