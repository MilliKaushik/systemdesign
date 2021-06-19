package uber;

import java.util.List;

//https://github.com/mdsAyubi/random/tree/master/sd/cabservice
//https://github.com/shadab005/DataStructureAndAlgo/tree/master/softwaredesign/src/module/uber
//Optional to see : https://github.com/anomaly2104/lld-cab-booking-ola-uber-grab-lyft/tree/master/src/main/java/com/uditagarwal/cabbooking 
public class BookingService {

	CabFinder cabFinder;

	CabSelector cabSelector;

	BookingManager bookingManager;

	PaymentManager paymentManager;

	CabManager cabManager;

	public Booking createBooking(BookingRequest bookingRequest) {
		List<Cab> nearbyCabs = cabFinder.findNearbyCabs(bookingRequest.getSourceLocation(),
				bookingRequest.getCabType());
		// select one of the cabs from the list
		Cab cab = cabSelector.selectCab(nearbyCabs);
		// create booking
		if (cab == null)
			return null;
		Booking booking = bookingManager.createBooking(bookingRequest, cab);
		boolean isPaymentSuccessful = paymentManager.makePayment(booking.getId());
		if (!isPaymentSuccessful) {
			booking.setBookingStatus(BookingStatus.CANCELLED);
			return booking;
		}
		cabManager.updateCabWithBooking(booking, cab);
		return booking;
	}

	public void cancelBooking(int bookingId) {
		bookingManager.cancelBookingWithCab(bookingId);
		Cab cab = bookingManager.getBooking(bookingId).getCab();
		cabManager.updateBookingStatusForCancellation(cab);
	}
}
