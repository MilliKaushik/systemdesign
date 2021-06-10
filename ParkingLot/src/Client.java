
public class Client {

	// There are multiple buildings and hence, multiple entrances and
	// hence,concurrency issues can occur while booking slots.
	// Made the bookSlot API in SlotService synchronized. Is this enough?
	public static void main(String[] args) {
		SlotService slotService = new SlotService();
		BookingService bookingService = new BookingService();
		ParkingLotService parkingLotService = new ParkingLotService(slotService, bookingService);

		Vehicle vehicle = new Vehicle();
		vehicle.setId(1);
		vehicle.setLicencePlate("ABC1234");
		vehicle.setVehicleType(VehicleType.CAR);

		Booking booking = null;
		try {
			booking = parkingLotService.placeVehicle(vehicle);
		} catch (SlotNotFoundException e) {
			System.out.println("No slot found");
			e.printStackTrace();
		}

		SlotPricingService slotPricingService = new SlotPricingService();
		PaymentService paymentService = new PaymentService(slotPricingService);

		// when user wants to unpark, he presses on "Calculate Amount" button, he is
		// displayed
		// the amount and then he presses "Pay" button. After this, he is displayed the
		// "Take vehicle" button.
		double amountToBePaid = paymentService.calculateAmount(booking);
		paymentService.pay(amountToBePaid, booking);

		try {
			parkingLotService.removeVehicle(booking);
		} catch (BookingNotPaidException e) {
			System.out.println("Payment not successful so can't retrieve vehicle");
			e.printStackTrace();
		}
	}
}
