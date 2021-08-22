package libraryManagementSystem;

import java.util.List;

public class BorrowBookCopyValidator extends BorrowRequestValidator {

	private RackService rackService;

	@Override
	protected void validateValidBook(BorrowRequest borrowBookCopyRequest) throws InvalidBookCopyIDException {
		int noOfRacks = rackService.getAllRacks().size();
		String bookCopyId = borrowBookCopyRequest.getBook();
		for (int i = 1; i <= noOfRacks; i++) {
			List<BookCopy> bookCopies = rackService.getBooksOnRack(i);
			if (bookCopies.contains(bookCopyId))
				return;
		}
		throw new InvalidBookCopyIDException("Invalid Book Copy ID");
	}

}
