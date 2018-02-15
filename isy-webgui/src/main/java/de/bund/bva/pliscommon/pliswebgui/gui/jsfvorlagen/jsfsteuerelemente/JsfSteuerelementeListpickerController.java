package de.bund.bva.pliscommon.pliswebgui.gui.jsfvorlagen.jsfsteuerelemente;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import de.bund.bva.isyfact.common.web.jsf.components.listpicker.ListpickerController;

/**
 * Controller für den Listpicker.
 * @author Capgemini, Tobias Gröger
 * @version $Id: JsfSteuerelementeListpickerController.java 130068 2015-02-10 14:09:46Z sdm_tgroeger $
 */
public class JsfSteuerelementeListpickerController extends
    ListpickerController<JsfSteuerelementeListpickerModel> implements InitializingBean {

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
    public void filter(JsfSteuerelementeListpickerModel model) {
        // Wird nur vom AJAX-Listpicker verwendet!

        List<JsfSteuerelementeListpickerItem> ungefilterteItems = erzeugeListpickerItemListe();

        List<JsfSteuerelementeListpickerItem> gefilterteBehoerdeListpickerItems = new ArrayList<>();

        for (int i = 0; i < ungefilterteItems.size(); i++) {

            JsfSteuerelementeListpickerItem filterbaresItem = ungefilterteItems.get(i);

            if (Strings.isNullOrEmpty(model.getFilter())) {
                gefilterteBehoerdeListpickerItems.add(filterbaresItem);
            } else if (filterbaresItem.getSchluessel().toLowerCase()
                .contains(model.getFilter().toLowerCase())
                || filterbaresItem.getWert().startsWith(model.getFilter())) {
                gefilterteBehoerdeListpickerItems.add(filterbaresItem);
            }
        }

        model.setItems(gefilterteBehoerdeListpickerItems);
        model.setItemCount(gefilterteBehoerdeListpickerItems.size());

        begrenzeItems(model);
    }

    /**
     * Erzeugt eine Liste an ListpickerItems.
     * @return Die Liste.
     */
    public List<JsfSteuerelementeListpickerItem> erzeugeListpickerItemListe() {

        List<JsfSteuerelementeListpickerItem> jsfSteuerelementeListpickerItems = new ArrayList<>();

        jsfSteuerelementeListpickerItems
            .add(new JsfSteuerelementeListpickerItem("001", "Testeintrag 1 AB C"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("002", "Testeintrag 2 HWE"));
        jsfSteuerelementeListpickerItems
            .add(new JsfSteuerelementeListpickerItem("003", "Testeintrag 3 GfeS"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("004",
            "Testeintrag 4 AB C sd sehrlangerEintragInEinemWort"));
        jsfSteuerelementeListpickerItems
            .add(new JsfSteuerelementeListpickerItem("005", "Testeintrag 5 XYZ'"));
        jsfSteuerelementeListpickerItems
            .add(new JsfSteuerelementeListpickerItem("006", "Testeintrag 6 4711'"));
        jsfSteuerelementeListpickerItems
            .add(new JsfSteuerelementeListpickerItem("007", "Testeintrag 7 test'"));
        jsfSteuerelementeListpickerItems
            .add(new JsfSteuerelementeListpickerItem("008", "Testeintrag 8 aaa'"));
        jsfSteuerelementeListpickerItems.add(new JsfSteuerelementeListpickerItem("009",
            "Testeintrag 9 1234567890'"));
        jsfSteuerelementeListpickerItems
            .add(new JsfSteuerelementeListpickerItem("010", "Testeintrag 10 abc'"));
        return jsfSteuerelementeListpickerItems;
    }

    /**
     * Begrenzt die Items für den AJAX Listpicker.
     *
     * @param jsfSteuerelementeListpickerModel
     *            Das Listpicker Model.
     */
    public void begrenzeItems(JsfSteuerelementeListpickerModel jsfSteuerelementeListpickerModel) {
        // Schneide Liste bei Bedarf ab

        if (jsfSteuerelementeListpickerModel.getItems().size() > 5) {
            // Begrenze
            jsfSteuerelementeListpickerModel.setItems(Lists.newArrayList(jsfSteuerelementeListpickerModel
                .getItems().subList(0, 5).iterator()));
        }
    }
}
