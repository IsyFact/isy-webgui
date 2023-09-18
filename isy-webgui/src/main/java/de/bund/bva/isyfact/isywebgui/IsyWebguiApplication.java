package de.bund.bva.isyfact.isywebgui;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import de.bund.bva.isyfact.isywebgui.config.ResourceConfig;
import de.bund.bva.isyfact.isywebgui.config.WebConfig;
import de.bund.bva.isyfact.isywebgui.gui.config.GuiConfig;
@Configuration
// Autoconfiguration of isy-security is used for security configuration
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
@Import({GuiConfig.class, ResourceConfig.class, WebConfig.class,})

public class IsyWebguiApplication extends SpringBootServletInitializer {

}
