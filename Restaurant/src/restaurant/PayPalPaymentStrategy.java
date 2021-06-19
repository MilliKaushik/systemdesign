package restaurant;

public class PayPalPaymentStrategy implements PaymentStrategy {

	@Override
	public boolean pay() {
		System.out.println("Making payment via PayPal");
		return true;
	}
}
