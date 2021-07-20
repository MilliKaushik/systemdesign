
public class Magazine extends Item {

	private Category category;

	public Magazine() {
		super();
		setCategory(Category.MAGAZINE);
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
