package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.datatable;

import de.bund.bva.isyfact.common.web.jsf.components.datatable.DataTableItem;

/**
 * Represents a result object.
 */
public class JsfSteuerelementeTreffer implements DataTableItem {
    /**
     * Serial version ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Number.
     */
    private String nummer;

    /**
     * First name
     */
    private String vorname;

    /**
     * Last name
     */
    private String nachname;

    /**
     * Login.
     */
    private String login;

    /**
     * Gender.
     */
    private String geschlecht;

    /**
     * Nationality.
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
        return Long.parseLong(this.nummer);
    }

}
