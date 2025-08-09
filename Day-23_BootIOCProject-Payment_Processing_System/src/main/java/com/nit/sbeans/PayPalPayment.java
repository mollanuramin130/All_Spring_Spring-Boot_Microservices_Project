package com.nit.sbeans;

public class PayPalPayment implements Strategy {

	@Override
	public void pay(double amount) {
		System.out.println("" + amount + " paid using PayPal");
	}

}
