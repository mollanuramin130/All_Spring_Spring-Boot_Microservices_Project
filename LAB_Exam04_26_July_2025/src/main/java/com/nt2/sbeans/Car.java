package com.nt2.sbeans;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car Engine Start Successfully...");

	}

	@Override
	public void stop() {
		System.out.println("Car Engine Stop Successfully...");
	}

}
