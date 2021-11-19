package hotelManagementSystem;

import java.util.Date;

public class BookingService {

	private Object lock = new Object();

	private IdGenerator idGenerator;

	private BookingDAO bookingDAO;

	public Booking createBooking(BookingRequest bookingRequest) {
		synchronized (lock) {
			Booking booking = new Booking();
			booking.setBookingDate(new Date());
			booking.setBookingStatus(BookingStatus.UNPAID);
			booking.setStartDate(bookingRequest.getStartDate());
			booking.setEndDate(bookingRequest.getEndDate());
			booking.setGuest(bookingRequest.getGuest());
			booking.setRooms(bookingRequest.getRooms());
			booking.setId(idGenerator.generateId());
			return bookingDAO.createBooking(booking);
		}
	}

	public Booking getBookingByGuest(int guestId) {
		return null;
	}
}
