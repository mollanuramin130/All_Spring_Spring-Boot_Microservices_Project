package com.nt.sbeans.question1;

public class StripeService implements PaymentService{
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Stripe Payment method Executed for Rs."+amount);

	}
}
