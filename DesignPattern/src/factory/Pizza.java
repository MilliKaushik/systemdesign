package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;

	String dough;

	String sauce;

	List<String> toppings;

	public Pizza() {
		toppings = new ArrayList<>();
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings : ");
		for (String topping : toppings)
			System.out.print(" " + topping);
	}

	public void bake() {
		System.out.println("Baking for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Placing pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

}
