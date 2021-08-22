package libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int id;

	private String name;

	private List<BorrowedBook> borrowedBooks;

	public User() {
		borrowedBooks = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BorrowedBook> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(List<BorrowedBook> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

}
