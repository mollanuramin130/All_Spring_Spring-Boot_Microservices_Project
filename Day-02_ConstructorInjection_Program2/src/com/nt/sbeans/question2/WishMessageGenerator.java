package com.nt.sbeans.question2;

import java.time.LocalDateTime;

public class WishMessageGenerator {
	private LocalDateTime currenDateTime;
	public WishMessageGenerator(LocalDateTime currentDateTime) {
		this.currenDateTime=currentDateTime;
	}
	
	public String generateWishMessage() {
		int hour = currenDateTime.getHour();
		if(hour<12) {
			return "Good Morning";
		}else if(hour<18) {
			return "Good Afternoon";
		}else {
			return "Good Evening";
		}
	}
}
