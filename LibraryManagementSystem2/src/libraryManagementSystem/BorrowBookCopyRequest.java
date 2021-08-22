package libraryManagementSystem;

public class BorrowBookCopyRequest extends BorrowRequest {

	@Override
	protected void setBook(String bookCopyID) {
		super.book = bookCopyID;

	}

}
