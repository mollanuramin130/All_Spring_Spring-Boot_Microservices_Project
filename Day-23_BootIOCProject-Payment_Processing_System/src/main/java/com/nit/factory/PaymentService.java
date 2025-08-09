package com.nit.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.sbeans.Strategy;

@Component("paymentService")
public class PaymentService {
	@Autowired
	private Strategy strategy;
	
	public void processPayment(double amount) {
		if (strategy != null) {
			strategy.pay(amount);
		} else {
			System.out.println("No payment strategy selected.");
		}
	}
}
