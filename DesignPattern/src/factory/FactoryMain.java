package factory;

public class FactoryMain {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYStylePizzaStore();
		pizzaStore.orderPizza("veggie");

	}

}
