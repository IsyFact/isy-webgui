package de.bund.bva.isyfact.isywebgui;

import java.util.Arrays;

import de.bund.bva.isyfact.aufrufkontext.AufrufKontext;
import de.bund.bva.isyfact.aufrufkontext.AufrufKontextFactory;
import de.bund.bva.isyfact.aufrufkontext.AufrufKontextVerwalter;
import de.bund.bva.isyfact.aufrufkontext.stub.AufrufKontextVerwalterStub;
import de.bund.bva.isyfact.common.web.global.GlobalFlowController;
import de.bund.bva.isyfact.common.web.spring.ControllerConfiguration;
import de.bund.bva.isyfact.common.web.spring.MvcConfiguration;
import de.bund.bva.isyfact.common.web.spring.WebFlowConfiguration;
import de.bund.bva.isyfact.isywebgui.config.XMLConfig;
import de.bund.bva.isyfact.isywebgui.gui.config.GuiConfig;
import de.bund.bva.isyfact.sicherheit.Sicherheit;
import de.bund.bva.isyfact.sicherheit.web.DelegatingAccessDecisionManager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.security.access.AccessDecisionManager;

@Configuration
//@EnableAutoConfiguration
@Import({ GuiConfig.class, XMLConfig.class, WebFlowConfiguration.class, MvcConfiguration.class, ControllerConfiguration.class })
public class IsyWebguiApplication extends SpringBootServletInitializer {

    @Profile("entwicklung")
    @Bean
    public AufrufKontextVerwalter<AufrufKontext> aufrufKontextVerwalter(
            AufrufKontextFactory<AufrufKontext> factory) {
        AufrufKontextVerwalterStub<AufrufKontext> verwalterStub = new AufrufKontextVerwalterStub<>();
        verwalterStub.setRollen("Testrolle");
        verwalterStub.setDurchfuehrendeBehoerde("123456");
        verwalterStub.setDurchfuehrenderSachbearbeiterName("Max1 Mustermann");
        verwalterStub.setDurchfuehrenderBenutzerKennung("max");
        verwalterStub.setDurchfuehrenderBenutzerInterneKennung("max-01");
        verwalterStub.setAufrufKontextFactory(factory);
        verwalterStub.setFesterAufrufKontext(true);
        return verwalterStub;
    }

    @Profile("entwicklung")
    @Bean
    public AccessDecisionManager accessDecisionManager(Sicherheit<AufrufKontext> sicherheit) {
        return new DelegatingAccessDecisionManager(sicherheit);
    }

    //TODO entfernen sobald die isy-web config funktioniert
    @ConditionalOnMissingBean
    @Bean
    public GlobalFlowController globalFlowController() {
        return new GlobalFlowController(null, null, null, null, null);
    }

    @Profile("entwicklung")
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}
