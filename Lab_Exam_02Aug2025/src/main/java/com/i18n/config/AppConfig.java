package com.i18n.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	@Bean("rbms")
	public ResourceBundleMessageSource createRBMS() {
		ResourceBundleMessageSource rbms=new ResourceBundleMessageSource();
		rbms.setBasename("com/i18n/commons/messages");
		return rbms;
	}
	
}
