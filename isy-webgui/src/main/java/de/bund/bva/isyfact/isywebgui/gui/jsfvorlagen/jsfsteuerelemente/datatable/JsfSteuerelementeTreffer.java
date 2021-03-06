package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.datatable;

import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableItem;

/**
 * Repräsentiert ein Trefferobjekt.
 *
 * @author Capgemini, Andreas Hörning.
 * @version $Id: JsfSteuerelementeTreffer.java 165302 2016-05-20 11:50:30Z sdm_arichter $
 */
public class JsfSteuerelementeTreffer implements DataTableItem {
    /**
     * Die Serial-Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Die Nummer.
     */
    private String nummer;

    /**
     * Der Vorname.
     */
    private String vorname;

    /**
     * Der Nachname.
     */
    private String nachname;

    /**
     * Der Login.
     */
    private String login;

    /**
     * Das Geschlecht.
     */
    private String geschlecht;

    /**
     * Die Staatsangehoerigkeit.
     */
    private String staatsangehoerigkeit;


    public String getNummer() {
        return this.nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public String getVorname() {
        return this.vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return this.nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getStaatsangehoerigkeit() {
        return staatsangehoerigkeit;
    }

    public void setStaatsangehoerigkeit(String staatsangehoerigkeit) {
        this.staatsangehoerigkeit = staatsangehoerigkeit;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    @Override
    public long getIdentifierForItem() {
        return Long.valueOf(this.nummer);
    }

}
