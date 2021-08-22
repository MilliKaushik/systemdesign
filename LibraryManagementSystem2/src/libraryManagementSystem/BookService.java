package libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class BookService {

	private PublisherService publisherService;

	private AuthorService authorService;

	private BookDAO bookDAO;

	public void createBook(Book book) {
		bookDAO.createBook(book);
	}

	public Book getBookById(String id) {
		return bookDAO.getBookById(id);
	}

	public List<Book> getBookByAuthorName(String name) {
		Author author = authorService.getAuthor(name);
		List<Book> allBooks = bookDAO.getAllBooks();
		List<Book> resultBooks = new ArrayList<>();
		for (Book book : allBooks) {
			if (book.getAuthors().contains(author))
				resultBooks.add(book);

		}
		return resultBooks;
	}

	public List<Book> getBookByPublisherName(String name) {
		Publisher publisher = publisherService.getPublisher(name);
		List<Book> allBooks = bookDAO.getAllBooks();
		List<Book> resultBooks = new ArrayList<>();
		for (Book book : allBooks) {
			if (book.getPublishers().contains(publisher))
				resultBooks.add(book);

		}
		return resultBooks;
	}

	public Book getBookByTitle(String title) {
		List<Book> books = bookDAO.getAllBooks();
		for (Book book : books) {
			if (book.getTitle().equals(title))
				return book;
		}
		return null;
	}

}
