package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.component.LoanProcessor;
import com.nt.config.AppConfig;

public class LoanTester {
	public static void main(String[] args) {
		try(
				AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(AppConfig.class);
				){
			LoanProcessor loanProcessor = context.getBean(LoanProcessor.class);
			loanProcessor.processLoan(65000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
