package foodDelivery;

import java.util.Date;

public class Order {

	private int id;

	// private Customer customer; - if priority of order is important, we can add
	// this

	private Date orderTime;

	private Location orderLocation;

	public Order(int id, Date orderTime, Location orderLocation) {
		this.id = id;
		this.orderTime = orderTime;
		this.orderLocation = orderLocation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Location getOrderLocation() {
		return orderLocation;
	}

	public void setOrderLocation(Location orderLocation) {
		this.orderLocation = orderLocation;
	}

}
