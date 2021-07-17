package decorator;

public class Espresso extends Beverage {

	@Override
	public double getCost() {
		return 20;
	}

	public String getDescription() {
		return "Espresso";
	}

}
