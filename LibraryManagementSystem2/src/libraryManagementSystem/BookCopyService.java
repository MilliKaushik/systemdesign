package libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class BookCopyService {

	private BookService bookService;

	private BookCopyDAO bookCopyDAO;

	public void createBookCopy(BookCopy bookCopy) {
		bookCopyDAO.createBookCopy(bookCopy);
	}

	public BookCopy getBookCopy(String bookCopyId) {
		return bookCopyDAO.getBookCopy(bookCopyId);
	}

	public List<BookCopy> getAllBookCopies() {
		return bookCopyDAO.getAllBookCopies();
	}

	public List<BookCopy> getBookCopiesForBookId(String bookId) {
		return bookCopyDAO.getBookCopiesForBookId(bookId);
	}

	public List<BookCopy> getBookCopiesByAuthor(String authorName) {
		List<Book> booksForAuthor = bookService.getBookByAuthorName(authorName);

		List<BookCopy> resultBookCopies = new ArrayList<>();
		for (Book book : booksForAuthor) {
			resultBookCopies.addAll(getBookCopiesForBookId(book.getBookId()));
		}
		return resultBookCopies;
	}

	public List<BookCopy> getBookCopiesByPublisher(String publisherName) {
		List<Book> booksForPublisher = bookService.getBookByPublisherName(publisherName);

		List<BookCopy> resultBookCopies = new ArrayList<>();
		for (Book book : booksForPublisher) {
			resultBookCopies.addAll(getBookCopiesForBookId(book.getBookId()));
		}
		return resultBookCopies;
	}

	public List<BookCopy> getBookCopiesByTitle(String title) {
		Book book = bookService.getBookByTitle(title);

		List<BookCopy> resultBookCopies = getBookCopiesForBookId(book.getBookId());
		return resultBookCopies;
	}

	public void removeBookCopy(String bookCopyId) {
		BookCopy bookCopy = getBookCopy(bookCopyId);
		bookCopyDAO.removeBookCopy(bookCopy);
	}

}
