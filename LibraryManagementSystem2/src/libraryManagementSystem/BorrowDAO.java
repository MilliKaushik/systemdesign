package libraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class BorrowDAO {

	private Map<String, BorrowedBook> borrowedBooksByBookCopy;

	public BorrowDAO() {
		borrowedBooksByBookCopy = new HashMap<>();
	}

	public void createBorrowedBook(BorrowedBook borrowedBook) {
		borrowedBooksByBookCopy.put(borrowedBook.getBookCopyId(), borrowedBook);
	}

	public BorrowedBook getBorrowedBook(String bookCopyID) {
		return borrowedBooksByBookCopy.get(bookCopyID);
	}

	public void update(BorrowedBook borrowedBook) {
		borrowedBooksByBookCopy.put(borrowedBook.getBookCopyId(), borrowedBook);
	}

}
