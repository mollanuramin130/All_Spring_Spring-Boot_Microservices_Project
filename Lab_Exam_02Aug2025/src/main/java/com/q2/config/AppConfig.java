package com.q2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.q2.sbeans")
@PropertySource("com/q2/commons/user.properties")
public class AppConfig {

}
