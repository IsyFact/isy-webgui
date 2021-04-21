package de.bund.bva.isyfact.isywebgui.common;

/*
 * #%L
 * Terminfindung
 * %%
 * Copyright (C) 2015 - 2016 Bundesverwaltungsamt (BVA), msg systems ag
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import de.bund.bva.isyfact.aufrufkontext.impl.AufrufKontextImpl;
import de.bund.bva.isyfact.sicherheit.accessmgr.AccessManager;
import de.bund.bva.isyfact.sicherheit.common.exception.AuthentifizierungFehlgeschlagenException;
import de.bund.bva.isyfact.sicherheit.common.exception.AuthentifizierungTechnicalException;

/**
 * Einfache Implementierung eines Access Managers gemäß isy-sicherheit.
 *
 * @author msg systems ag
 */

public class AccessManagerDummy implements AccessManager<AufrufKontextImpl, AuthentifizierungsErgebnisDummy> {

	@Override
	public AuthentifizierungsErgebnisDummy authentifiziere(
			AufrufKontextImpl arg0) throws AuthentifizierungTechnicalException,
		AuthentifizierungFehlgeschlagenException {

		AuthentifizierungsErgebnisDummy ergebnis = null;
		
		String kennung = arg0.getDurchfuehrenderBenutzerKennung();
		String passwort = arg0.getDurchfuehrenderBenutzerPasswort();
		
		// Das ist eine Dummy Implementierung, die gültigen Kombinationen von
		// Benutzername und Passwort sind nachfolgend im Code hinterlegt
		// TODO Erweitern um eine echte Berechtigungsprüfung z.B. gegen ein XML-Datei oder gegen ein LDAP
		
		if (("admin".equals(kennung) && "admin".equals(passwort))) {
			
			ergebnis = new AuthentifizierungsErgebnisDummy();
			ergebnis.setAnmeldename(kennung);
			ergebnis.setRollenIds(new String[]{"Administrator","Benutzer"});
		}
		else if (("user".equals(kennung) && "user".equals(passwort))) {
			
			ergebnis = new AuthentifizierungsErgebnisDummy();
			ergebnis.setAnmeldename(kennung);
			ergebnis.setRollenIds(new String[]{"Benutzer"});
		} 
		
		return ergebnis;
	}

	@Override
	public void befuelleAufrufkontext(AufrufKontextImpl aufrufkontext,
			AuthentifizierungsErgebnisDummy ergebnis) {

		// befüllt den übergebenen Aufrufkontext mit den Ergebnissen 
		// einer vorher stattgefundenen Authentifzierung, die in 
		// einem entsprechenden Ergebnis-Objekt hinter legt sind.
		// In dieser Dummy-Implementierung ist nur das Feld mit den Rollen-Array relevant.
		// Diese Methode kopiert die Rollen in den Aufrufkontext
		
		aufrufkontext.setRolle(ergebnis.getRollenIds());
	}

	@Override
	public Object erzeugeCacheSchluessel(AufrufKontextImpl aufrufkontext) {
		return null;
	}

	@Override
	public void logout(AuthentifizierungsErgebnisDummy aufrufkontext) {
		// Nichts zu tun hier
	}

	@Override
	public boolean pingAccessManager() {

		return true; // Der Dummy Access Manager ist lokal und immer erreichbar.
	}

	@Override
	public boolean pingAccessManagerByLoginLogout(AufrufKontextImpl aufrufkontext) {

		return true; // Der Dummy Access Manager ist lokal und immer erreichbar.
	}


}
