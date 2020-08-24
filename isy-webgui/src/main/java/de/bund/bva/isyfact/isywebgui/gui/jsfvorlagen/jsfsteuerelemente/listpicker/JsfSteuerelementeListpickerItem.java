package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker;

import de.bund.bva.isyfact.common.web.jsf.components.listpicker.ListpickerItem;

/**
 * Item des Listpickers.
 *
 * @author Capgemini, Tobias Gröger
 * @version $Id: JsfSteuerelementeListpickerItem.java 164631 2016-05-11 12:16:09Z sdm_arichter $
 */
public class JsfSteuerelementeListpickerItem implements ListpickerItem {

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
     * Konstruktur.
     * @param schluessel
     *            der Schlüssel
     * @param wert
     *            der Wert
     */
    public JsfSteuerelementeListpickerItem(String schluessel, String wert) {
        super();
        this.schluessel = schluessel;
        this.wert = wert;
    }

    public String getSchluessel() {
        return this.schluessel;
    }

    public void setSchluessel(String schluessel) {
        this.schluessel = schluessel;
    }

    public String getWert() {
        return this.wert;
    }

    public void setWert(String wert) {
        this.wert = wert;
    }

    @Override
    public String getValueForItem() {
        return this.schluessel;
    }

    @Override
    public String getReadableValueForItem() {
        return this.schluessel + " - " + this.wert;
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
