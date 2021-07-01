package foodDelivery.business;

public class DEForAnOrderDto {

	private Order order;

	private DeliveryExecutive deliveryExecutive;

	private Long timetoDeliverOrder;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public DeliveryExecutive getDeliveryExecutive() {
		return deliveryExecutive;
	}

	public void setDeliveryExecutive(DeliveryExecutive deliveryExecutive) {
		this.deliveryExecutive = deliveryExecutive;
	}

	public Long getTimetoDeliverOrder() {
		return timetoDeliverOrder;
	}

	public void setTimetoDeliverOrder(Long timetoDeliverOrder) {
		this.timetoDeliverOrder = timetoDeliverOrder;
	}

}
