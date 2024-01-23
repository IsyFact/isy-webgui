package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;
import de.bund.bva.isyfact.common.web.jsf.components.listpicker.behoerde.BehoerdeListpickerModel;

@Controller
public class ListpickerBeispieleController extends AbstractGuiController<ListpickerBeispieleModel> {

    /**
     * Controller für den Listpicker.
     **/
    private JsfSteuerelementeListpickerController jsfSteuerelementeListpickerController;

    /**
     * Controller für den Staatsangehörigkeit-Listpicker.
     **/
    private JsfSteuerelementeStaatsangListpickerController jsfSteuerelementeStaatsangListpickerController;

    /**
     * Controller für den Behördenlistpicker.
     **/
    private JsfSteuerelementeBehoerdeListpickerController jsfSteuerelementeBehoerdeListpickerController;

    @Autowired
    public ListpickerBeispieleController(
            JsfSteuerelementeListpickerController jsfSteuerelementeListpickerController,
            JsfSteuerelementeStaatsangListpickerController jsfSteuerelementeStaatsangListpickerController,
            JsfSteuerelementeBehoerdeListpickerController jsfSteuerelementeBehoerdeListpickerController) {
        this.jsfSteuerelementeListpickerController = jsfSteuerelementeListpickerController;
        this.jsfSteuerelementeStaatsangListpickerController = jsfSteuerelementeStaatsangListpickerController;
        this.jsfSteuerelementeBehoerdeListpickerController = jsfSteuerelementeBehoerdeListpickerController;
    }

    @Override
    protected Class<ListpickerBeispieleModel> getMaskenModelKlasseZuController() {
        return ListpickerBeispieleModel.class;
    }

    @Override
    public void initialisiereModel(ListpickerBeispieleModel model) {

        // Listpicker ohne AJAX
        JsfSteuerelementeListpickerModel listpickerModel = new JsfSteuerelementeListpickerModel();
        listpickerModel.setItems(jsfSteuerelementeListpickerController.erzeugeListpickerItemListe());
        model.setListpickerModel(listpickerModel);

        // Staatsangehoerigkeit-Listpicker ohne AJAX
        JsfSteuerelementeStaatsangListpickerModel staatsangListpickerModel =
                new JsfSteuerelementeStaatsangListpickerModel();
        staatsangListpickerModel
                .setItems(jsfSteuerelementeStaatsangListpickerController.erzeugeListpickerItemListe());
        model.setStaatsangListpickerModel(staatsangListpickerModel);

        // Listpicker mit AJAX
        JsfSteuerelementeListpickerModel ajaxListpickerModel = new JsfSteuerelementeListpickerModel();
        ajaxListpickerModel.setItems(jsfSteuerelementeListpickerController.erzeugeListpickerItemListe());
        jsfSteuerelementeListpickerController.begrenzeItems(ajaxListpickerModel);
        model.setAjaxListpickerModel(ajaxListpickerModel);

        // Behörde Listpicker (mit AJAX)
        BehoerdeListpickerModel behoerdeListpickerModel = new BehoerdeListpickerModel();
        behoerdeListpickerModel
                .setItems(jsfSteuerelementeBehoerdeListpickerController.erzeugeBehoerdeListpickerItemListe());
        model.setBehoerdeListpickerModel(behoerdeListpickerModel);

        // Servlet Listpicker
        JsfSteuerelementeListpickerModel servletListpickerModel = new JsfSteuerelementeListpickerModel();
        servletListpickerModel.setItems(jsfSteuerelementeListpickerController.erzeugeListpickerItemListe());
        model.setServletListpickerModel(servletListpickerModel);

    }

}
