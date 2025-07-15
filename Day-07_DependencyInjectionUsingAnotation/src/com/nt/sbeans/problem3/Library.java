package com.nt.sbeans.problem3;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Library {
	public void grantAccess(String studentType, String clearBookDueDate) {
		if(isRegistered(studentType) && bookDueDate(clearBookDueDate)) {
			System.out.println("Access granted to library.");
		}else {
			System.out.println("Access denied. Please register first or clear book dues.");
		}
		
	}
	
	public boolean isRegistered(String studentType) {
		return studentType.compareToIgnoreCase("registered")==0;
	}
	
	public boolean bookDueDate(String date) {
		return date.compareToIgnoreCase(LocalDate.now().toString())==0;
	}
}
