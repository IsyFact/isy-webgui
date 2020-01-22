package de.bund.bva.isyfact.isywebgui;

import de.bund.bva.isyfact.common.web.autoconfigure.ControllerAutoConfiguration;
import de.bund.bva.isyfact.common.web.autoconfigure.MvcAutoConfiguration;
import de.bund.bva.isyfact.common.web.autoconfigure.WebFlowAutoConfiguration;
import de.bund.bva.isyfact.isywebgui.common.servlet.requesthandler.ListpickerProviderRequestHandler;
import de.bund.bva.isyfact.isywebgui.config.ResourceConfig;
import de.bund.bva.isyfact.isywebgui.config.SicherheitConfig;
import de.bund.bva.isyfact.isywebgui.config.WebConfig;
import de.bund.bva.isyfact.isywebgui.gui.config.GuiConfig;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeListpickerController;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@EnableAutoConfiguration
@Import({ GuiConfig.class, SicherheitConfig.class, ResourceConfig.class, WebConfig.class
, MvcAutoConfiguration.class, ControllerAutoConfiguration.class, WebFlowAutoConfiguration.class
})


public class IsyWebguiApplication extends SpringBootServletInitializer {


    @Bean
    ListpickerProviderRequestHandler listpickerProviderRequestHandler(
        JsfSteuerelementeListpickerController jsfSteuerelementeListpickerController) {
        return new ListpickerProviderRequestHandler(jsfSteuerelementeListpickerController);
    }

}
