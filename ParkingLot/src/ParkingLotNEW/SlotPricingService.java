package ParkingLotNEW;

public class SlotPricingService {
	private SlotService slotService;

	public double getBaseCharge(int slotId) {
		Slot slot = slotService.getSlot(slotId);
		SlotPricingEnum slotPricing = SlotPricingEnum.valueOf(String.valueOf(slot.getSlotType()));
		return slotPricing.getBaseCharge();
	}

	public double getHourlyRate(int slotId) {
		Slot slot = slotService.getSlot(slotId);
		SlotPricingEnum slotPricing = SlotPricingEnum.valueOf(String.valueOf(slot.getSlotType()));
		return slotPricing.getHourlyRate();
	}
}
