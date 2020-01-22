package de.bund.bva.isyfact.isywebgui.config;

import de.bund.bva.isyfact.aufrufkontext.AufrufKontext;
import de.bund.bva.isyfact.aufrufkontext.AufrufKontextFactory;
import de.bund.bva.isyfact.aufrufkontext.AufrufKontextVerwalter;
import de.bund.bva.isyfact.aufrufkontext.impl.AufrufKontextFactoryImpl;
import de.bund.bva.isyfact.aufrufkontext.impl.AufrufKontextImpl;
import de.bund.bva.isyfact.aufrufkontext.stub.AufrufKontextVerwalterStub;
import de.bund.bva.isyfact.isywebgui.common.AccessManagerDummy;
import de.bund.bva.isyfact.isywebgui.common.AuthentifizierungsErgebnisDummy;
import de.bund.bva.isyfact.sicherheit.Sicherheit;
import de.bund.bva.isyfact.sicherheit.accessmgr.AccessManager;
import de.bund.bva.isyfact.sicherheit.accessmgr.AuthentifzierungErgebnis;
import de.bund.bva.isyfact.sicherheit.config.IsySicherheitConfigurationProperties;
import de.bund.bva.isyfact.sicherheit.impl.SicherheitImpl;
import de.bund.bva.isyfact.sicherheit.web.DelegatingAccessDecisionManager;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.SimpleThreadScope;
import org.springframework.security.access.AccessDecisionManager;
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


//    //TODO entfernen wenn autoconfig an ist
    @Bean
    IsySicherheitConfigurationProperties sicherheitConfigurationProperties() {
        return new IsySicherheitConfigurationProperties();
    }

    @Bean
    AccessManager accessManager() {
        return new AccessManagerDummy();
    }


    //statisch da von Springs BeanFactoryPostProcessor genutzt wird
    @Bean
    public static CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
        customScopeConfigurer.addScope("thread", new SimpleThreadScope());
        customScopeConfigurer.addScope("request", new RequestScope());
        return customScopeConfigurer;
    }

    @ConditionalOnMissingBean
    @Bean
    public AufrufKontextFactory<AufrufKontext> aufrufKontextFactory() {
        AufrufKontextFactoryImpl<AufrufKontext> aufrufKontextFactory = new AufrufKontextFactoryImpl<>();
        aufrufKontextFactory.setAufrufKontextKlasse(AufrufKontextImpl.class);
        return aufrufKontextFactory;
    }

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
