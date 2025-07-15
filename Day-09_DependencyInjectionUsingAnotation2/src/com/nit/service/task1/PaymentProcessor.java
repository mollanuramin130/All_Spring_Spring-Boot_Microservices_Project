package com.nit.service.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {
	private PaymentService paymentService;
	
	@Autowired
	@Qualifier("card")
	public void setPaymentService(PaymentService paymentService) {
		System.out.println("PaymentProcessor.setPaymentService() invoke...");
		this.paymentService=paymentService;
	}
	
	public void makePayment(double amount) {
		paymentService.processPayment(amount);
	}
	
	
}
