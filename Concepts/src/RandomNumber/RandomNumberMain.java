package RandomNumber;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RandomNumberMain {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		RandomNumberTask task = new RandomNumberTask();
		Future<Integer> result = executorService.submit(task);
		try {
			System.out.println(result.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
