package com.nt.sbeans.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShipmentProcessor {
	private ShippingService shippingService;
	
	@Autowired
	public ShipmentProcessor(@Qualifier("dhlService") ShippingService shippingService) {
		this.shippingService=shippingService;
	}
	
	public void shipPackage() {
		shippingService.shipPackage();
	}
}
