
public enum SlotPricingEnum {

	SMALL(10.0, 100.0), MEDIUM(20.0, 200.0), LARGE(30.0, 300.0), XLARGE(40.0, 400.0);

	private final double baseCharge;
	private final double hourlyRate;

	SlotPricingEnum(double baseCharge, double hourlyRate) {
		this.baseCharge = baseCharge;
		this.hourlyRate = hourlyRate;
	}

	public double getBaseCharge() {
		return baseCharge;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}
}
