import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class DuesService {

	private DisplayService displayService;

	private PaymentService paymentService;

	private LibraryDAO libraryDAO;

	public int handleDues(ReturnRequest returnRequest) throws DuesNotClearedException {
		IssuedItem issuedItem = libraryDAO.searchIssuedItem(returnRequest.getUser().getId(),
				returnRequest.getItem().getId());
		int dues = calculateDues(issuedItem);
		if (dues == 0) {
			displayService.display("You have no dues");
			return 0;
		}

		displayService.display("Please pay the following dues " + dues + ". Please enter your card details.");
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		FetchPaymentDetailsTask task = new FetchPaymentDetailsTask(paymentService);
		Future<PaymentDetail> future = executorService.submit(task);
		PaymentDetail paymentDetail = null;

		try {
			paymentDetail = future.get(20, TimeUnit.SECONDS);
		} catch (Exception e) {
			future.cancel(true);
			throw new DuesNotClearedException();
		}

		paymentService.pay(paymentDetail);
		return dues;
	}

	private int calculateDues(IssuedItem issuedItem) {
		return 0;
	}

}
