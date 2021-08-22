package libraryManagementSystem;

import java.util.List;

public class BorrowBookValidator extends BorrowRequestValidator {

	private BookCopyService bookCopyService;

	@Override
	protected void validateValidBook(BorrowRequest borrowBookRequest) throws InvalidBookIDException {
		List<BookCopy> bookCopies = bookCopyService.getBookCopiesForBookId(borrowBookRequest.getBook());
		if (bookCopies.isEmpty())
			throw new InvalidBookIDException("Invalid book ID");
	}
}
