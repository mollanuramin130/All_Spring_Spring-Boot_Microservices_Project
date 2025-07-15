package com.nt.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculator {
	private LocalDate currentDate;
	private double price;
	
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate=currentDate;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public String calculateDiscount() {
		DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
		
		int value = dayOfWeek.getValue();
		
		if (value==7 || value==1) {
			return "Discounted Price: "+this.price*0.2 +"(20% discount applied)";
		}else {
			return "Discounted Price: "+(this.price- this.price*0.1) +" (10% discount applied)";
		}
	}
	
	
}
