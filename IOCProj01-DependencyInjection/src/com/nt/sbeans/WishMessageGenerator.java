package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime time;
	
	public void setTime(LocalTime time ) {
		this.time=time;
	}
	
	public String generateMessage(String user) {
		int hour=time.getHour();
		if(hour<12) {
			return "Good Morning:: "+user;
		}else if(hour<16) {
			return "Good Afternoon:: "+user;
		}else if(hour<20) {
			return "Good Evining:: "+user;
		}else {
			return "Good Night:: "+user;
		}
	}
}
