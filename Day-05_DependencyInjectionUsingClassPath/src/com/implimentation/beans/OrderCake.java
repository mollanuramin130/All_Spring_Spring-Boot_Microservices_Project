package com.implimentation.beans;

public class OrderCake extends Cake{
	private String message_on_cake;

	public OrderCake() {
		super();
	}

	public OrderCake(String cake_Flavour, float cake_quantity, String shape_of_cake) {
		super(cake_Flavour, cake_quantity, shape_of_cake);
	}

	public OrderCake(String cake_Flavour, float cake_quantity, String shape_of_cake,String message_on_cake) {
		super(cake_Flavour, cake_quantity, shape_of_cake);
		this.message_on_cake = message_on_cake;
	}
	
	@Override
	public String getOrder() {
		// TODO Auto-generated method stub
		if(message_on_cake!=null) {
			return super.getOrder()+"\n"+message_on_cake;
		}
		return super.getOrder();
	}
	
}
