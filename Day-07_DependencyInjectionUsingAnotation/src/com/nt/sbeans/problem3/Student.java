package com.nt.sbeans.problem3;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private Library library;
	@Autowired
	@Qualifier("date2")
	private LocalDate date;
	
	//@Qualifier("date")
	@Autowired
	private LocalDate date2;
	
	@Autowired
	public void assignLibrary(Library library) {
		this.library=library;
	}
	
	public void visitLibrary() {
		System.out.println("Date: "+date);
		System.out.println("Date2: "+date2);
		library.grantAccess("registered", "2025-07-08");
	}

}
