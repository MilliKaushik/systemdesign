package RandomNumber;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberTask implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Random random = new Random();
		int sleepTime = random.nextInt(5);
		Thread.sleep(sleepTime * 1000);
		return random.nextInt();
	}
}
