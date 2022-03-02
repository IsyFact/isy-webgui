package de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente;

import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.datatable.JsfSteuerelementeTrefferlistenClientController;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeBehoerdeListpickerController;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeListpickerController;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeStaatsangListpickerController;


/**
 * Helper for JSF controls.
 *
 * @author Capgemini
 * @version $Id: JsfSteuerelementeHelper.java 130046 2015-02-10 10:43:52Z sdm_tgroeger $
 */
public class JsfSteuerelementeHelper {

    /**
     * Listpicker-Controller.
     */
    private final JsfSteuerelementeListpickerController jsfSteuerelementeListpickerController;


    /**
     * Behoerde-Listpicker-Controller.
     */
    private final JsfSteuerelementeBehoerdeListpickerController jsfSteuerelementeBehoerdeListpickerController;

    /**
     * Staatsangehörigkeit Listpicker-Controller.
     */
    private JsfSteuerelementeStaatsangListpickerController jsfSteuerelementeStaatsangListpickerController;


    /**
     * Staatsangehörigkeit Listpicker-Controller.
     */
    private JsfSteuerelementeTrefferlistenClientController jsfSteuerelementeTrefferlistenClientController;

    public JsfSteuerelementeHelper(JsfSteuerelementeListpickerController jsfSteuerelementeListpickerController,
                                   JsfSteuerelementeBehoerdeListpickerController jsfSteuerelementeBehoerdeListpickerController,
                                   JsfSteuerelementeStaatsangListpickerController jsfSteuerelementeStaatsangListpickerController) {
        this.jsfSteuerelementeListpickerController = jsfSteuerelementeListpickerController;
        this.jsfSteuerelementeBehoerdeListpickerController = jsfSteuerelementeBehoerdeListpickerController;
        this.jsfSteuerelementeStaatsangListpickerController = jsfSteuerelementeStaatsangListpickerController;
    }


    public JsfSteuerelementeListpickerController getJsfSteuerelementeListpickerController() {
        return this.jsfSteuerelementeListpickerController;
    }

    public JsfSteuerelementeBehoerdeListpickerController getJsfSteuerelementeBehoerdeListpickerController() {
        return this.jsfSteuerelementeBehoerdeListpickerController;
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
