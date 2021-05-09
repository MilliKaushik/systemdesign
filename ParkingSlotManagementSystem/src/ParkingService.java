public class ParkingService {
	// entity - db
	// model - data transfer object

	SlotService slotService;

	PaymentService paymentService;

	int parkVehicle(Vehicle vehicle) {
		Slot slot = slotService.assignSlot(vehicle.vehicleType);
		Parking parking = createParking(slot, vehicle);
		return parking.id;
	}

	void unparkVehicle(int parkingId) {
		double amount = paymentService.collectPayment();
		// Parking parking = getParking(parkingId); slotId = parking.getSlotId();
		int slotId = 0;
		slotService.unassignSlot(slotId);
		freeParking(parkingId);
	}

	private Parking createParking(Slot slot, Vehicle vehicle) {
		// persists in DB a parking object
		return null;
	}

	private void freeParking(int parkingId) {
		// TODO Auto-generated method stub

	}

}
