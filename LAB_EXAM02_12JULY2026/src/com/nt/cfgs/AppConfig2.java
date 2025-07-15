package com.nt.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig2 {
	
	@Bean("str1")
	public String setDeptString() {
		return "Java Department";
	}
}
