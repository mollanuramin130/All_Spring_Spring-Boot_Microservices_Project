package com.nt.component_q2;

public class NonVegBillingService implements BillingService{

	@Override
	public double getBill(String item) {
		switch (item.toLowerCase()) {
		case "chicken biryani": {
			
			return 150;
		}
		case "mutton curry":{
			return 200;
		}
		default:
			return 0;
		}
	}

}
