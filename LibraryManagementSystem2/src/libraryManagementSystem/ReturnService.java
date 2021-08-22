package libraryManagementSystem;

public class ReturnService {

	private BookCopyService bookCopyService;

	private RackService rackService;

	private BorrowService borrowService;

	public void returnBook(ReturnRequest returnRequest) {
		int noOfRacks = rackService.getAllRacks().size();
		BookCopy bookCopy = bookCopyService.getBookCopy(returnRequest.getBookCopyId());

		for (int rackNo = 1; rackNo <= noOfRacks; rackNo++) {
			if (rackService.getBooksOnRack(rackNo).contains(bookCopy))
				;
		}
		borrowService.markBorrowedBookReturned(bookCopy);
	}
}
