package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @PropertySource("com/nt/commons/myfile.properties") // Uncomment if you want to use properties file
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {

}
