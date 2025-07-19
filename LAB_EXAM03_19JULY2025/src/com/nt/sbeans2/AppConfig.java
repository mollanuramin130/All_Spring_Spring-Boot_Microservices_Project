package com.nt.sbeans2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans2")
public class AppConfig {
	@Bean("userService")
	public Service assignUserService() {
		return new UserService();
	}
	@Bean("orderService")
	public Service assignOrderService() {
		return new OrderService();
	}
	
	
}
