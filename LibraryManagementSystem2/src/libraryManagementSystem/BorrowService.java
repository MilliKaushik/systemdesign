package libraryManagementSystem;

import java.util.Date;
import java.util.List;

public class BorrowService {

	private Object lock = new Object();

	private BorrowRequestValidator borrowBookValidator;

	private RackService rackService;

	private BookCopyService bookCopyService;

	private BorrowDAO borrowDAO;

	public BorrowedBook getBorrowedBook(String bookCopyID) {
		return borrowDAO.getBorrowedBook(bookCopyID);
	}

	public void update(BorrowedBook borrowedBook) {
		borrowDAO.update(borrowedBook);
	}

	public void markBorrowedBookReturned(BookCopy bookCopy) {
		BorrowedBook borrowedBook = getBorrowedBook(bookCopy.getBookCopyId());
		borrowedBook.setDateOfReturn(new Date());
		borrowedBook.setReturned(true);
		update(borrowedBook);
	}

	public void borrowBook(BorrowRequest borrowBookRequest)
			throws OverLimitException, BookNotAvailableException, InvalidBookIDException, InvalidBookCopyIDException {
		borrowBookValidator.validate(borrowBookRequest);

		List<BookCopy> bookCopies = bookCopyService.getBookCopiesForBookId(borrowBookRequest.getBook());
		BookCopy bookCopy = null;
		synchronized (lock) {
			List<Rack> racks = rackService.getAllRacks();
			for (Rack rack : racks) {
				for (BookCopy currentBookCopy : bookCopies) {
					if (rackService.getBooksOnRack(rack.getRackNo()).contains(currentBookCopy)) {
						bookCopy = currentBookCopy;
						BorrowedBook borrowedBook = new BorrowedBook();
						borrowedBook.setBookCopyId(currentBookCopy.getBookCopyId());
						borrowedBook.setDateOfIssue(new Date());
						borrowedBook.setDateOfReturn(borrowBookRequest.getDueDate());
						borrowedBook.setUserId(borrowBookRequest.getUserId());
						borrowedBook.setReturned(false);
						borrowDAO.createBorrowedBook(borrowedBook);
						rackService.removeBookCopyToRack(currentBookCopy, rack.getRackNo());
						break;
					}
				}
			}
		}
		if (bookCopy == null)
			throw new BookNotAvailableException("Not Available");
	}

	public void borrowBookCopy(BorrowBookCopyRequest borrowBookCopyRequest)
			throws OverLimitException, InvalidBookIDException, InvalidBookCopyIDException {
		borrowBookValidator.validate(borrowBookCopyRequest);

		synchronized (lock) {
			BookCopy bookCopy = bookCopyService.getBookCopy(borrowBookCopyRequest.getBook());
			synchronized (lock) {
				List<Rack> racks = rackService.getAllRacks();
				for (Rack rack : racks) {
					if (rackService.getBooksOnRack(rack.getRackNo()).contains(bookCopy)) {
						BorrowedBook borrowedBook = new BorrowedBook();
						borrowedBook.setBookCopyId(bookCopy.getBookCopyId());
						borrowedBook.setDateOfIssue(new Date());
						borrowedBook.setDateOfReturn(borrowBookCopyRequest.getDueDate());
						borrowedBook.setUserId(borrowBookCopyRequest.getUserId());
						borrowedBook.setReturned(false);
						borrowDAO.createBorrowedBook(borrowedBook);
						rackService.removeBookCopyToRack(bookCopy, rack.getRackNo());
						break;
					}
				}
			}
		}
	}
}