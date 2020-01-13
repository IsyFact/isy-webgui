package de.bund.bva.isyfact.isywebgui.gui.config;

import de.bund.bva.isyfact.common.web.exception.common.AusnahmeIdMapper;
import de.bund.bva.isyfact.common.web.exception.common.impl.AusnahmeIdMapperImpl;
import de.bund.bva.isyfact.isywebgui.gui.flows.awkwrapper.FlowAwkWrapper;
import de.bund.bva.isyfact.isywebgui.gui.flows.awkwrapper.impl.FlowAwkWrapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Konfiguration für die GUI.
 */
@Configuration
public class GuiConfig {

    /** Fallback-Ausnahme-ID, falls keine andere zugeordnet werden konnte. **/
    private static final String FALLBACK_AUSNAHME_ID = "WEBGI99999";

    /**
     * Ausnahme ID - Mapper.
     * Dieser Mapper wird auch automatisch für das IsyWeb Exception Handling verwendet
     **/
    @Bean
    public AusnahmeIdMapper ausnahmeIdMapper() {
        return new AusnahmeIdMapperImpl(FALLBACK_AUSNAHME_ID);
    }

    /**
     * FlowAwkWrapper.
     */
    @Bean
    public FlowAwkWrapper flowAwkWrapper() {
        return new FlowAwkWrapperImpl();
    }

}
