package com.nt.sbeans;

public class CartItem {
	private String item;
	private Double price;
	
	public CartItem(String item, double price) {
		super();
		this.item = item;
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public Double getPrice() {
		return price;
	}
	
	
}
