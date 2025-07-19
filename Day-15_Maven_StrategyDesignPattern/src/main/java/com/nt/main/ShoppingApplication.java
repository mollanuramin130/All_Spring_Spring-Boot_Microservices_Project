package com.nt.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.ShoppingContext;
import com.nt.sbeans.ShoppingService;

public class ShoppingApplication {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
				Scanner sc = new Scanner(System.in);
				){
			ShoppingContext shoppingContext = context.getBean(ShoppingContext.class);
			ShoppingService shoppingService = shoppingContext.getShoppingService();
			boolean flag=true;
			while(flag) {
				System.out.print("1.Add Item to Cart\n"
						+ "2.View Cart\n"
						+ "3.Checkout\n"
						+ "4.Exit\n"
						+"Enter your Choose[1/2/3/4]: ");
				int option=Integer.parseInt(sc.nextLine());
				switch(option) {
				case 1->{
					System.out.print("You Choose Add Item:\n"+"=".repeat(30)+"\nEnter Item name: ");
					String itemName=sc.nextLine();
					System.out.print("Enter Item price: ");
					double price=Double.parseDouble(sc.nextLine());
					shoppingService.addItem(itemName, price);
				}
				case 2->{
					shoppingService.viewCart();
				}
				case 3->{
					shoppingService.checkout();
				}
				case 4->{
					flag=false;
					System.out.println("Exited Thank you..");
				}
				default ->{
					System.out.println("Invalid Option...");
				}
				}
				System.out.println("\n\n"+"=".repeat(30));
			}
		}
	}
}
