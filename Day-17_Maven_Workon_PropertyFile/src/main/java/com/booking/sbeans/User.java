package com.booking.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class User {
	private int userId;
	private String userName;
	private Address address;
	
	
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setUserId(@Value("${user.id}") int userId) {
		this.userId = userId;
	}
	
	@Autowired
	public void setUserName(@Value("${user.name}") String userName) {
		this.userName = userName;
	}
	
	@Autowired
	public void setAddress(@Qualifier("address") Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + "]";
	}
	
	
}
