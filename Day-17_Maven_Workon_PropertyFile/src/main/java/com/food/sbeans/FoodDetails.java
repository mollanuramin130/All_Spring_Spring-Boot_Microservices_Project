package com.food.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("foodDetails")
//@PropertySource("com/food/commons/food.properties")
public class FoodDetails {
	private int foodId;
	private String foodName;
	private int preparationTime;
	private String restaurantName;
	
	//Setter Section
	@Autowired
	public void setFoodId(@Value("${food.id}") int foodId) {
		this.foodId = foodId;
	}
	@Autowired
	public void setFoodName(@Value("${food.name}")String foodName) {
		this.foodName = foodName;
	}
	@Autowired
	public void setPreparationTime(@Value("${food.preparationTime}")int preparationTime) {
		this.preparationTime = preparationTime;
	}
	@Autowired
	public void setRestaurantName(@Value("${restaurant.name}") String restaurantName) {
		this.restaurantName = restaurantName;
	}
	
	//Getter Section
	public int getFoodId() {
		return foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public int getPreparationTime() {
		return preparationTime;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	
	
	@Override
	public String toString() {
		return "FoodDetails [foodId=" + foodId + ", foodName=" + foodName + ", preparationTime=" + preparationTime
				+ ", restaurantName=" + restaurantName + "]";
	}
	
	
}
