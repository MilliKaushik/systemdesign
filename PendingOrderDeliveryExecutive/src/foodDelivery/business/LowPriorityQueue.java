package foodDelivery.business;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LowPriorityQueue {

	private static final int MAX_SIZE = 10000;

	private static volatile LowPriorityQueue queueInstance;

	private BlockingQueue<Order> queue;

	private LowPriorityQueue() {
		queue = new LinkedBlockingQueue<>(MAX_SIZE);
	}

	public static LowPriorityQueue getInstance() {
		if (queueInstance == null)
			synchronized (LowPriorityQueue.class) {
				if (queueInstance == null)
					new LowPriorityQueue();
			}
		return queueInstance;
	}
}
