package foodDelivery.business;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class HighPriorityQueue {

	private static final int MAX_SIZE = 10000;

	private static volatile HighPriorityQueue queueInstance;

	private BlockingQueue<Order> queue;

	private HighPriorityQueue() {
		queue = new LinkedBlockingQueue<>(MAX_SIZE);
	}

	public static HighPriorityQueue getInstance() {
		if (queueInstance == null)
			synchronized (HighPriorityQueue.class) {
				if (queueInstance == null)
					new HighPriorityQueue();
			}
		return queueInstance;
	}

	public static HighPriorityQueue getQueueInstance() {
		return queueInstance;
	}

	public BlockingQueue<Order> getQueue() {
		return queue;
	}

	public void setQueue(BlockingQueue<Order> queue) {
		this.queue = queue;
	}

}
