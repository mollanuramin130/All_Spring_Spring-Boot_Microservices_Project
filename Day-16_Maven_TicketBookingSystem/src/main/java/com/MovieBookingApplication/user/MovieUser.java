package com.MovieBookingApplication.user;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.MovieBookingApplication.config.BookingAppConfig;
import com.MovieBookingApplication.implementation.MovieBookingApplication;
import com.MovieBookingApplication.requirement.BookingService;

public class MovieUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				BookingAppConfig.class);) {
			MovieBookingApplication movieBookingApplication = context.getBean("movieBookingApplication",
					MovieBookingApplication.class);
			BookingService bookingService = movieBookingApplication.getBookingService();
			boolean flag = true;
			while (flag) {
				System.out.print("\nChoose Prepare Menu:\n" + "=".repeat(20) + "\n1. Book a ticket\n"
						+ "2. Cancel a ticket\n" + "3. View available shows\n" + "4. Exit\n" + "Enter your Option: ");
				int option = Integer.parseInt(sc.nextLine());
				try {
					switch (option) {
					case 1 -> {
						System.out.println();
						bookingService.viewShow();
						System.out.print("Enter your Movie Name: ");
						String movieName = sc.nextLine();
						bookingService.bookTicket(movieName);
					}
					case 2 -> {
						System.out.print("Enter your Movie Name: ");
						String movieName = sc.nextLine();
						bookingService.cancelTicket(movieName);
					}
					case 3 -> {
						bookingService.viewShow();
					}
					case 4 -> {
						flag = false;
						System.out.println("Exit Successfull..\n");
					}
					default -> throw new IllegalArgumentException("Unexpected value: " + option);
					}
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
