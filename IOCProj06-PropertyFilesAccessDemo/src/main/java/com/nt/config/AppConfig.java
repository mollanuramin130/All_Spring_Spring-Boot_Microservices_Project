package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")

/* All Are Same */
//@PropertySource("com/nt/commons/info.properties")
//@PropertySource("com/nt/commons/info.properties")
//@PropertySources(@PropertySource(value = { "com/nt/commons/info.properties" }))
//@PropertySources(@PropertySource(value = { "com/nt/commons/info.properties" }))
//@PropertySources(@PropertySource({ "com/nt/commons/info.properties" }))
//@PropertySources(@PropertySource( "com/nt/commons/info.properties" ))

@ImportResource("com/nt/cfgs/ApplicationContext.xml")
public class AppConfig {

}
