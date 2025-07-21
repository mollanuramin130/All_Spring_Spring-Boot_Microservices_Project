package com.MovieBookingApplication.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.MovieBookingApplication.exception.InvalidBookingException;
import com.MovieBookingApplication.exception.MovieNotFoundException;
import com.MovieBookingApplication.requirement.BookingService;

@Component("movieBookingApplication")
public class MovieBookingApplication {
	private BookingService bookingService;
	
	@Autowired
	public MovieBookingApplication(@Qualifier("bookingService") BookingService bookingService) {
		this.bookingService=bookingService;
	}

	public BookingService getBookingService() {
		return bookingService;
	}
	
	public void bookTicket(String movieName) {
		try {
			bookingService.bookTicket(movieName);
		} catch (MovieNotFoundException e) {
//			e.printStackTrace();
			System.out.println("Movie not found: " + e.getMessage());
		} catch (InvalidBookingException e) {
//			e.printStackTrace();
			System.out.println("Invalid booking: " + e.getMessage());
		}
	}
	
	public void cancelTicket(String movieName) {
		try {
			bookingService.cancelTicket(movieName);
		} catch (InvalidBookingException e) {
			e.printStackTrace();
		}
	}
	
	public void viewShow() {
		bookingService.viewShow();
	}
	
}
