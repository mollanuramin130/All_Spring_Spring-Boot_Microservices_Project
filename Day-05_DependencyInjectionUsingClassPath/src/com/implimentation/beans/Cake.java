package com.implimentation.beans;

public abstract class Cake {
	private String cake_Flavour;
	private float cake_quantity;
	private static float cake_price=300;
	private String shape_of_cake;
	
	public Cake() {
		this.cake_Flavour = "Vanilla";
		this.cake_quantity = 1.5f;
		this.shape_of_cake = "Circle";
	}

	public Cake(String cake_Flavour, float cake_quantity, String shape_of_cake) {
		super();
		this.cake_Flavour = cake_Flavour;
		this.cake_quantity = cake_quantity;
		this.shape_of_cake = shape_of_cake;
	}

	public String getCake_Flavour() {
		return cake_Flavour;
	}

	public void setCake_Flavour(String cake_Flavour) {
		this.cake_Flavour = cake_Flavour;
	}

	public float getCake_quantity() {
		return cake_quantity;
	}

	public void setCake_quantity(float cake_quantity) {
		this.cake_quantity = cake_quantity;
	}

	public static float getCake_price() {
		return cake_price;
	}

	public static void setCake_price(float cake_price) {
		Cake.cake_price = cake_price;
	}

	public String getShape_of_cake() {
		return shape_of_cake;
	}

	public void setShape_of_cake(String shape_of_cake) {
		this.shape_of_cake = shape_of_cake;
	}
	
	public String getOrder() {
		return "Cake Flavour: "+cake_Flavour+
				"\nNumber of Cake: "+cake_quantity+
				"\nCake Shape: "+shape_of_cake+
				"\nCake Price: "+cake_price+
				"\nTotal Price: "+(cake_quantity*cake_price);
	}
}
