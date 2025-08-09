package com.booking.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZipCode() {
		return zipCode;
	}
	
	@Autowired
	public void setStreet(@Value("${user.address.street}") String street) {
		this.street = street;
	}
	
	@Autowired
	public void setCity(@Value("${user.address.city}") String city) {
		this.city = city;
	}
	
	@Autowired
	public void setState(@Value("${user.address.state}") String state) {
		this.state = state;
	}
	
	@Autowired
	public void setZipCode(@Value("${user.address.zipCode}") String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
	
}
