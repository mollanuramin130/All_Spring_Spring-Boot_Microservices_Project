package com.nt.sbeans.task3;

import org.springframework.stereotype.Component;

@Component
public class FedExService implements ShippingService {

	@Override
	public void shipPackage() {
		System.out.println("Shipping Process by FedEx Service..");

	}

}
