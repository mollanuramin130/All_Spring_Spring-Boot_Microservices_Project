package com.nt.component_q2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodOrderApp {
	private BillingService billingService;
	
	@Autowired
	public FoodOrderApp(@Qualifier("nonVegObj") BillingService billingService) {
		this.billingService=billingService;
	}
	
	public void orderFood(String item) {
		double bill = billingService.getBill(item);
		System.out.println("Item Name: "+item+
				"\nPrice (Bill Amount): "+bill
				+ "\n\"Thank you for your order!\"");
	}
}
