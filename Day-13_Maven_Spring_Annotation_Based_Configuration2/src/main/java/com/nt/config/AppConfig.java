package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.component.CarLoanCalculator;
import com.nt.component.HomeLoanCalculator;

@Configuration
@ComponentScan(basePackages = "com.nt.component")
public class AppConfig {
	@Bean(name="homeLoan")
	public HomeLoanCalculator assignHomeLoanObj() {
		return new HomeLoanCalculator();
	}
	@Bean(name="carLoan")
	public CarLoanCalculator assignCarLoanObj() {
		return new CarLoanCalculator();
	}
}
