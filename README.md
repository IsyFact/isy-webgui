## IsyFact WebGUI lokal starten:
1. Tomcat Server 9.x herunterladen und installieren. (https://tomcat.apache.org/download-90.cgi)
2. In Ordner 'isy-webgui/isy-webgui' den Aufruf 'mvn clean install' oder 'mvn clean verify' ausführen. 
(Hinweis: Nicht gefundene Abhängigkeiten aus anderen IsyFact Bibliotheken müssen zuvor im Repository abgelegt oder lokal gebaut werden.
Das sind in der Regel isyfact-standards, isy-web und isy-style)
3. Run Configuration über IntelliJ erstellen:
   1. Tomcat Server Lokal auswählen
   2. Unter 'Application Server -> Configure' den Pfad zu dem heruntergeladenen und installierten Tomcat 9.x auswählen.
   3. Unter 'Deployment' das Artefact 'isy-webgui:war' auswählen.
      Im unteren Bereich muss für korrektes Routing unter 'Application context' die default-Auswahl von '/isy_webgui_war' zu '/isy-webgui' geändert werden
   4. Unter 'Startup/Connection' muss eine Environment Variable hinzugefügt werden:
      1. Name  ->  'spring.profiles.active'
      2. Value  ->  'entwicklung'
4. Anschließend den Server starten.