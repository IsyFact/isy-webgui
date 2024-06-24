package de.bund.bva.isyfact.isywebgui.gui.flows.validierung;

import de.bund.bva.isyfact.common.web.jsf.components.listpicker.ListpickerItem;

/**
 * Schlüssel für einen Staat.
 *
 */
public class StaatSchluessel implements ListpickerItem {

    /**
     * Die Serial-Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Der Schlüssel.
     */
    private String schluessel;

    /**
     * Der Wert.
     */
    private String wert;

    /**
     * Erzeugt einen neuen Schluessel.
     *
     * @param schluessel
     *            Der Schlüssel.
     * @param wert
     *            Der Schlüsselwert.
     */
    public StaatSchluessel(String schluessel, String wert) {
        super();
        this.schluessel = schluessel;
        this.wert = wert;
    }

    public String getSchluessel() {
        return this.schluessel;
    }

    public String getWert() {
        return this.wert;
    }

    @Override
    public String getValueForItem() {
        return getSchluessel();
    }

    @Override
    public String getReadableValueForItem() {
        return getWert();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getListpickerValueForItem() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCssClass() {
        // TODO Auto-generated method stub
        return null;
    }

}
