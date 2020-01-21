package de.bund.bva.isyfact.isywebgui.config;

import de.bund.bva.isyfact.aufrufkontext.AufrufKontext;
import de.bund.bva.isyfact.aufrufkontext.AufrufKontextFactory;
import de.bund.bva.isyfact.aufrufkontext.AufrufKontextVerwalter;
import de.bund.bva.isyfact.aufrufkontext.impl.AufrufKontextFactoryImpl;
import de.bund.bva.isyfact.aufrufkontext.impl.AufrufKontextImpl;
import de.bund.bva.isyfact.isywebgui.common.AccessManagerDummy;
import de.bund.bva.isyfact.isywebgui.common.AuthentifizierungsErgebnisDummy;
import de.bund.bva.isyfact.sicherheit.Sicherheit;
import de.bund.bva.isyfact.sicherheit.accessmgr.AccessManager;
import de.bund.bva.isyfact.sicherheit.accessmgr.AuthentifzierungErgebnis;
import de.bund.bva.isyfact.sicherheit.config.IsySicherheitConfigurationProperties;
import de.bund.bva.isyfact.sicherheit.impl.SicherheitImpl;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.SimpleThreadScope;
import org.springframework.web.context.request.RequestScope;

@Configuration
public class SicherheitConfig {

    @Bean
    Sicherheit<AufrufKontext> sicherheit(AufrufKontextVerwalter<AufrufKontext> aufrufKontextVerwalter,
        AufrufKontextFactory<AufrufKontext> aufrufKontextFactory, AccessManager accessManager,
        IsySicherheitConfigurationProperties properties) {
        return new SicherheitImpl<AufrufKontext, AuthentifzierungErgebnis>(
            "/resources/sicherheit/rollenrechte.xml", aufrufKontextVerwalter, aufrufKontextFactory,
            accessManager, properties);
    }

    @Bean
    AccessManager accessManager() {
        return new AccessManagerDummy();
    }

//    @Bean
//    CustomScopeConfigurer customScopeConfigurer() {
//        CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
//        customScopeConfigurer.addScope("thread", new SimpleThreadScope());
//        customScopeConfigurer.addScope("request", new RequestScope());
//        return customScopeConfigurer;
//    }

//    @Bean
//    AufrufKontextFactory<AufrufKontext> aufrufKontextFactory() {
//        AufrufKontextFactoryImpl<AufrufKontext> aufrufKontextFactory = new AufrufKontextFactoryImpl<>();
//        aufrufKontextFactory.setAufrufKontextKlasse(AufrufKontextImpl.class);
//        return aufrufKontextFactory;
//    }

}
