package uber;

public class CabManager {

	CabConectionServiceManager cabConectionServiceManager;

	public void updateCabWithBooking(Booking booking, Cab cab) {
		CabService cabService = cabConectionServiceManager.getCabService(cab);
		cabService.updateCabWithBooking(cab, booking);
	}

	public void updateBookingStatusForCancellation(Cab cab) {
		CabService cabService = cabConectionServiceManager.getCabService(cab);
		cabService.updateCabForCancellation(cab);
	}
}
