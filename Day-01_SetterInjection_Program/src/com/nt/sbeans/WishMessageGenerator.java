package com.nt.sbeans;

import java.time.LocalDateTime;

public class WishMessageGenerator {
	private LocalDateTime localDateTime;
	
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime=localDateTime;
	}
	
	public String generateWishMessage() {
		int hour = localDateTime.getHour();
		
		if(hour<12) {
			return "Good Morning";
		}else if(hour<18) {
			return "Good Afternoon";
		}else{
			return "Good Evining";
		}
	}
}
