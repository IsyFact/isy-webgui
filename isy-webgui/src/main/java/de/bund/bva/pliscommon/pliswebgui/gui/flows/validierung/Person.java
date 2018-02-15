package de.bund.bva.pliscommon.pliswebgui.gui.flows.validierung;

import java.io.Serializable;

/**
 * Eine Testdatenklasse für das Validierungsbeispiel.
 *
 * @author Capgemini, Andreas Hörning
 * @version $Id: Person.java 166449 2016-06-06 12:15:53Z sdm_arichter $
 */
public class Person implements Serializable {
    /**
     * Die Serial-Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Nachname.
     */
    private String nachname;

    /**
     * Geburtsdatum.
     */
    private String geburtsdatum;

    /**
     * Gefährlich oder nicht.
     */
    private boolean gefaehrlich;

    /**
     * Freundlich oder nicht.
     */
    private boolean freundlich;

    /**
     * Geburtsstaat.
     */
    private String geburtsstaat;

    public String getNachname() {
        return this.nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGeburtsdatum() {
        return this.geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public boolean isGefaehrlich() {
        return this.gefaehrlich;
    }

    public void setGefaehrlich(boolean gefaehrlich) {
        this.gefaehrlich = gefaehrlich;
    }

    public String getGeburtsstaat() {
        return this.geburtsstaat;
    }

    public void setGeburtsstaat(String geburtsstaat) {
        this.geburtsstaat = geburtsstaat;
    }

    public boolean isFreundlich() {
        return freundlich;
    }

    public void setFreundlich(boolean freundlich) {
        this.freundlich = freundlich;
    }

}
