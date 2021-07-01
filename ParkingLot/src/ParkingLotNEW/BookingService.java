package ParkingLotNEW;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BookingService {

	private Map<Integer, Booking> slotBookingMapping;

	public BookingService() {
		slotBookingMapping = new HashMap<>();
	}

	public Booking createBooking(Slot slot, Vehicle vehicle) {
		Booking booking = new Booking();
		booking.setPaid(false);
		booking.setSlotId(slot.getId());
		booking.setTimeOfBooking(new Date());
		booking.setVehicleId(vehicle.getId());
		slotBookingMapping.put(slot.getId(), booking);
		return booking;
	}

	public void removeBooking(Booking booking) {
		slotBookingMapping.remove(booking.getSlotId());
	}
}
