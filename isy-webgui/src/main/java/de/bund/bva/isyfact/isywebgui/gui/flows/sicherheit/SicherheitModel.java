package de.bund.bva.isyfact.isywebgui.gui.flows.sicherheit;

import de.bund.bva.isyfact.common.web.global.AbstractMaskenModel;

/**
 * Model für die Sicherheit.
 *
 */
public class SicherheitModel extends AbstractMaskenModel {

    /**
     * Die Serial-Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Der Benutzername.
     */
    private String benutzername;

    /**
     * Der Login.
     */
    private String login;

    /**
     * Die Kennung.
     */
    private String kennung;

    /**
     * Die Rollen.
     */
    private String rollen;

    public String getBenutzername() {
        return this.benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getKennung() {
        return this.kennung;
    }

    public void setKennung(String kennung) {
        this.kennung = kennung;
    }

    public String getRollen() {
        return this.rollen;
    }

    public void setRollen(String rollen) {
        this.rollen = rollen;
    }

}
