package com.nit.components.task2;

import org.springframework.stereotype.Component;

@Component("hdfc")
public class HDFC implements Bank {
	private double amount;

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

	@Override
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String deposit(double amount) {
		if (amount <= 0) {
			return "Negetive amount not Allow..";
		}
		this.amount += amount;
		return "Rs." + amount + " Deposit Successfully..";
	}

	@Override
	public String withdraw(double amount) {
		if (amount <= 0) {
			return "Negetive amount not Allow..";
		} else if (this.amount >= amount) {
			this.amount -= amount;
			return "Rs." + amount + " Withdral Successfull..";
		} else if (this.amount < amount) {
			return "Insuffient Fund!!!";
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Current Balance: " + this.amount;
	}
}
