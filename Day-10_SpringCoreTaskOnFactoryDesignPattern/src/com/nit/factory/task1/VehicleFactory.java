package com.nit.factory.task1;

import com.nit.components.task1.Vehicle;

public interface VehicleFactory {
	Vehicle createVehicle(String type, String engineType);
}
