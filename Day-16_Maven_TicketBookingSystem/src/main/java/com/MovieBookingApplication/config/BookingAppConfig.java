package com.MovieBookingApplication.config;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.MovieBookingApplication.beans.BookMyShowService;
import com.MovieBookingApplication.beans.InoxService;
import com.MovieBookingApplication.requirement.BookingService;

@Configuration
@ComponentScan(basePackages = "com.MovieBookingApplication.implementation")
public class BookingAppConfig {

	@Bean("bookingService")
	public BookingService assignBookingService() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Choose Booking Platform:\n" + "=".repeat(20) + "\n1. BookMyShow\n2. Inox\nEnter Option: ");
		int option = Integer.parseInt(sc.nextLine());
		if (option == 1) {
			BookMyShowService.setCinemaName("AAA Cimenas");
			BookMyShowService.setLocation("Ameerpet, Hyderabad");
			BookMyShowService.setPartnerCode("7432");

			BookMyShowService bookingService = new BookMyShowService();
			List<String> availableShows = bookingService.getAvailableShows();
			availableShows.add("Puspa2");
			availableShows.add("Sanam Teri Kasam");
			availableShows.add("3 odiots");
			return bookingService;
		} else {
			InoxService.setCinemaName("ABS Cimenas");
			InoxService.setLocation("Kolkata, WB");
			InoxService.setPartnerCode("1908");

			InoxService bookingService = new InoxService();
			List<String> availableShows = bookingService.getAvailableShows();
			availableShows.add("Jawan");
			availableShows.add("Tiger3");
			availableShows.add("Hera Pheri");
			return bookingService;
		}
	}

}
