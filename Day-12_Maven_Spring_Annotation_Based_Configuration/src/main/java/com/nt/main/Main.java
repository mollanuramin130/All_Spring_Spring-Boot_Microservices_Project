package com.nt.main;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.component.BillingApp;
import com.nt.component.CabCustomer;
import com.nt.config.AppConfig;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		BillingApp app = context.getBean("billingApp", BillingApp.class);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nPress 1 to print the bill");
			System.out.println("Press 2 to exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); // clear buffer

			switch (choice) {
				case 1:
					System.out.println("Enter the Customer id:");
					int id = sc.nextInt();
					sc.nextLine(); // Clear buffer

					System.out.println("Enter the Customer name:");
					String name = sc.nextLine();

					System.out.println("Enter the pickup location:");
					String pickup = sc.nextLine();

					System.out.println("Enter the drop location:");
					String drop = sc.nextLine();

					System.out.println("Enter the distance:");
					int distance = sc.nextInt();
					sc.nextLine();

					System.out.println("Enter the phone number:");
					String phone = sc.nextLine();

					CabCustomer customer = new CabCustomer(id, name, pickup, drop, distance, phone);

					app.setCustomer(customer); // inject into app
					System.out.println(app.printBill());
					break;

				case 2:
					System.out.println("Thanks for using the cab service. Goodbye!");
					System.exit(0);
					break;

				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}

