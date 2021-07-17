package decorator;

public abstract class Beverage {

	private String description;

	enum Size {
		TALL, GRANDE, VENTI
	};

	private Size size;

	public abstract double getCost();

	public String getDescription() {
		return "Any beverage!";
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Size getSize() {
		return this.size;
	}

}
