package de.bund.bva.isyfact.isywebgui.gui.config;

import de.bund.bva.isyfact.common.web.exception.common.AusnahmeIdMapper;
import de.bund.bva.isyfact.common.web.exception.common.impl.AusnahmeIdMapperImpl;
import de.bund.bva.isyfact.isywebgui.gui.flows.awkwrapper.FlowAwkWrapper;
import de.bund.bva.isyfact.isywebgui.gui.flows.awkwrapper.impl.FlowAwkWrapperImpl;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.JsfSteuerelementeHelper;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeBehoerdeListpickerController;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeListpickerController;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeStaatsangListpickerController;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Konfiguration für die GUI.
 */
@Configuration
@ComponentScan(basePackages = { "de.bund.bva.isyfact.isywebgui.gui" })
public class GuiConfig {

    /** Fallback-Ausnahme-ID, falls keine andere zugeordnet werden konnte. **/
    private static final String FALLBACK_AUSNAHME_ID = "WEBGI99999";

    /**
     * Controller für den BehoerdenListepicker.
     * Explizit angegeben, da die Property MaxElemente gesetzt werden muss
     * @return JsfSteuerelementeBehoerdeListpickerController
     */
    @Bean
    public JsfSteuerelementeBehoerdeListpickerController jsfSteuerelementeBehoerdeListpickerController() {
        return new JsfSteuerelementeBehoerdeListpickerController(10);
    }

    @Bean
    public JsfSteuerelementeHelper jsfSteuerelementeHelper(JsfSteuerelementeListpickerController jsfSteuerelementeListpickerController,
                                                           JsfSteuerelementeBehoerdeListpickerController jsfSteuerelementeBehoerdeListpickerController,
                                                           JsfSteuerelementeStaatsangListpickerController jsfSteuerelementeStaatsangListpickerController) {
        return new JsfSteuerelementeHelper(jsfSteuerelementeListpickerController,
                jsfSteuerelementeBehoerdeListpickerController,
                jsfSteuerelementeStaatsangListpickerController);
    }

    /**
     * Ausnahme ID - Mapper.
     * Dieser Mapper wird auch automatisch für das IsyWeb Exception Handling verwendet
     * @return AusnahmeIdMapper
     **/
    @Bean
    public AusnahmeIdMapper ausnahmeIdMapper() {
        return new AusnahmeIdMapperImpl(FALLBACK_AUSNAHME_ID);
    }

    /**
     * FlowAwkWrapper.
     * @return FlowAwkWrapper
     */
    @Bean
    public FlowAwkWrapper flowAwkWrapper() {
        return new FlowAwkWrapperImpl();
    }

}
