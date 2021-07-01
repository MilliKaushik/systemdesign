package foodDelivery.business;

import java.util.Date;

public class Order {

	private int id;

	private Restaurant restaurnat;

	private Date timeOfOrder;

	private Customer customer;

	private DeliveryExecutive deliveryExecutive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Restaurant getRestaurnat() {
		return restaurnat;
	}

	public void setRestaurnat(Restaurant restaurnat) {
		this.restaurnat = restaurnat;
	}

	public Date getTimeOfOrder() {
		return timeOfOrder;
	}

	public void setTimeOfOrder(Date timeOfOrder) {
		this.timeOfOrder = timeOfOrder;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public DeliveryExecutive getDeliveryExecutive() {
		return deliveryExecutive;
	}

	public void setDeliveryExecutive(DeliveryExecutive deliveryExecutive) {
		this.deliveryExecutive = deliveryExecutive;
	}

}
