package com.booking.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("flight")
public class Flight {
	private String flightNumber;
	private String departureCity;
	private String destinationCity;
	private double ticketPrice;
	
	//Getter Section
	public String getFlightNumber() {
		return flightNumber;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	
	//Setter Section
	@Autowired
	public void setFlightNumber(@Value("${flight.number}") String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	@Autowired
	public void setDepartureCity(@Value("${flight.departure}") String departureCity) {
		this.departureCity = departureCity;
	}
	
	@Autowired
	public void setDestinationCity(@Value("${flight.destination}") String destinationCity) {
		this.destinationCity = destinationCity;
	}
	
	@Autowired
	public void setTicketPrice(@Value("${flight.price}") double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	//toString
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", departureCity=" + departureCity + ", destinationCity="
				+ destinationCity + ", ticketPrice=" + ticketPrice + "]";
	}
	
	
	
}
