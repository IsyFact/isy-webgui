package de.bund.bva.isyfact.isywebgui;

import de.bund.bva.isyfact.aufrufkontext.AufrufKontext;
import de.bund.bva.isyfact.aufrufkontext.AufrufKontextFactory;
import de.bund.bva.isyfact.aufrufkontext.AufrufKontextVerwalter;
import de.bund.bva.isyfact.aufrufkontext.stub.AufrufKontextVerwalterStub;
import de.bund.bva.isyfact.isywebgui.config.XMLConfig;
import de.bund.bva.isyfact.isywebgui.gui.config.GuiConfig;
import de.bund.bva.isyfact.sicherheit.Sicherheit;
import de.bund.bva.isyfact.sicherheit.web.DelegatingAccessDecisionManager;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.security.access.AccessDecisionManager;

@Configuration
//@EnableAutoConfiguration
@Import({ GuiConfig.class, XMLConfig.class })
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

}
