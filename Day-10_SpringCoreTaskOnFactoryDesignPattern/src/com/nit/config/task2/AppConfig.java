package com.nit.config.task2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.nit.factory.task1","com.nit.components.task1"})
public class AppConfig {

}
