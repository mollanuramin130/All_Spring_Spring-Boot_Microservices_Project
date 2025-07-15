package com.product;

import org.springframework.stereotype.Component;

@Component("product")
public class Product {

	public int getCostPrice() {
		return 100;
	}
	
	public int getSellingPrice() {
		return 150;
	}
}
