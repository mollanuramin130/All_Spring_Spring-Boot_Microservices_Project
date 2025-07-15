package com.nt.sbeans.task3;

import org.springframework.stereotype.Component;

@Component
public class DhlService implements ShippingService {

	@Override
	public void shipPackage() {
		System.out.println("Shipping Process by DHL Service..");

	}

}
