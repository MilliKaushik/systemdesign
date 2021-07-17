package decorator;

//changed to support different sizes
public class Soy extends CondimentsDecorator {

	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double getCost() {
		double cost = beverage.getCost();
		Size size = beverage.getSize();
		switch (size) {
		case TALL:
			cost += .10;
			break;
		case GRANDE:
			cost += .15;
			break;
		case VENTI:
			cost += .20;
			break;
	
		}
		return cost;
	}

}
