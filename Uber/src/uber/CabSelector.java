package uber;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//https://stackoverflow.com/a/39105179
//Use invokeAny if you are looking for successful completion of one task out of N submitted tasks.
//In this case, tasks in progress will be cancelled if one of the tasks completes successfully.
public class CabSelector {

	CabConectionServiceManager cabConnectionServiceManager;

	public Cab selectCab(List<Cab> cabs) {
		ExecutorService executorService = Executors.newFixedThreadPool(20);
		// 20 cabs nearby maybe

		List<CabRequestTask> tasks = new ArrayList<>();
		for (Cab cab : cabs) {
			CabService cabService = cabConnectionServiceManager.getCabService(cab);
			tasks.add(new CabRequestTask(cabService, cab));
		}
		Cab cab = null;
		try {
			cab = executorService.invokeAny(tasks);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		return cab;
	}
}
