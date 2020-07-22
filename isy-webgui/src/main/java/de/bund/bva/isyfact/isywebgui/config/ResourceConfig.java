package de.bund.bva.isyfact.isywebgui.config;

import java.util.Locale;

import de.bund.bva.isyfact.common.web.locale.SetDefaultLocaleFactoryBean;
import de.bund.bva.isyfact.konfiguration.common.Konfiguration;
import de.bund.bva.isyfact.konfiguration.common.impl.ReloadablePropertyKonfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class ResourceConfig {

    /**
     * Diese Bean enthält die Anwendungskonfigurationen,
     * die in der Laufzeit vom Betrieb verändert werden können.
     */
    @Bean
    public Konfiguration konfiguration() {
        String[] propertyLocations = {
            "/resources/default.properties",
            "/resources/gui-anwendungsgruppen.properties",
            "/resources/nachrichten/gui-linksnavigation.properties",
            "/resources/nachrichten/navigationmenu.properties",
            "/config/isy-webgui.properties"};

        return new ReloadablePropertyKonfiguration(propertyLocations);
    }

    /**
     * Default Locale der Anwendung.
     * Statisch da sie von Spring's BeanFactoryPostProcessor bei der Initialisierung genutzt wird
     */
    @Bean
    public static SetDefaultLocaleFactoryBean setDefaultLocaleFactoryBean() {
        return new SetDefaultLocaleFactoryBean(Locale.GERMANY);
    }

    /**
     * Diese Bean sorgt fuer die Message-ResourceBundle Bereitstellung.
     * zugreifbar ueber Klasse SpringContextHolder.
     **/
    @Bean
    public ResourceBundleMessageSource messageSource() {

        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.addBasenames("resources/nachrichten/fehler", "resources/nachrichten/maskentexte",
            "resources/nachrichten/titles");

        return source;
    }
}
