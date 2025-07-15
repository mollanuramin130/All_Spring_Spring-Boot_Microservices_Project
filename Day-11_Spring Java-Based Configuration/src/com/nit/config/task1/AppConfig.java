package com.nit.config.task1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.service.task1.University;

@Configuration
@ComponentScan(basePackages = "com.nit.service.task1")
public class AppConfig {
	@Bean("delhiUniversity")
	public University delhiUniversity() {
		return new University("Delhi University");
	}	
	
	@Bean("oxfordUniversity")
	public University oxfordUniversity() {
		return new University("Oxford University");
	}
}
