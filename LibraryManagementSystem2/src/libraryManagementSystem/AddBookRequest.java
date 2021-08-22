package libraryManagementSystem;

import java.util.List;

public class AddBookRequest {

	private String bookId;

	private String title;

	private List<String> bookCopies;

	private List<String> authors;

	private List<String> publishers;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getBookCopies() {
		return bookCopies;
	}

	public void setBookCopies(List<String> bookCopies) {
		this.bookCopies = bookCopies;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public List<String> getPublishers() {
		return publishers;
	}

	public void setPublishers(List<String> publishers) {
		this.publishers = publishers;
	}

}
