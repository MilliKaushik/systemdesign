package foodDelivery.business;

public class OrderService {

	private HighPriorityQueue highPriorityQueue;

	private MediumPriorityQueue mediumPriorityQueue;

	private LowPriorityQueue lowPriorityQueue;

	public OrderService(HighPriorityQueue highPriorityQueue, MediumPriorityQueue mediumPriorityQueue,
			LowPriorityQueue lowPriorityQueue) {
		this.highPriorityQueue = highPriorityQueue;
		this.mediumPriorityQueue = mediumPriorityQueue;
		this.lowPriorityQueue = lowPriorityQueue;
	}

	public void addOrder(Order order) {

		Customer customer = order.getCustomer();

		switch (customer.getPriority()) {
		case HIGH:
			highPriorityQueue.getInstance().add(order);
			break;
		case MEDIUM:
			mediumPriorityQueue.getInstance().add(order);
			break;
		case LOW:
			lowPriorityQueue.getInstance().add(order);
			break;
		}
	}
}
