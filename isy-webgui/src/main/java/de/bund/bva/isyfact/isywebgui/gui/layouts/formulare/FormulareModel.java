package de.bund.bva.isyfact.isywebgui.gui.layouts.formulare;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;

/**
 * Model für Formulare.
 *
 * @author Capgemini
 * @version $Id: FormulareModel.java 130053 2015-02-10 12:46:06Z sdm_tgroeger $
 */
public class FormulareModel extends AbstractMaskenModel {

    /**
     * Die Serial-Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Das eigentliche Formular.
     */
    private Formular formular;

    public Formular getFormular() {
        return this.formular;
    }

    public void setFormular(Formular formular) {
        this.formular = formular;
    }

}
