package com.booking.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("com/booking/commons/flightBooking.properties")
@ComponentScan(basePackages = "com.booking.sbeans")
public class AppConfig {
	
}
