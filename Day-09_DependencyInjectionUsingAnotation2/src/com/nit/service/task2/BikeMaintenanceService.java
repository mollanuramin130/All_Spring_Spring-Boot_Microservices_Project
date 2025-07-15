package com.nit.service.task2;

import org.springframework.stereotype.Component;

@Component("bikeService")
public class BikeMaintenanceService implements MaintenanceService {

	@Override
	public void performService() {
		System.out.println("Bike Performance Service Process done!!!");

	}

}
