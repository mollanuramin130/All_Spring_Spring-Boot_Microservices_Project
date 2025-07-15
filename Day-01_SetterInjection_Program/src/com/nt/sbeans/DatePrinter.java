package com.nt.sbeans;

import java.time.LocalDate;

public class DatePrinter {
	private LocalDate currentDate;
	
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate=currentDate;
	}
	
	public String printDate() {
		int year = currentDate.getYear();
		int monthValue = currentDate.getMonthValue();
		int dayOfMonth = currentDate.getDayOfMonth();
		return ""+year+"-"+monthValue+"-"+dayOfMonth;
	}
}
