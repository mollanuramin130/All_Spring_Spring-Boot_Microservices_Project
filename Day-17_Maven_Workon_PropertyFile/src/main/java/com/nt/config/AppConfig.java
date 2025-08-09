package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySource("com/nt/commons/player.properties")
@ComponentScan(basePackages = {"com.nt.config","com.nt.sbeans"})
public class AppConfig {

}
