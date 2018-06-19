package de.bund.bva.pliscommon.pliswebgui.gui.jsfvorlagen.jsfsteuerelemente;

import org.springframework.beans.factory.annotation.Required;

/**
 * Helper für JSF-Steuerelemente.
 *
 * @author Capgemini, Tobias Gröger
 * @version $Id: JsfSteuerelementeHelper.java 130046 2015-02-10 10:43:52Z sdm_tgroeger $
 */
public class JsfSteuerelementeHelper {

    /**
     * Listpicker-Controller.
     */
    private JsfSteuerelementeListpickerController jsfSteuerelementeListpickerController;


    /**
     * Behoerde-Listpicker-Controller.
     */
    private JsfSteuerelementeBehoerdeListpickerController jsfSteuerelementeBehoerdeListpickerController;

    /**
     * Staatsangehörigkeit Listpicker-Controller.
     */
    private JsfSteuerelementeStaatsangListpickerController jsfSteuerelementeStaatsangListpickerController;

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

    public JsfSteuerelementeStaatsangListpickerController getJsfSteuerelementeStaatsangListpickerControllerController() {
        return jsfSteuerelementeStaatsangListpickerController;
    }

    public void setJsfSteuerelementeStaatsangListpickerControllerController(
        JsfSteuerelementeStaatsangListpickerController jsfSteuerelementeStaatsangListpickerControllerController) {
        this.jsfSteuerelementeStaatsangListpickerController =
            jsfSteuerelementeStaatsangListpickerControllerController;
    }
}
