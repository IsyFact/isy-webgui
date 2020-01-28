package de.bund.bva.isyfact.isywebgui.config;

import de.bund.bva.isyfact.common.web.servlet.filter.ApplicationInitialisierungFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean<ApplicationInitialisierungFilter> applicationInitialisierungFilter() {
        FilterRegistrationBean<ApplicationInitialisierungFilter> registrationBean =
            new FilterRegistrationBean<>();
        registrationBean.setFilter(new ApplicationInitialisierungFilter());

        registrationBean.addUrlPatterns("/app/*");

        //Optionaler Parameter: Der Parameter "urlsToSkip" dient zur Aufnahme von Url-Pfaden,
        // relativ zum ApplicationContext-Pfad, die von der Filterung ausgenommen werden.
        // Mehrere Url-Pfade sind kommasepariert anzugeben. Es ist pro Url ein fuehrendes "/" anzugeben.
        registrationBean.addInitParameter("urlsToSkip", "/app/resources");
        registrationBean.addInitParameter("ajaxRedirectUrl", "/");
        // Plicht-Parameter:
        // Der Parameter "urlApplicationInitialisierung" enthaelt die Url zur Application-Initialisierungsseite.
        // Es ist ein fuehrendes "/" anzugeben.
        registrationBean.addInitParameter("urlApplicationInitialisierung",
            "/app/common/init/applicationInitialisierung.xhtml");
        return registrationBean;
    }

}
