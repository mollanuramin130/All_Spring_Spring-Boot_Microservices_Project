package com.nt.config_q2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.component_q2.NonVegBillingService;
import com.nt.component_q2.VegBillingService;

@Configuration
@ComponentScan("com.nt.component_q2")
public class AppConfig {
	@Bean
	public VegBillingService vegObj() {
		return new VegBillingService();
	}
	
	@Bean
	public NonVegBillingService nonVegObj() {
		return new NonVegBillingService();
	}
}
