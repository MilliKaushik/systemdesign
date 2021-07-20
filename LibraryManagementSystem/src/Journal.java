
public class Journal extends Item {

	private Category category;

	public Journal() {
		super();
		setCategory(Category.JOURNAL);
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
