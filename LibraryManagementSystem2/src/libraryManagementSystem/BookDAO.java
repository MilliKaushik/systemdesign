package libraryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookDAO {

	private Map<String, Book> books;

	public BookDAO(Map<String, Book> books) {
		books = new HashMap<>();
	}

	public void createBook(Book book) {
		books.put(book.getBookId(), book);
	}

	public Book getBookById(String id) {
		return books.get(id);
	}

	public List<Book> getAllBooks() {
		return new ArrayList<>(books.values());
	}

	public Book getBookByAuthorName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
