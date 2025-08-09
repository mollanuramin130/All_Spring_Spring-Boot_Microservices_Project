package com.nit.sbeans;

public class CreditCardPayment implements Strategy {

	@Override
	public void pay(double amount) {
		System.out.println("" + amount + " paid using Credit Card");
	}

}
