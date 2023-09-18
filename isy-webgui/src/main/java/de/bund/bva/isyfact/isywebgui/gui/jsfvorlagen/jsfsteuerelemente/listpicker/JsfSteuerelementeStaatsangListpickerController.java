package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import de.bund.bva.isyfact.common.web.jsf.components.listpicker.ListpickerController;

/**
 * Controller für den Listpicker.
 */
@Component
public class JsfSteuerelementeStaatsangListpickerController extends
        ListpickerController<JsfSteuerelementeStaatsangListpickerModel> implements InitializingBean {

    /**
     * {@inheritDoc}
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        // Wird nicht verwendet

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void filter(JsfSteuerelementeStaatsangListpickerModel model) {
        // Ist nur bei AJAX-Listpickern zu implementieren
    }

    /**
     * Erzeugt eine Liste an ListpickerItems.
     *
     * @return Die Liste.
     * <p>
     * Beispieldaten: Statistisches Bundesamt, Staats- und Gebietssystematik, Stand 01.03.2018
     */
    public List<JsfSteuerelementeListpickerItem> erzeugeListpickerItemListe() {

        List<JsfSteuerelementeListpickerItem> jsfSteuerelementeListpickerItems = new ArrayList<>();

        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("423", "Afghanistan"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("287", "Ägypten"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("121", "Albanien"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("221", "Algerien"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("123", "Andorra"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("223", "Angola"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("320", "Antigua und Barbuda"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("274", "Äquatorialguinea"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("323", "Argentinien"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("422", "Armenien"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("425", "Aserbaidschan"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("225", "Äthiopien"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("523", "Australien"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("324", "Bahamas"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("368", "... viele weitere Staaten"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("168", "Vereinigtes Königreich"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("432", "Vietnam"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("169", "Weißrussland"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("289", "Zentralafrikanische Republik"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("181", "Zypern"));

        return jsfSteuerelementeListpickerItems;
    }
}
