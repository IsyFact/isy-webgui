package de.bund.bva.isyfact.isywebgui;

import de.bund.bva.isyfact.isywebgui.config.XMLConfig;
import de.bund.bva.isyfact.isywebgui.gui.config.GuiConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@EnableAutoConfiguration
@Import({ GuiConfig.class, XMLConfig.class })
public class IsyWebguiApplication extends SpringBootServletInitializer {

}
