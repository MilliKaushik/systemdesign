import java.util.concurrent.Callable;

public class FetchPaymentDetailsTask implements Callable<PaymentDetail>{

	private PaymentService paymentService;
	
	public FetchPaymentDetailsTask(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@Override
	public PaymentDetail call() throws Exception {
		return paymentService.getPaymentDetail();		
	}

}
