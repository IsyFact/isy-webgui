## IsyFact WebGUI lokal starten:
1. In Ordner 'isy-webgui/isy-webgui' den Aufruf 'mvn install' ausführen (Hinweis: Nicht gefundene Abhängigkeiten aus anderen IsyFact Bibliotheken müssen zuvor im Repository abgelegt oder lokal gebaut werden)
2. Tomcat Server mit WAR-File aus 'isy-webgui/isy-webgui/target' konfigurieren
3. Tomcat Server mit VM-Option '-Dspring.profiles.active=entwicklung' starten