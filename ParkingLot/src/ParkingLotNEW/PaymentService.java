package ParkingLotNEW;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PaymentService {

	private SlotPricingService slotPricingService;

	public PaymentService(SlotPricingService slotPricingService) {
		this.slotPricingService = slotPricingService;
	}

	public double calculateAmount(Booking booking) {

		long diffInMillies = Math.abs(new Date().getTime() - booking.getTimeOfBooking().getTime());
		long diffInHours = TimeUnit.HOURS.convert(diffInMillies, TimeUnit.MILLISECONDS);

		double baseCharge = slotPricingService.getBaseCharge(booking.getSlotId());
		double hourlyRate = slotPricingService.getHourlyRate(booking.getSlotId());

		double totalAmount = baseCharge + diffInHours * hourlyRate;
		return totalAmount;
	}

	public void pay(double amount, Booking booking) {
		// use a third party service
		// if payment successful
		booking.setPaid(true);
	}
}
