package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShoppingContext {
	private ShoppingService shoppingService;
	
	@Autowired
	public ShoppingContext(@Qualifier("initShoppingPlatform()") ShoppingService shoppingService) {
		this.shoppingService=shoppingService;
		
	}
	
	public ShoppingService getShoppingService() {
		return shoppingService;
	}
	
	
}
