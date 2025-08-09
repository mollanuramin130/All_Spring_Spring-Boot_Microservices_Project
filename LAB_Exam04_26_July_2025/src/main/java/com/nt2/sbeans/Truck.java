package com.nt2.sbeans;

public class Truck implements Vehicle {

	@Override
	public void start() {
		System.out.println("Truck Engine Start Successfully...");

	}

	@Override
	public void stop() {
		System.out.println("Truck Engine Stop Successfully...");
	}
}
