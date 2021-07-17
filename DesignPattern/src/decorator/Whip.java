package decorator;

public class Whip extends CondimentsDecorator {

	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 300;
	}

}
