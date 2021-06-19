package Sum;
import java.util.concurrent.Callable;

public class SumCallableTask implements Callable<Integer> {

	int a, b;

	public SumCallableTask(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Integer call() throws Exception {
		return a + b;
	}
}
