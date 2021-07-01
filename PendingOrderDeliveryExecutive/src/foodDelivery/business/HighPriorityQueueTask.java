package foodDelivery.business;

public class HighPriorityQueueTask implements Runnable {

	private DeliveryService deliveryService;

	public HighPriorityQueueTask(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}

	@Override
	public void run() {
		Order order = HighPriorityQueue.getInstance().getQueue().remove();
		deliveryService.deliverPendingOrder(order);
	}
}
