package com.nt.component;

public class HomeLoanCalculator implements InterestCalculator {
	private double rateOfInterest=8.5;
	private int time=1;
	
	@Override
	public double calculateInterest(double principal) {
		
		return principal*time*rateOfInterest/100;
	}

}
