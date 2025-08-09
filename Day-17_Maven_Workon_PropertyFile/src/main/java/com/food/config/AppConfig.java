package com.food.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.food.sbeans"})
@PropertySource("com/food/commons/food.properties")
public class AppConfig {

}
