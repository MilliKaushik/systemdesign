package foodDelivery.business;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MediumPriorityQueue {

	private static final int MAX_SIZE = 10000;

	private static volatile MediumPriorityQueue queueInstance;

	private BlockingQueue<Order> queue;

	private MediumPriorityQueue() {
		queue = new LinkedBlockingQueue<>(MAX_SIZE);
	}

	public static MediumPriorityQueue getInstance() {
		if (queueInstance == null)
			synchronized (MediumPriorityQueue.class) {
				if (queueInstance == null)
					new MediumPriorityQueue();
			}
		return queueInstance;
	}
}
