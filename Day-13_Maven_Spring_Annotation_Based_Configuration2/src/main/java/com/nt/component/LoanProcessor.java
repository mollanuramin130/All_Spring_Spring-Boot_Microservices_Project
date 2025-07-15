package com.nt.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LoanProcessor {
	private InterestCalculator iCalculator;
	
	@Autowired
	public LoanProcessor(@Qualifier("homeLoan") InterestCalculator iCalculator) {
		this.iCalculator=iCalculator;
	}
	
	public void processLoan(double principal) {
		double calculateInterest = iCalculator.calculateInterest(principal);
		System.out.println("Principal Amount: "+principal+
				"\nCalculated interest: "+calculateInterest+
				"\nTotal payable Amount: "+(calculateInterest+principal));
	}			
}
