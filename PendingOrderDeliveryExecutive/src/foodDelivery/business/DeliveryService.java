package foodDelivery.business;

public class DeliveryService {
	
	private DEAssignmentManager  deAssignmentManager;

	public void deliverPendingOrder(Order order) {
		deAssignmentManager.assignDeliveryExecutive(order);
	}
}
