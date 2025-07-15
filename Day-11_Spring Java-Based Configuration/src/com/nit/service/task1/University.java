package com.nit.service.task1;

import org.springframework.stereotype.Component;

@Component
public class University {
	private String universityName;
	
	@SuppressWarnings("unused")
	private University() {
		// TODO Auto-generated constructor stub
	}
	
	public University(String universityName) {
		this.universityName=universityName;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	
	
}
