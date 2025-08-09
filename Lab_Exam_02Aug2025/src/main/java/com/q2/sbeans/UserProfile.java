package com.q2.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("userProfile")
public class UserProfile {
	@Value("${user.name1}")
	private String userName;
	
	@Value("${user.email}")
	private String email;
	
	@Value("${user.country2}")
	private String country;

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getCountry() {
		return country;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Name: "+userName+"\nEmail: "+email+"\nCountry: "+country;
	}
	
	
}
