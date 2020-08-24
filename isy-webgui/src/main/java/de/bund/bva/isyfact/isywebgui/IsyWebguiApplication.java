package de.bund.bva.isyfact.isywebgui;

import de.bund.bva.isyfact.isywebgui.servlet.requesthandler.ListpickerProviderRequestHandler;
import de.bund.bva.isyfact.isywebgui.config.ResourceConfig;
import de.bund.bva.isyfact.isywebgui.config.SicherheitConfig;
import de.bund.bva.isyfact.isywebgui.config.WebConfig;
import de.bund.bva.isyfact.isywebgui.gui.config.GuiConfig;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeListpickerController;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//Securityconfig erfolgt über Isy-Sicherheit
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
@Import({ GuiConfig.class, SicherheitConfig.class, ResourceConfig.class, WebConfig.class, })

public class IsyWebguiApplication extends SpringBootServletInitializer {

}
