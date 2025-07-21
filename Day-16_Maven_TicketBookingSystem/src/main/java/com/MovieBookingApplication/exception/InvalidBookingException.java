package com.MovieBookingApplication.exception;

@SuppressWarnings("serial")
public class InvalidBookingException extends Exception{
	public InvalidBookingException(String message) {
		super(message);
	}
}
