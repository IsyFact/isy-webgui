package de.bund.bva.isyfact.isywebgui.common.stub;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.datatable.JsfSteuerelementeTreffer;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.togglefilter.ToggleFilterTableData;

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

    /**
     * Erzeuge eine Suchergebnisliste mit ToggleFilterTableDataItem__.
     *
     * @return die erzeugte Trefferliste.
     */
    public static List<ToggleFilterTableData> createDummyToggleFilterTableData() {
        List<ToggleFilterTableData> tableDataList = new ArrayList<ToggleFilterTableData>();

        ToggleFilterTableData tableData1 = new ToggleFilterTableData();
        tableData1.setNumber("001");
        tableData1.setName("Bäckerei Mustermann");
        tableData1.setIndustry("Essen & Trinken");
        tableData1.setCountryCode("DE");
        tableData1.setMainLocation("Hamburg");
        tableDataList.add(tableData1);

        ToggleFilterTableData tableData2 = new ToggleFilterTableData();
        tableData2.setNumber("002");
        tableData2.setName("Kunstmuseum De L'art");
        tableData2.setIndustry("Unterhaltung");
        tableData2.setCountryCode("DE");
        tableData2.setMainLocation("Berlin");
        tableDataList.add(tableData2);

        ToggleFilterTableData tableData3 = new ToggleFilterTableData();
        tableData3.setNumber("003");
        tableData3.setName("Santé");
        tableData3.setIndustry("Medizin");
        tableData3.setCountryCode("FR");
        tableData3.setMainLocation("Lyon");
        tableDataList.add(tableData3);

        ToggleFilterTableData tableData4 = new ToggleFilterTableData();
        tableData4.setNumber("004");
        tableData4.setName("Bon divertissement");
        tableData4.setIndustry("Unterhaltung");
        tableData4.setCountryCode("FR");
        tableData4.setMainLocation("Paris");
        tableDataList.add(tableData4);

        ToggleFilterTableData tableData5 = new ToggleFilterTableData();
        tableData5.setNumber("005");
        tableData5.setName("Buen pan");
        tableData5.setIndustry("Essen & Trinken");
        tableData5.setCountryCode("SP");
        tableData5.setMainLocation("Madrid");
        tableDataList.add(tableData5);

        return tableDataList;
    }
}

