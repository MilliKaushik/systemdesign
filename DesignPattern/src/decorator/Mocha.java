package decorator;

public class Mocha extends CondimentsDecorator {

	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 100;
	}

}
