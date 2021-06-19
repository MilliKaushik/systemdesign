package uber;

public class BookingManager {

	public Booking createBooking(BookingRequest bookingRequest, Cab cab) {
		Booking booking = new Booking();
		booking.setBookingStatus(BookingStatus.BOOKED);
		booking.setCab(cab);
		return booking;
	}

	public void cancelBookingWithCab(int bookingId) {
		Booking booking = getBooking(bookingId);
		booking.setBookingStatus(BookingStatus.CANCELLED);
	}

	public Booking getBooking(int bookingId) {
		return null;
	}
}
