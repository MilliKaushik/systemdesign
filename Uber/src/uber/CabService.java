package uber;

public class CabService {

	public void updateCabWithBooking(Cab cab, Booking booking) {
		cab.setCurrentBooking(booking);
	}

	public void updateCabForCancellation(Cab cab) {
		cab.setCurrentBooking(null);
	}

	public Cab requestCabForConfirmation(Cab cab) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		} // wait for driver to confirm
		return cab;
	}
}
