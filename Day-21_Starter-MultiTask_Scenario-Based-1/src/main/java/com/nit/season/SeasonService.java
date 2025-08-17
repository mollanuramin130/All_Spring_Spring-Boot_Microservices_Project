package com.nit.season;

import org.springframework.stereotype.Component;

@Component("season")
public class SeasonService {
	public String getSeason(int month) {
		if(month<=0 || month>12) {
			throw new IllegalArgumentException("Invalid month! Please enter 1–12!!");
		}
		else if(month>=3 && month<=6) {
			return "Summer Season";
		}else if(month>=7 && month<=9) {
			return "Rainy Season";
		}else if(month>=10 && month<=11) {
			return "Autumn Season";
		}else {
			return "Winter Season";
		}
	}
}
