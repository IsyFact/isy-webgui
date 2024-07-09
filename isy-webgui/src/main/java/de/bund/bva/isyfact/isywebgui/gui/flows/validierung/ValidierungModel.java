package de.bund.bva.isyfact.isywebgui.gui.flows.validierung;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;
import de.bund.bva.isyfact.common.web.jsf.components.listpicker.ListpickerModel;

/**
 * Model für die Validierung.
 *
 */
public class ValidierungModel extends AbstractMaskenModel {
    /**
     * Die Serial-Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * ListpickerModel für die Staatenschlüssel.
     */
    private ListpickerModel<StaatSchluessel> staatListpickerModel = new StaatListpickerModel();

    /**
     * Eine Person.
     */
    private Person person;

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ListpickerModel<StaatSchluessel> getStaatListpickerModel() {
        return this.staatListpickerModel;
    }

    public void setStaatListpickerModel(ListpickerModel<StaatSchluessel> staatListpickerModel) {
        this.staatListpickerModel = staatListpickerModel;
    }

}
