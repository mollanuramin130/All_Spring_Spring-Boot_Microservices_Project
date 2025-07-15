package com.nit.components.task2;

public interface Bank {
	double getAmount();
	void setAmount(double amount);
	String deposit(double amount);
	String withdraw(double amount); 
	String toString();
}
