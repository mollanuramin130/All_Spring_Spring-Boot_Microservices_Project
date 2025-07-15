package com.nit.factory.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.components.task2.Bank;

@Component("customer")
public class Customer {
	private int customerId;
	private String customerName;
	private Bank bank;
	@Autowired
	@Qualifier("concreteBankFactory")
	BankFactory bankFactory;
	
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	
	public void setBank(String bankType) {
		this.bank= bankFactory.createBank(bankType);
	}
	
	public void deposit(double amount) {
		System.out.println(bank.deposit(amount));
	}
	
	public void withdraw(double amount) {
		System.out.println(bank.withdraw(amount));
	}
	
	public void displayDetails() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", bank=" + bank
				 + "]";
	}
	
	
}
