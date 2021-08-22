package libraryManagementSystem;

import java.util.List;

public class RackService {

	private RackDAO rackDAO;

	public void createRack(int rackNo) {
		rackDAO.createRack(rackNo);
	}

	public List<Rack> getAllRacks() {
		return rackDAO.getAllRacks();
	}

	public Rack getRack(int rackNo) {
		return rackDAO.getRack(rackNo);
	}

	public void addBookCopyToRack(BookCopy bookCopy, int rackNo) {
		rackDAO.addBookCopyToRack(bookCopy, rackNo);
	}

	public void removeBookCopyToRack(BookCopy bookCopy, int rackNo) {
		rackDAO.removeBookCopyToRack(bookCopy, rackNo);
	}

	public List<BookCopy> getBooksOnRack(int rackNo) {
		return rackDAO.getAllBooksOnRack(rackNo);
	}
}
