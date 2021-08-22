package libraryManagementSystem;

public class BookCopy {

	private String bookCopyId;

	private String bookId;

	public BookCopy(String bookCopyId, String bookId) {
		this.bookCopyId = bookCopyId;
		this.bookId = bookId;
	}

	public String getBookCopyId() {
		return bookCopyId;
	}

	public void setBookCopyId(String bookCopyId) {
		this.bookCopyId = bookCopyId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

}
