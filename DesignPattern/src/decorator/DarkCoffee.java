package decorator;

public class DarkCoffee extends Beverage {

	@Override
	public double getCost() {
		return 10;
	}

	public String getDescription() {
		return "DarkCoffee";
	}

}
