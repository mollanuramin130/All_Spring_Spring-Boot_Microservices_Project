package com.task.springCore.problem2;

public class DayScholar extends Student{
	private double transportFee;
	
	
	
	public DayScholar(String name, int studentId, double examFee, double transportFee) {
		super(name, studentId, examFee);
		this.transportFee = transportFee;
	}


	@Override
	public double payFee() {

		return super.payFee()-this.transportFee;
	}

	
	public double getTransportFee() {
		return transportFee;
	}


	public void setTransportFee(double transportFee) {
		this.transportFee = transportFee;
	}


	@Override
	public String toString() {
		return super.toString()+ "DayScholar [transportFee=" + transportFee + "]";
	}
	
	public String displayDetails() {
		return toString();
	}
	
}
