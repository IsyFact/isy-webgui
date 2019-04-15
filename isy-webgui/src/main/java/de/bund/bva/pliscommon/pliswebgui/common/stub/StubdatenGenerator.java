package de.bund.bva.pliscommon.pliswebgui.common.stub;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.List;

import com.google.common.collect.Lists;
import de.bund.bva.pliscommon.pliswebgui.gui.jsfvorlagen.jsfsteuerelemente.JsfSteuerelementeTreffer;

/**
 * Datengenerator zur Erstellung von Stub/Mock-Daten. Nur zu Test- und Entwicklungszwecken verwenden!
 */
public class StubdatenGenerator {

    /** Zufallswert. */
    private static final Random RANDOM = new Random();

    /**
     * Erzeuge eine Suchergebnisliste mit PersonDataTableItem__.
     *
     * @return die erzeugte Trefferliste.
     */
    public static List<JsfSteuerelementeTreffer> erzeugePersonalienTrefferliste() {
        List<JsfSteuerelementeTreffer> personalienTreffer = new ArrayList<JsfSteuerelementeTreffer>();

        JsfSteuerelementeTreffer personDataTableItem1 = new JsfSteuerelementeTreffer();
        personDataTableItem1.setNummer("101");
        personDataTableItem1.setLogin("mustHans");
        personDataTableItem1.setNachname("Mustermann");
        personDataTableItem1.setVorname("Hans");
        personDataTableItem1.setGeschlecht("m");
        personDataTableItem1.setStaatsangehoerigkeit("ITA");
        personalienTreffer.add(personDataTableItem1);

        JsfSteuerelementeTreffer personDataTableItem2 = new JsfSteuerelementeTreffer();
        personDataTableItem2.setNummer("200");
        personDataTableItem2.setLogin("zahnLisa");
        personDataTableItem2.setNachname("Zahnfee");
        personDataTableItem2.setVorname("Lisa");
        personDataTableItem2.setGeschlecht("w");
        personDataTableItem2.setStaatsangehoerigkeit("HIM");
        personalienTreffer.add(personDataTableItem2);

        JsfSteuerelementeTreffer personDataTableItem3 = new JsfSteuerelementeTreffer();
        personDataTableItem3.setNummer("382");
        personDataTableItem3.setLogin("doeJohn");
        personDataTableItem3.setNachname("Doe");
        personDataTableItem3.setVorname("John");
        personDataTableItem3.setGeschlecht("m");
        personDataTableItem3.setStaatsangehoerigkeit("USA");
        personalienTreffer.add(personDataTableItem3);

        JsfSteuerelementeTreffer personDataTableItem4 = new JsfSteuerelementeTreffer();
        personDataTableItem4.setNummer("882");
        personDataTableItem4.setLogin("buschWilli");
        personDataTableItem4.setNachname("Busch");
        personDataTableItem4.setVorname("Wilhelm");
        personDataTableItem4.setGeschlecht("m");
        personDataTableItem4.setStaatsangehoerigkeit("DEU");
        personalienTreffer.add(personDataTableItem4);

        return personalienTreffer;
    }
}

