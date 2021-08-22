package libraryManagementSystem;

import java.util.List;

//Template Method Pattern
public abstract class BorrowRequestValidator {

	private static final int MAX_LIMIT = 5;

	private UserService userService;

	public void validate(BorrowRequest borrowBookRequest)
			throws OverLimitException, InvalidBookIDException, InvalidBookCopyIDException {
		validateValidBook(borrowBookRequest);
		validateBookBorrowLimitReached(borrowBookRequest);
	}

	protected abstract void validateValidBook(BorrowRequest borrowBookRequest) throws InvalidBookCopyIDException, InvalidBookIDException;

	private void validateBookBorrowLimitReached(BorrowRequest borrowBookRequest) throws OverLimitException {
		List<BorrowedBook> borrowedBooks = userService.getUser(borrowBookRequest.getUserId()).getBorrowedBooks();
		int countOfBorrowedBooks = 0;
		for (BorrowedBook borrowedBook : borrowedBooks) {
			if (!borrowedBook.isReturned())
				countOfBorrowedBooks++;
			if (countOfBorrowedBooks >= MAX_LIMIT)
				throw new OverLimitException("Overlimit");
		}
	}

}
