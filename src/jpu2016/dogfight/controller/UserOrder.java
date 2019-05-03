package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder{
	
	private int player;
	private Order order;
	
	public UserOrder(int player_, Order order_) {
		player = player_;
		order = order_;
	}

	public int getPlayer() {
		return player;
	}

	public Order getOrder() {
		return order;
	}
	
}
