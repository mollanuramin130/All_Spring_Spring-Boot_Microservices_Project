package com.nt.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.component.BillingApp;
import com.nt.component.CabCustomerService;

@Configuration
@ComponentScan(basePackages = "com.nt.component")
public class AppConfig {

	@Bean
	@Qualifier("customerService")
	public CabCustomerService cabCustomerService() {
		return new CabCustomerService();
	}

	@Bean
	@Qualifier("billingApp")
	public BillingApp billingApp(@Qualifier("customerService") CabCustomerService service) {
		BillingApp app = new BillingApp();
		app.setService(service); // Only service set initially
		return app;
	}
}