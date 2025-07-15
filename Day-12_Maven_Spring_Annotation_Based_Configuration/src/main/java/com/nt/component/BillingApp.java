package com.nt.component;

public class BillingApp {
	private CabCustomer customer;
	private CabCustomerService service;

	public void setCustomer(CabCustomer customer) {
		this.customer = customer;
	}

	public void setService(CabCustomerService service) {
		this.service = service;
	}

	public String printBill() {
		service.addCustomer(customer); // Must add before checking isFirstCustomer
		return customer.getCustomerName() + ", please pay your bill of Rs." + service.calculateBill(customer);
	}
}