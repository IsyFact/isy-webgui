package de.bund.bva.isyfact.isywebgui.servlet.requesthandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import de.bund.bva.isyfact.common.web.jsf.components.listpicker.ListpickerGuiItem;
import de.bund.bva.isyfact.common.web.servlet.requesthandler.AbstractListpickerProviderRequestHandler;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeListpickerController;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeListpickerItem;

/**
 * Konkrete Implementierung von {@link AbstractListpickerProviderRequestHandler} für Demo-Zwecke.
 */
public class ListpickerProviderRequestHandler extends AbstractListpickerProviderRequestHandler {

    /**
     * Für Demo-Zwecke reicht uns hier der {@link JsfSteuerelementeListpickerController}. In einem realen
     * Szenario würde eventuell eine Schnittstelle eingebunden werden, um die Werte für den Listpicker aus
     * einem anderen System zu beziehen o.Ä. Der Controller steht jedenfalls stellvertretend für die
     * Bezugsquelle der Items.
     */
    private JsfSteuerelementeListpickerController jsfSteuerelementeListpickerController;

    public ListpickerProviderRequestHandler(
        JsfSteuerelementeListpickerController jsfSteuerelementeListpickerController) {
        this.jsfSteuerelementeListpickerController = jsfSteuerelementeListpickerController;
    }

    @Override
    public List<ListpickerGuiItem> erzeugeGuiItems(String filterWert,
        Map<String, String> weitereFilterKriterien) {

        // Gesamtmenge beziehen.
        List<JsfSteuerelementeListpickerItem> listpickerItems =
            this.jsfSteuerelementeListpickerController.erzeugeListpickerItemListe();

        // Hier passiert das eigentliche Filtern. Wir filtern z.B. anhand des Schlüssels, aber es kann
        // natürlich auch anhand anderer/weiterer Attribute gefiltert werden.
        List<JsfSteuerelementeListpickerItem> listpickerItemsGefiltert = listpickerItems.stream()
            .filter(item -> item.getSchluessel().contains(filterWert)).collect(Collectors.toList());

        // Die Items müssen in ListpickerGuiItem-Instanzen umgewandelt werden.
        List<ListpickerGuiItem> guiItems = new ArrayList<>();
        for (JsfSteuerelementeListpickerItem item : listpickerItemsGefiltert) {
            List<String> attributlist = new ArrayList<>();
            attributlist.add(item.getSchluessel());
            attributlist.add(item.getWert());
            guiItems.add(new ListpickerGuiItem(attributlist, item.getSchluessel()));
        }

        return guiItems;
    }

    @Override
    public List<String> getWeitereFilterParameter() {
        // Keine weiteren Kriterien benötigt!
        return null;
    }

    @Override
    public int getMaxElemente() {
        // Würde tendenziell aus der Konfiguration kommen. Hier für Demo-Zwecke fester Wert!
        return 5;
    }

    @Override
    public String getMessageBegrenzung() {
        // Würde tendenziell aus der Konfiguration kommen. Hier für Demo-Zwecke fester Wert!
        return "Bitte weiter filtern...";
    }
}
