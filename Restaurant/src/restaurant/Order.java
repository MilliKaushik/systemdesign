package restaurant;

import java.util.Date;
import java.util.List;

public class Order {

	private int id;

	private List<Item> items;

	private Date timeOfOrder;

	private OrderStatusEnum orderStatus;

	private int tableId;

	private int customerId;

	public Order(List<Item> items, Date timeOfOrder, OrderStatusEnum orderStatus, int tableId, int customerId) {
		this.items = items;
		this.timeOfOrder = timeOfOrder;
		this.orderStatus = orderStatus;
		this.tableId = tableId;
		this.customerId = customerId;
	}

	public void setOrderStatus(OrderStatusEnum cancelled) {
		// TODO Auto-generated method stub

	}

	// getters and setters
}
