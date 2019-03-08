package de.bund.bva.pliscommon.pliswebgui.common.servlet.requesthandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Required;

import de.bund.bva.isyfact.common.web.jsf.components.listpicker.ListpickerGuiItem;
import de.bund.bva.isyfact.common.web.jsf.components.listpicker.ListpickerGuiKonfiguration;
import de.bund.bva.isyfact.common.web.servlet.requesthandler.AbstractListpickerProviderRequestHandler;
import de.bund.bva.pliscommon.pliswebgui.gui.jsfvorlagen.jsfsteuerelemente.JsfSteuerelementeListpickerController;
import de.bund.bva.pliscommon.pliswebgui.gui.jsfvorlagen.jsfsteuerelemente.JsfSteuerelementeListpickerItem;

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

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        // Frage Parameter ab
        String filter = getParameter(request, "filter");

        // Gesamtmenge beziehen.
        List<JsfSteuerelementeListpickerItem> listpickerItems =
            this.jsfSteuerelementeListpickerController.erzeugeListpickerItemListe();

        // Hier passiert das eigentliche Filtern. Wir filtern z.B. anhand des Schlüssels, aber es kann
        // natürlich auch anhand anderer/weiterer Attribute gefilter werden.
        List<JsfSteuerelementeListpickerItem> listpickerItemsGefiltert = listpickerItems.stream()
            .filter(item -> item.getSchluessel().contains(filter)).collect(Collectors.toList());

        // Die Items müssen in ListpickerGuiItem-Instanzen umgewandelt werden.
        List<ListpickerGuiItem> guiItems = new ArrayList<>();
        for (JsfSteuerelementeListpickerItem item : listpickerItemsGefiltert) {
            List<String> attributlist = new ArrayList<>();
            attributlist.add(item.getSchluessel());
            attributlist.add(item.getWert());
            guiItems.add(new ListpickerGuiItem(attributlist, item.getSchluessel()));
        }

        // Anschließend noch in Json umwandeln, welches dann im JavaScript verarbeitet wird. Hierzu bietet es
        // sich an, die Methode des Parents zu verwenden.
        String jsonString = wandleInJson(new ListpickerGuiKonfiguration(guiItems,
            "Nach 5 Items kommt eine Info. Bitte weiter filtern", 5));
        response.getWriter().write(jsonString);

    }

    @Required
    public void setJsfSteuerelementeListpickerController(
        JsfSteuerelementeListpickerController jsfSteuerelementeListpickerController) {
        this.jsfSteuerelementeListpickerController = jsfSteuerelementeListpickerController;
    }
}
