import java.util.List;

public class LibraryDAO {

	public void createIssuedItem(IssueRequest issueRequest) {
		// INSERT INTO issued_item VALUES (user_id, item_id, date_of_issue, no_of_days);
	}

	public void updateIssuedItem(ReturnRequest returnRequest, Integer dues) {
		// UPDATE issued_item SET date_of_return = NOW() AND dues_paid = dues WHERE
		// user_id = user_id
		// AND item_id = item_id;
	}

	public List<Item> searchByAuthor(String authorName) {
		// SELECT * FROM item i JOIN author a ON (i.author_id = a.id) WHERE a.name =
		// name;
		return null;
	}

	public List<Item> searchByName(String itemName) {
		// SELECT * FROM item WHERE name = name;
		return null;
	}

	public IssuedItem searchIssuedItem(int user_id, int item_id) {
		// SELECT * FROM issued_item WHERE user_id = user_id AND item_id = item_id;
		return null;
	}

}
