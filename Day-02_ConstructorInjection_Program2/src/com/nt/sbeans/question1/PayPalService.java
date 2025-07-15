package com.nt.sbeans.question1;

public class PayPalService implements PaymentService{
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("PayPal Payment method Executed for Rs."+amount);
	}
}
