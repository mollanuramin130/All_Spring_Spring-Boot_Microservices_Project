package com.nit;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.factory.PaymentService;
import com.nit.sbeans.CreditCardPayment;
import com.nit.sbeans.PayPalPayment;
import com.nit.sbeans.Strategy;
import com.nit.sbeans.UPIPayment;

@SpringBootApplication
public class Day23BootIocProjectPaymentProcessingSystemApplication {
	@Bean
	Strategy assignStrategy() {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the payment method "
					+ "\n1. PayPal"
					+ "\n2. UPI"
					+ "\n3. Credit Card");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
				case 1:
					return new PayPalPayment();
				case 2:
					return new UPIPayment();
				case 3:
					return new CreditCardPayment();
				default:
					System.out.println("Invalid choice, defaulting to PayPal.");
					return new com.nit.sbeans.PayPalPayment();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null; // Fallback in case of an error
	}

	public static void main(String[] args) {
		try( ConfigurableApplicationContext context = SpringApplication.run(Day23BootIocProjectPaymentProcessingSystemApplication.class, args);
				Scanner sc = new Scanner(System.in);
				){
			
			System.out.println("Enter the amount to be paid:");
			double amount = Double.parseDouble(sc.nextLine());
			PaymentService paymentService = context.getBean("paymentService",PaymentService.class);
			paymentService.processPayment(amount);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Payment Processing System is shutting down.");
		}
	}
}
