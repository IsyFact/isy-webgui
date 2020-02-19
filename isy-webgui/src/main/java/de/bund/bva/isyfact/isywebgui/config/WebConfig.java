package de.bund.bva.isyfact.isywebgui.config;

import de.bund.bva.isyfact.common.web.servlet.filter.ApplicationInitialisierungFilter;
import de.bund.bva.isyfact.isywebgui.common.servlet.requesthandler.ListpickerProviderRequestHandler;
import de.bund.bva.isyfact.isywebgui.gui.jsfvorlagen.jsfsteuerelemente.listpicker.JsfSteuerelementeListpickerController;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

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

    //Registriation des Servlet-Listpickers
    @Bean
    public ServletRegistrationBean<HttpRequestHandlerServlet> listPickerServletBean() {
        ServletRegistrationBean<HttpRequestHandlerServlet> bean = new ServletRegistrationBean<>(
            new HttpRequestHandlerServlet(), "/app/listpicker/*"
        );
        bean.setName("listpickerProviderRequestHandler");
        bean.setLoadOnStartup(1);
        return bean;
    }

    @Bean
    ListpickerProviderRequestHandler listpickerProviderRequestHandler(
        JsfSteuerelementeListpickerController jsfSteuerelementeListpickerController) {
        return new ListpickerProviderRequestHandler(jsfSteuerelementeListpickerController);
    }

}
