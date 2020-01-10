package de.bund.bva.isyfact.isywebgui.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * TODO Move Legacy-XML-Config to Java.
 * Remove unnecessary config
 */
@Configuration
@ImportResource({"classpath*:resources/spring/application-web.xml"})
public class XMLConfig {
}
