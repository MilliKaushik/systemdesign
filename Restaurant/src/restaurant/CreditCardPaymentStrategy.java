package restaurant;

public class CreditCardPaymentStrategy implements PaymentStrategy {

	@Override
	public boolean pay() {
		System.out.println("Making payment via Credit card");
		return false;
	}
}
