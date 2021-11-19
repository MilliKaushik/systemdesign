package hotelManagementSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingDAO {

	private Map<String, Booking> bookings;
	
	private Map<String, List<Booking>> guestIdToBookings;

	public BookingDAO() {
		bookings = new HashMap<>();
		guestIdToBookings = new HashMap<>();
	}

	public Booking getBooking(int id) {
		return bookings.get(id);
	}

	public Booking createBooking(Booking booking) {
		bookings.put(booking.getId(), booking);
		return booking;
	}

	public Booking updateBooking(Booking booking) {
		bookings.put(booking.getId(), booking);
		return booking;
	}

}
