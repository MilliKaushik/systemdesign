
public class ParkingLotService {

	private SlotService slotService;

	private BookingService bookingService;

	public ParkingLotService(SlotService slotService, BookingService bookingService) {
		this.slotService = slotService;
		this.bookingService = bookingService;
	}

	public Booking placeVehicle(Vehicle vehicle) throws SlotNotFoundException {
		Slot slot = slotService.bookSlot(vehicle);
		if (slot == null)
			throw new SlotNotFoundException("No slot found!");

		Booking booking = bookingService.createBooking(slot, vehicle);
		return booking;
	}

	public void removeVehicle(Booking booking) throws BookingNotPaidException {
		if (!booking.isPaid())
			throw new BookingNotPaidException("Payment has not been done for this booking");
		slotService.removeSlot(booking.getSlotId());
		bookingService.removeBooking(booking);
	}
}
