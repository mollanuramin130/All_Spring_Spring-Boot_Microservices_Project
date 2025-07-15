package com.nt.component;

public class CarLoanCalculator implements InterestCalculator{
	private double rateOfInterest=10.5;
	private int time=1;
	
	@Override
	public double calculateInterest(double principal) {
		
		return principal*time*rateOfInterest/100;
	}

}
