package de.bund.bva.pliscommon.pliswebgui.gui.jsfvorlagen.jsfsteuerelemente;

import org.springframework.beans.factory.annotation.Required;

/**
 * Helper for JSF controls.
 *
 * @author Capgemini
 * @version $Id: JsfSteuerelementeHelper.java 130046 2015-02-10 10:43:52Z sdm_tgroeger $
 */
public class JsfSteuerelementeHelper {

    /**
     * listpicker controller.
     */
    private JsfSteuerelementeListpickerController jsfSteuerelementeListpickerController;


    /**
     * Behoerde listpicker controller.
     */
    private JsfSteuerelementeBehoerdeListpickerController jsfSteuerelementeBehoerdeListpickerController;

    /**
     * Staatsangehörigkeit listpicker controller.
     */
    private JsfSteuerelementeStaatsangListpickerController jsfSteuerelementeStaatsangListpickerController;


    /**
     * Staatsangehörigkeit listpicker controller.
     */
    private JsfSteuerelementeTrefferlistenClientController jsfSteuerelementeTrefferlistenClientController;


    public JsfSteuerelementeListpickerController getJsfSteuerelementeListpickerController() {
        return this.jsfSteuerelementeListpickerController;
    }

    @Required
    public void setJsfSteuerelementeListpickerController(
        JsfSteuerelementeListpickerController jsfSteuerelementeListpickerController) {
        this.jsfSteuerelementeListpickerController = jsfSteuerelementeListpickerController;
    }

    public JsfSteuerelementeBehoerdeListpickerController getJsfSteuerelementeBehoerdeListpickerController() {
        return this.jsfSteuerelementeBehoerdeListpickerController;
    }

    @Required
    public void setJsfSteuerelementeBehoerdeListpickerController(
        JsfSteuerelementeBehoerdeListpickerController jsfSteuerelementeBehoerdeListpickerController) {
        this.jsfSteuerelementeBehoerdeListpickerController = jsfSteuerelementeBehoerdeListpickerController;
    }

    public JsfSteuerelementeStaatsangListpickerController getJsfSteuerelementeStaatsangListpickerController() {
        return jsfSteuerelementeStaatsangListpickerController;
    }

    public void setJsfSteuerelementeStaatsangListpickerController(
        JsfSteuerelementeStaatsangListpickerController jsfSteuerelementeStaatsangListpickerController) {
        this.jsfSteuerelementeStaatsangListpickerController =
            jsfSteuerelementeStaatsangListpickerController;
    }

    public JsfSteuerelementeTrefferlistenClientController getJsfSteuerelementeTrefferlistenClientController() {
        return jsfSteuerelementeTrefferlistenClientController;
    }

    public void setJsfSteuerelementeTrefferlistenClientController(
        JsfSteuerelementeTrefferlistenClientController jsfSteuerelementeTrefferlistenClientController) {
        this.jsfSteuerelementeTrefferlistenClientController = jsfSteuerelementeTrefferlistenClientController;
    }
}
