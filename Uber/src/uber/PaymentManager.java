package uber;

public class PaymentManager {

	BookingManager bookingManager;

	PaymentService paymentService;

	public boolean makePayment(int bookingId) {
		// retrieve booking
		Booking booking = bookingManager.getBooking(bookingId);
		double amount = calculateAmount(booking.getCab().getCabType(), booking.getSource(), booking.getDestination());
		try {
			paymentService.pay(booking.getPaymentMethod(), amount);
		} catch (PaymentFailException ex) {
			ex.printStackTrace();
			return false;
		}
		return true;
	}

	private double calculateAmount(CabType cabType, Location source, Location destination) {
		return 0.0;
	}
}
