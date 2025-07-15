package com.nit.client.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.task1.AppConfig;
import com.nit.service.task1.PaymentProcessor;

public class MainApp {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext cxt=new
				AnnotationConfigApplicationContext(AppConfig.class);
				){
			
			PaymentProcessor paymentProcessor = cxt.getBean(PaymentProcessor.class);
			paymentProcessor.makePayment(2450);
		}
		
	}
}
