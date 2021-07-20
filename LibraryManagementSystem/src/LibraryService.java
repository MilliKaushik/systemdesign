import java.util.List;

//tables -> 
//1. item -> (id, name, date_of_publishing, author_id, edition, category_id, genre_id)
//foreign keys -> author_id, category_id, genre_id
//index -> by name, by author_id
//2. category table -> (id, name) -> this table stores whether the item is a book, journal, or magazine
//3. author -> (id, name)
//4. genre -> (id, name)
//5. user -> (id, name, date_of_account_creation)
//6. issued_book -> (id, user id, book id, date_of_issue, no_of_days, dues_paid, date_of_return)

public class LibraryService {

	private DuesService duesService;

	private DisplayService displayService;

	private LibraryDAO libraryDAO;

	// REST call -> /author/{name}
	public List<Item> searchByAuthor(String author) {
		return libraryDAO.searchByAuthor(author);
	}

	// REST call -> /item/{name}
	public List<Item> searchByName(String name) {
		return libraryDAO.searchByName(name);
	}

	// REST call ->
	// /issueRequest/user/{user_id}/item/{item_id}/dateOfIssue/{dateOfIssue}/noOfDays/{noOfDays}
	public void issueItem(IssueRequest issueRequest) {
		libraryDAO.createIssuedItem(issueRequest);
	}

	// REST call -> /returnRequest/user/{user_id}/item/{item_id}
	public void returnItem(ReturnRequest returnRequest) {
		int dues = 0;
		try {
			dues = duesService.handleDues(returnRequest);
		} catch (DuesNotClearedException e) {
			displayService.display("Dues not cleared. Please try again.");
			e.printStackTrace();
		}

		libraryDAO.updateIssuedItem(returnRequest, dues);
	}

}
