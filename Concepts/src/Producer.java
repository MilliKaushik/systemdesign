import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/producer-consumer-solution-using-threads-java/
public class Producer implements Runnable {

	int capacity;
	List<Integer> queue;

	public Producer(int capacity) {
		this.capacity = capacity;
		queue = new ArrayList<>();
	}

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			if (capacity == queue.size())
				wait();

		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
