package com.nit.service.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleWorkshop {
	@Autowired
	@Qualifier("bikeService")
	private MaintenanceService maintenanceService;
	
	public void maintenance() {
		maintenanceService.performService();
	}
	
}
