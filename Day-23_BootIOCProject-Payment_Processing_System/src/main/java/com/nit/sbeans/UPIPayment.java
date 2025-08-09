package com.nit.sbeans;

public class UPIPayment implements Strategy {

	@Override
	public void pay(double amount) {
		System.out.println("" + amount + " paid using UPI");
		
	}

}
