package com.nit.discount;

import org.springframework.stereotype.Component;

@Component("discount")
public class DiscountService {
	public double applyDiscount(double price,double discountPercentage) {
		return price*discountPercentage/100;
	}
}
