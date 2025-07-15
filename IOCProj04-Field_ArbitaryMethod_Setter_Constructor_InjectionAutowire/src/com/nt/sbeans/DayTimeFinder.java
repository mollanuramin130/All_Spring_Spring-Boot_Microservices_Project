package com.nt.sbeans;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("dayTime")
public class DayTimeFinder {
	//Filed Injection Using @Autowired
	
	@Autowired
	LocalDate date;
	@Autowired
	LocalTime time;
	
	public DayTimeFinder() {
		
	}
	
	//Constructor Injection Using @Autowired
	@Autowired
	public DayTimeFinder(LocalDate date, LocalTime time) {
		System.out.println("Constructor Injection using @Autowired");
		this.date=date;
		this.time=time;
	}
	
	//Setter Injection Using @Autowired
	@Autowired
	public void setDate(LocalDate date) {
		System.out.println("Date: Setter Injection using @Autowired");
		this.date = date;
	}

	//Setter Injection Using @Autowired
	@Autowired
	public void setTime(LocalTime time) {
		System.out.println("Time: Setter Injection using @Autowired");
		this.time = time;
	}
	
	//Arbitary Method Injection using @Autowired
	@Autowired
	public void assignDate(LocalDate date) {
		System.out.println("Arbitary Method Injection using @Autowired");
		this.date=date;
	}
	
	public void checkVal() {
		System.out.println("Date: "+date);
		System.out.println("Time: "+time);
	}
	
	//Business Logic
	public String dayValue() {
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		return "Today: "+dayOfWeek.toString()+"\nTime: "+time+"\nDate: "+date;
	}
}
