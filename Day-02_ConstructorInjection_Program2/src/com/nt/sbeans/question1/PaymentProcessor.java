package com.nt.sbeans.question1;

public class PaymentProcessor {
	private PaymentService payment;
	public PaymentProcessor(PaymentService payment) {
		this.payment=payment;
	}
	
	public void makePayment(double amount) {
		payment.processPayment(amount);
	}
}
