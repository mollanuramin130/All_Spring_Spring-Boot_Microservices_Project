package com.nit.service.task1;

import org.springframework.stereotype.Component;

@Component("card")
public class CardPaymentService implements PaymentService{

	@Override
	public void processPayment(double amount) {
		System.out.println("Thank you making payment by using Card of amount: "+amount);
		
	}

}
