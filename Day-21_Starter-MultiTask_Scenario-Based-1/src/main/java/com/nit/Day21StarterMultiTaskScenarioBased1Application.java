package com.nit;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.nit.discount.DiscountService;
import com.nit.even_odd.NumberService;
import com.nit.season.SeasonService;

@SpringBootApplication
public class Day21StarterMultiTaskScenarioBased1Application {

    private final DiscountService discount;

    Day21StarterMultiTaskScenarioBased1Application(DiscountService discount) {
        this.discount = discount;
    }

	public static void main(String[] args) {
		try(
				ConfigurableApplicationContext context = SpringApplication.run(Day21StarterMultiTaskScenarioBased1Application.class, args);
				){
			Scanner sc =new Scanner(System.in);
			boolean flag=true;
			while(flag) {
				System.out.println("Choose Your Option:"
						+"\n      1.Season Finder"
						+"\n      2.Discount Calculate"
						+"\n      3.Even Or Odd Finder"
						+"\n      4.Exit"
						+"\nEnter your Option: ");
				
				int option=Integer.parseInt(sc.nextLine());
				switch (option) {
				case 1-> {
					
					SeasonService seasonService = context.getBean("season",SeasonService.class);
					System.out.println("Enter the Month number to find Season (1-12): ");
					int month=Integer.parseInt(sc.nextLine());
					try {
						
						String season = seasonService.getSeason(month);
						System.out.println("\nAs per given input Season is: "+season);
					}catch (Exception e) {
						e.printStackTrace();
					}
					
				}
				case 2 ->{
					DiscountService discountService = context.getBean("discount",DiscountService.class);
					System.out.println("Enter original price: ");
					double amount=Double.parseDouble(sc.nextLine());
					System.out.println("Enter discount percentage: ");
					double discountPercentage=Double.parseDouble(sc.nextLine());
					double discount = discountService.applyDiscount(amount, discountPercentage);
					
					System.out.println("inal price after discount: Rs."+(amount-discount));
				}
				case 3->{
					NumberService numberService = context.getBean("number",NumberService.class);
					System.out.println("Enter your number to Check Even Or Odd: ");
					int number=Integer.parseInt(sc.nextLine());
					System.out.println(number+" is : "+numberService.checkEvenOdd(number));
				}
				case 4->{
					flag=false;
					System.out.println("Exit Successfully...");
				}
				default->
					throw new IllegalArgumentException("Unexpected value: " + option);
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
