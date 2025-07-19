package com.nt.sbeans;

import java.util.ArrayList;
import java.util.List;

public class FlipkartService implements ShoppingService {
	private List<CartItem> list=new ArrayList<>();

	@Override
	public void addItem(String item, double price) {
		list.add(new CartItem(item, price));
		System.out.println(item+ " Added Successfully");
	}

	@Override
	public void checkout() {
		if(list.isEmpty()) {
			System.out.println("Cart is empty Nothing to checkout..");
		}else {
			
			double total = list.stream().mapToDouble(item->item.getPrice()).sum();
			double discount=total*0.05;
			double finalAmount=total-discount;
			double deliveryCharge=discount>=500 ? 0 : 50;
			System.out.println("Total Amount: " + total);
			System.out.println("Discount: " + discount);
			System.out.println("Delivery Charge: " + deliveryCharge);
			System.out.println("Final Amount to be paid: " + (finalAmount + deliveryCharge));
			System.out.println("standard delivery (e.g., 3–5 days)");
			System.out.println("Thank you for shopping with Flipkart!");
		}
	}

	@Override
	public void viewCart() {
		if(list.isEmpty()) {
			System.out.println("Your Card is Empty...");
		}else {
			
			list.stream().forEach(cartItem->{
				System.out.println(cartItem.getItem() + " - Rs." + cartItem.getPrice());
			});
		}
	}

}
