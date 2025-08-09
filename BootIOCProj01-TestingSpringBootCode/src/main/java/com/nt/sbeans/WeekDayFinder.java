package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {
	@Autowired
	private LocalDateTime time;
	
	//Business Method Invoke
	public String showDayOfWeek() {
		return time.getDayOfWeek().toString();
	}
}
