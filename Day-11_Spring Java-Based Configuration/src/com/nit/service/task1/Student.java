package com.nit.service.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private University university;
	
	@Autowired
	public Student(@Qualifier("delhiUniversity") University university) {
		this.university=university;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This Student Admitted at "+ university.getUniversityName();
	}
}
