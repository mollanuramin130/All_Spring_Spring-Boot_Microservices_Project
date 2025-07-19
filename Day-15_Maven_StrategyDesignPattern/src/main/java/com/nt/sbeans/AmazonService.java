package com.nt.sbeans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AmazonService implements ShoppingService {
	private List<CartItem> list=new ArrayList<>();
	
	@Override
	public void addItem(String item, double price) {
		list.add(new CartItem(item, price));
		System.out.println(item+" Added Successfully to the Cart..");
	}

	@Override
	public void checkout() {
		if(list.isEmpty()) {
			System.out.println("Cart is empty Nothing to checkout..");
		}else {
			
			double total = list.stream().mapToDouble(item ->item.getPrice()).sum();
			double discount = total *.10; // Assuming a 10% discount
			double finalAmount = total - discount;
			//checking free delivery
			double deliveryCharge = finalAmount < 500 ? 50 : 0;
			System.out.println("Total Amount: " + total);
			System.out.println("Discount: " + discount);
			System.out.println("Delivery Charge: " + deliveryCharge);
			System.out.println("Final Amount to be paid: " + (finalAmount + deliveryCharge));
			System.out.println("Fast Delivery within 2 days");
			System.out.println("Thank you for shopping with Amazon!");
		}
		
	}

	@Override
	public void viewCart() {
		// TODO Auto-generated method stub
		if(list.isEmpty()) {
			System.out.println("your cart is empty");
		}else {
			System.out.println("Items in your cart:");
			for(CartItem item : list) {
				System.out.println(item.getItem() + " - Rs." + item.getPrice());
			}
		}
	}

}
