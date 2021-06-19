package ParkingLotNEW;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BookingService {

	private Map<Integer, Booking> slotBookingMaping;

	public BookingService() {
		slotBookingMaping = new HashMap<>();
	}

	public Booking createBooking(Slot slot, Vehicle vehicle) {
		Booking booking = new Booking();
		booking.setPaid(false);
		booking.setSlotId(slot.getId());
		booking.setTimeOfBooking(new Date());
		booking.setVehicleId(vehicle.getId());
		slotBookingMaping.put(slot.getId(), booking);
		return booking;
	}

	public void removeBooking(Booking booking) {
		slotBookingMaping.remove(booking.getSlotId());
	}
}
