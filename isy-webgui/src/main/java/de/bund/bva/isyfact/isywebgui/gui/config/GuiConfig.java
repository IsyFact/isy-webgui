package de.bund.bva.isyfact.isywebgui.gui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import de.bund.bva.isyfact.common.web.exception.common.AusnahmeIdMapper;
import de.bund.bva.isyfact.common.web.exception.common.impl.AusnahmeIdMapperImpl;
import de.bund.bva.isyfact.isywebgui.gui.flows.awkwrapper.FlowAwkWrapper;
import de.bund.bva.isyfact.isywebgui.gui.flows.awkwrapper.impl.FlowAwkWrapperImpl;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.JsfSteuerelementeHelper;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeBehoerdeListpickerController;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeListpickerController;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeStaatsangListpickerController;

/**
 * Configuration for the GUI.
 */
@Configuration
@ComponentScan(basePackages = {"de.bund.bva.isyfact.isywebgui.gui"})
public class GuiConfig {

    /**
     * Fallback exception ID if no other could be assigned.
     **/
    private static final String FALLBACK_AUSNAHME_ID = "WEBGI99999";

    /**
     * Controller for the BehoerdenListpicker.
     * Explicitly specified, since the property MaxElements must be set.
     *
     * @return JsfSteuerelementeBehoerdeListpickerController
     */
    @Bean
    public JsfSteuerelementeBehoerdeListpickerController jsfSteuerelementeBehoerdeListpickerController() {
        return new JsfSteuerelementeBehoerdeListpickerController(10);
    }

    /**
     * Helper for JSF controls.
     *
     * @param jsfSteuerelementeListpickerController          Controller for the listpicker.
     * @param jsfSteuerelementeBehoerdeListpickerController  Controller for the BehoerdenListpicker.
     * @param jsfSteuerelementeStaatsangListpickerController Controller for the StaatsangListpicker.
     * @return JsfSteuerelementeHelper
     */
    @Bean
    public JsfSteuerelementeHelper jsfSteuerelementeHelper(JsfSteuerelementeListpickerController jsfSteuerelementeListpickerController,
                                                           JsfSteuerelementeBehoerdeListpickerController jsfSteuerelementeBehoerdeListpickerController,
                                                           JsfSteuerelementeStaatsangListpickerController jsfSteuerelementeStaatsangListpickerController) {
        return new JsfSteuerelementeHelper(jsfSteuerelementeListpickerController,
                jsfSteuerelementeBehoerdeListpickerController,
                jsfSteuerelementeStaatsangListpickerController);
    }

    /**
     * Exception ID - Mapper.
     * This mapper is also automatically used for IsyWeb exception handling.
     *
     * @return AusnahmeIdMapper
     **/
    @Bean
    public AusnahmeIdMapper ausnahmeIdMapper() {
        return new AusnahmeIdMapperImpl(FALLBACK_AUSNAHME_ID);
    }

    /**
     * FlowAwkWrapper.
     *
     * @return FlowAwkWrapper
     */
    @Bean
    public FlowAwkWrapper flowAwkWrapper() {
        return new FlowAwkWrapperImpl();
    }

}
