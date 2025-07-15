package com.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.product.Product;

@Component("profitLoss")
public class ProfitLoss {
	@Autowired
	@Qualifier("product")
	private Product product;
	
	public void calculateProfit() {
		System.out.println("Total Profit: "+(product.getSellingPrice()-product.getCostPrice()));
	}
}
