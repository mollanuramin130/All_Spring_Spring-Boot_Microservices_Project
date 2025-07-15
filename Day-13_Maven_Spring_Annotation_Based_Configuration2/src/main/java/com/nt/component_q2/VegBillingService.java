package com.nt.component_q2;

public class VegBillingService implements BillingService{

	@Override
	public double getBill(String item) {
		switch (item.toLowerCase()) {
		case "idli": {
			
			return 30;
		}
		case "dosa":{
			return 50;
		}
		default:
			return 0;
		}
	}

}
