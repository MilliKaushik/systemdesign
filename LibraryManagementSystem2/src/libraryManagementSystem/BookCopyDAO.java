package libraryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookCopyDAO {

	private Map<String, BookCopy> bookCopies;
	private Map<String, Set<BookCopy>> bookIdToBookCopies;

	public BookCopyDAO() {
		bookCopies = new HashMap<>();
		bookIdToBookCopies = new HashMap<>();
	}

	public void createBookCopy(BookCopy bookCopy) {
		bookCopies.put(bookCopy.getBookCopyId(), bookCopy);
		Set<BookCopy> bookCopies = bookIdToBookCopies.get(bookCopy.getBookId());
		if (!bookIdToBookCopies.containsKey(bookCopy.getBookId()))
			bookCopies = new HashSet<>();
		bookCopies.add(bookCopy);
		bookIdToBookCopies.put(bookCopy.getBookId(), bookCopies);
	}

	public BookCopy getBookCopy(String bookCopyId) {
		return bookCopies.get(bookCopyId);
	}

	public List<BookCopy> getAllBookCopies() {
		return new ArrayList<>(bookCopies.values());
	}

	public void removeBookCopy(BookCopy bookCopy) {
		bookCopies.remove(bookCopy.getBookCopyId());
		Set<BookCopy> bookCopies = bookIdToBookCopies.get(bookCopy.getBookId());
		bookCopies.remove(bookCopy);
		bookIdToBookCopies.put(bookCopy.getBookId(), bookCopies);
	}

	public List<BookCopy> getBookCopiesForBookId(String bookId) {
		return new ArrayList<>(bookIdToBookCopies.get(bookId));
	}

}
