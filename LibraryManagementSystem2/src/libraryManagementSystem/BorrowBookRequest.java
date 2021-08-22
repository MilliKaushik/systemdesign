package libraryManagementSystem;

public class BorrowBookRequest extends BorrowRequest {

	@Override
	protected void setBook(String bookId) {
		super.book = bookId;
	}

}
