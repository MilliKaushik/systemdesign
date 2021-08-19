package splitvise.model;

public class Balance {

	private String owedBy;

	private String owedTo;

	private double amount;

	public Balance(String owedBy, String owedTo, double amount) {
		this.owedBy = owedBy;
		this.owedTo = owedTo;
		this.amount = amount;
	}

	public String getOwedBy() {
		return owedBy;
	}

	public void setOwedBy(String owedBy) {
		this.owedBy = owedBy;
	}

	public String getOwedTo() {
		return owedTo;
	}

	public void setOwedTo(String owedTo) {
		this.owedTo = owedTo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
