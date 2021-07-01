package foodDelivery;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import foodDelivery.business.DeliveryService;
import foodDelivery.business.HighPriorityQueue;
import foodDelivery.business.HighPriorityQueueTask;
import foodDelivery.business.LowPriorityQueue;
import foodDelivery.business.MediumPriorityQueue;
import foodDelivery.business.Order;
import foodDelivery.business.OrderService;

public class Driver {

	public static void main(String[] args) {

		HighPriorityQueue highPriorityQueue = HighPriorityQueue.getInstance();

		MediumPriorityQueue mediumPriorityQueue = MediumPriorityQueue.getInstance();

		LowPriorityQueue lowPriorityQueue = LowPriorityQueue.getInstance();

		OrderService orderService = new OrderService(highPriorityQueue, mediumPriorityQueue, lowPriorityQueue);

		Order order = new Order();
		orderService.addOrder(order);

		ScheduledExecutorService highPriorityExecutor = Executors.newScheduledThreadPool(20);
		DeliveryService deliveryService = new DeliveryService();
		highPriorityExecutor.schedule(new HighPriorityQueueTask(deliveryService), 5000, TimeUnit.MILLISECONDS);

	}
}
