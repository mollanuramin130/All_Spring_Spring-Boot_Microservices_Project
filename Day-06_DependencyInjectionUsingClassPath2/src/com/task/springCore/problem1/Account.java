package com.task.springCore.problem1;

public class Account {
	private int accountNo;
	private double balance;
	private float interestRate;
	private Customer customer;
	
	
	public Account() {
		super();
		
	}

	public boolean deposit(double amount) {
		this.balance+=amount;
		return true;
	}
	
	public boolean withdraw(double amount) {
		if(amount<=this.balance) {
			this.balance-=amount;
			return true;
		}else {
			return false;
		}
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account [customer=" + customer + ", accountNo=" + accountNo + ", balance=" + balance + ", interestRate="
				+ interestRate + "]";
	}

		
	
}
