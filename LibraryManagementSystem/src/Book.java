
public class Book extends Item {

	private Category category;

	public Book() {
		super();
		setCategory(Category.BOOK);
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
