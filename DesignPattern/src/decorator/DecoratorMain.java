package decorator;

import decorator.Beverage.Size;

public class DecoratorMain {

	public static void main(String[] args) {
		// Case 1 - Simple espresso
		Beverage beverage1 = new Espresso();
		System.out.println(beverage1.getDescription() + " : " + beverage1.getCost());

		// Case 2 - Dark Coffee with Whip
		Beverage beverage2 = new DarkCoffee();
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " : " + beverage2.getCost());

		// Case 3 - Espresso with Mocha and Soy
		Beverage beverage3 = new Soy(new Mocha(new Espresso()));
		beverage3.setSize(Size.GRANDE);
		System.out.println(beverage3.getDescription() + " : " + beverage3.getCost());
	
	//Case 4 : Dark Coffee with Soy and Grande size
		Beverage beverage4 = new DarkCoffee();
		beverage4.setSize(Size.VENTI);
		beverage4 = new Soy(beverage4);
		System.out.println(beverage4.getDescription() + " : " + beverage4.getCost());
			
	}

}
