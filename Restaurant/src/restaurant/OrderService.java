package restaurant;

import java.util.Date;
import java.util.List;

public class OrderService {

	private FoodItemInventoryManagementService inventoryManagementService;

	public Order placeOrder(List<Item> items, Table table, Customer customer) {
		Order order = addOrder(items, table, customer);
		boolean areItemsAvailable = inventoryManagementService.areItemsAvailable(items);
		if (!areItemsAvailable)
			order.setOrderStatus(OrderStatusEnum.CANCELLED);
		return order;
	}

	public void cancelOrder(int orderId) {
		Order order = getOrder(orderId);
		order.setOrderStatus(OrderStatusEnum.CANCELLED);
	}

	public Order getOrder(int orderId) {
		// return order object for this order id
		return null;
	}

	public Order addOrder(List<Item> items, Table table, Customer customer) {
		Order order = new Order(items, new Date(), OrderStatusEnum.PLACED, table.getId(), customer.getId());
		return order;
	}
}
