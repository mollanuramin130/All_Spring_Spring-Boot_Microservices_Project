package com.nit.service.task1;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIPaymentService implements PaymentService{

	@Override
	public void processPayment(double amount) {
		System.out.println("Thank you making payment by using UPI of amount: "+amount);
		
	}

}
