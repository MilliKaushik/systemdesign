package uber;

import java.util.concurrent.Callable;

public class CabRequestTask implements Callable<Cab> {

	CabService cabService;

	Cab cab;

	public CabRequestTask(CabService cabService, Cab cab) {
		this.cabService = cabService;
		this.cab = cab;
	}

	@Override
	public Cab call() throws Exception {
		return cabService.requestCabForConfirmation(cab);
	}

}
