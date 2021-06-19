package Sum;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SumMain {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		List<SumCallableTask> tasks = new ArrayList<>();
		for (int i = 1; i <= 100; i += 2) {
			SumCallableTask task = new SumCallableTask(i, i + 1);
			tasks.add(task);
		}

		List<Future<Integer>> futures = null;
		try {
			futures = executorService.invokeAll(tasks);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int totalSum = 0;
		for (Future<Integer> result : futures)
			try {
				totalSum += result.get();
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}

		System.out.println("Sum is : " + totalSum);
		executorService.shutdown();
		try {
			if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS))
				executorService.shutdownNow();
		} catch (InterruptedException e) {
			executorService.shutdownNow();
		}
	}
}
