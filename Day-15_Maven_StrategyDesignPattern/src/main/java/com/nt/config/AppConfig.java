package com.nt.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.sbeans.AmazonService;
import com.nt.sbeans.FlipkartService;
import com.nt.sbeans.ShoppingService;

@Configuration
@ComponentScan(basePackages = {"com.nt.sbeans"})
public class AppConfig {
	@Bean("initShoppingPlatform()")
	public ShoppingService initShoppingPlatform() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Choose a platform (Amazon or Flipkart) at the start.\n"+
		"1. Amazon\n2. Flipkart\nEnter your Option: ");
		
		int choose=Integer.parseInt(sc.nextLine());
		if(choose==1) {
			return new AmazonService();
		}else {
			return new FlipkartService();
		}
	}
}
