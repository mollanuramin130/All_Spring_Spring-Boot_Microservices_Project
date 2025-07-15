package com.task.springCore.problem2;

public class Hosteller extends Student{
	private double hostelfee;
	
	public Hosteller(String name, int studentId, double examFee, double hostelfee) {
		super(name, studentId, examFee);
		this.hostelfee = hostelfee;
	}

	@Override
	public double payFee() {
		
		return super.payFee()-hostelfee;
	}


	@Override
	public String toString() {
		return super.toString()+ "Hosteller [hostelfee=" + hostelfee + "]";
	}
	
	public String displayDetails() {
		return toString();
	}
	
}
