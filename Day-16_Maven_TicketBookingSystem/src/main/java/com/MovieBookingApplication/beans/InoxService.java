package com.MovieBookingApplication.beans;

import java.util.ArrayList;
import java.util.List;

import com.MovieBookingApplication.exception.InvalidBookingException;
import com.MovieBookingApplication.exception.MovieNotFoundException;
import com.MovieBookingApplication.requirement.BookingService;

public class InoxService implements BookingService {

	private static String cinemaName;
	private static String location;
	private static String partnerCode;
	
	private List<String> availableShows =new ArrayList<String>();
	private List<String> bookedTickets =new ArrayList<String>();
	
	public static void setCinemaName(String cinemaName) {
		InoxService.cinemaName = cinemaName;
	}

	public static void setLocation(String location) {
		InoxService.location = location;
	}

	public static void setPartnerCode(String partnerCode) {
		InoxService.partnerCode = partnerCode;
	}
	
	public void setAvailableShows(List<String> availableShows) {
		this.availableShows = availableShows;
	}

	public void setBookedTickets(List<String> bookedTickets) {
		this.bookedTickets = bookedTickets;
	}

	
	public static String getCinemaName() {
		return cinemaName;
	}

	public static String getLocation() {
		return location;
	}

	public static String getPartnerCode() {
		return partnerCode;
	}

	public List<String> getAvailableShows() {
		return availableShows;
	}

	public List<String> getBookedTickets() {
		return bookedTickets;
	}

	@Override
	public void bookTicket(String movieName) throws MovieNotFoundException, InvalidBookingException {
		if(availableShows.stream().anyMatch(show->show.toLowerCase().compareTo(movieName.toLowerCase())==0)) {
			bookedTickets.add(movieName);
			System.out.println(movieName+" Movie Tickets Book Successfully...");
		}else {
			throw new MovieNotFoundException("Movie Not Found in the Show list...");
		}
	}

	@Override
	public void cancelTicket(String movieName) throws InvalidBookingException {
		if(bookedTickets.stream().anyMatch(bookedTickets->bookedTickets.toLowerCase().compareTo(movieName.toLowerCase())==0)) {
			if(bookedTickets.remove(movieName)) {
				System.out.println(movieName+" Booked Ticket Cancel successfully..");
			}else {
				throw new InvalidBookingException("Not found Movie in the Booking List");
			}
		}
	}

	@Override
	public void viewShow() {
		System.out.println("Avilable Shows are: \n"+"=".repeat(20));
		int count=1;
		availableShows.stream().forEach(availableShows->{
			System.out.println(count+". "+availableShows);
		});
	}


}
