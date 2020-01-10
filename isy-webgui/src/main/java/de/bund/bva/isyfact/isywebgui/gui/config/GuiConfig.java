package de.bund.bva.isyfact.isywebgui.gui.config;

import de.bund.bva.isyfact.common.web.exception.common.AusnahmeIdMapper;
import de.bund.bva.isyfact.common.web.exception.common.impl.AusnahmeIdMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Konfiguration für die GUI.
 */
@Configuration
public class GuiConfig {

    /** Fallback-Ausnahme-ID, falls keine andere zugeordnet werden konnte. **/
    private static final String FALLBACK_AUSNAHME_ID = "WEBGI99999";

//    @Bean
//    public AusnahmeIdMapper ausnahmeIdMapper() {
//        return new AusnahmeIdMapperImpl(FALLBACK_AUSNAHME_ID);
//    }
}
