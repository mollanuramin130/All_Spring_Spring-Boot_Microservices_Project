package com.nt.sbeans;

import java.time.LocalDate;

public class SeasonsGenerator {
	private LocalDate date;
	public void setDate(LocalDate date) {
		this.date=date;
	}
	
	public String findSeasons() {
		int monthValue = date.getMonthValue();
		if(monthValue>=12 && monthValue<=2) {
			return "Winter Seasons";
		}else if(monthValue>=3 && monthValue<=5) {
			return "Summer Seasons";
		}else if(monthValue>=6 && monthValue<=9) {
			return "Monsoon Seasons";
		}else {
			return "Autumn Seasons";
		}
	}
}
