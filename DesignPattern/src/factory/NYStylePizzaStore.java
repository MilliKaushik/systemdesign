package factory;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese"))
			pizza = new NYStyleCheesePizza();
		else if (type.equals("veggie"))
			pizza = new NYStyleVeggiePizza();
		return pizza;
	}

}
