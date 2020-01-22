package de.bund.bva.isyfact.isywebgui.config;

import ch.qos.logback.ext.spring.web.LogbackConfigListener;
import de.bund.bva.isyfact.aufrufkontext.http.HttpHeaderNestedDiagnosticContextFilter;
import de.bund.bva.isyfact.common.web.servlet.filter.ApplicationInitialisierungFilter;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.RequestContextFilter;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class WebConfig {

    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

    /**
     * Register dispatcherServlet programmatically
     *
     * @return ServletRegistrationBean
     */
    @Bean
    public ServletRegistrationBean dispatcherServletRegistration() {

        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet(), "/app/*");

        registration
            .setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);

        return registration;
    }

    @Bean
    public ServletContextInitializer servletContextInitializer() {

        return sc -> {
            sc.setInitParameter("javax.faces.DEFAULT_SUFFIX", ".xhtml");
            sc.setInitParameter("javax.faces.PROJECT_STAGE", "Development");
            sc.setInitParameter("javax.faces.FACELETS_REFRESH_PERIOD", "1");
            sc.setInitParameter("log4jRefreshInterval", "60000");
            sc.setInitParameter("javax.faces.FACELETS_BUFFER_SIZE", "202400");
            sc.setInitParameter("logbackConfigLocation", "classpath:/config/logback.xml");
            sc.addFilter("RequestContextFilter", new RequestContextFilter());
            sc.addListener(LogbackConfigListener.class);
        };
    }

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

    @Bean
    FilterRegistrationBean<HttpHeaderNestedDiagnosticContextFilter> httpHeaderNestedDiagnosticContextFilter() {
        FilterRegistrationBean<HttpHeaderNestedDiagnosticContextFilter> registrationBean =
            new FilterRegistrationBean<>();
        registrationBean.setFilter(new HttpHeaderNestedDiagnosticContextFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        return registrationBean;
    }

    @Bean
    FilterRegistrationBean<CharacterEncodingFilter> characterEncodingFilter() {
        FilterRegistrationBean<CharacterEncodingFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CharacterEncodingFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.addInitParameter("encoding", "UTF-8");
        registrationBean.addInitParameter("forceEncoding", "true");
        return registrationBean;
    }

}
