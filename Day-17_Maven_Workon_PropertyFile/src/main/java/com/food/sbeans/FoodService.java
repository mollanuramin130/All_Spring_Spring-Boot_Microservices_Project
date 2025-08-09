package com.food.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("foodService")
public class FoodService {
	@Autowired
	@Qualifier("foodDetails")
	private FoodDetails foodDetails;
	
	public void displayFoodInfo() {
		System.out.println(foodDetails);
	}
}
