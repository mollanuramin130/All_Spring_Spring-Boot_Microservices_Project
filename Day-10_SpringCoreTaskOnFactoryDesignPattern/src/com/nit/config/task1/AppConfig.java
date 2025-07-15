package com.nit.config.task1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.nit.factory.task2","com.nit.components.task2"})
public class AppConfig {

}
