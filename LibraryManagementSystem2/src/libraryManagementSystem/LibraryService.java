package libraryManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibraryService {

	private LibraryDAO libraryDAO;

	private AuthorService authorService;

	private PublisherService publisherService;

	private RackService rackService;

	private BookCopyService bookCopyService;

	private BookService bookService;

	public void createLibrary(int noOfRacks) {
		libraryDAO.createLibrary(noOfRacks);
	}

	public void addBookToLibrary(AddBookRequest addBookRequest) throws RackNotAvailableException {
		int noOfBookCopies = addBookRequest.getBookCopies().size();
		if (noOfBookCopies > rackService.getAllRacks().size())
			throw new RackNotAvailableException("Rack Not Available");

		List<Author> authors = addAuthors(addBookRequest);

		List<Publisher> publishers = addPublishers(addBookRequest);

		Book book = createBook(addBookRequest, authors, publishers);

		List<BookCopy> bookCopies = createBookCopies(addBookRequest, book);

		addBookCopiesToRacks(bookCopies);

	}

	public void removeBookCopy(String bookCopyId) throws InvalidBookCopyIDException {
		List<Rack> racks = rackService.getAllRacks();
		BookCopy bookCopy = bookCopyService.getBookCopy(bookCopyId);
		Iterator<Rack> it = racks.iterator();
		while (it.hasNext()) {
			Rack rack = it.next();
			if (rackService.getBooksOnRack(rack.getRackNo()).contains(bookCopy)) {
				rackService.removeBookCopyToRack(bookCopy, rack.getRackNo());
				bookCopyService.removeBookCopy(bookCopyId);
				return;
			}
		}
		throw new InvalidBookCopyIDException("Invalid Book Copy Id");
	}

	private void addBookCopiesToRacks(List<BookCopy> bookCopies) {
		int rackNo = 1;
		for (BookCopy bookCopy : bookCopies) {
			rackService.addBookCopyToRack(bookCopy, rackNo);
			rackNo++;
		}
	}

	private List<BookCopy> createBookCopies(AddBookRequest addBookRequest, Book book) {
		// creating all the book copies
		List<BookCopy> bookCopies = new ArrayList<>();
		for (String bookCopyId : addBookRequest.getBookCopies()) {
			BookCopy bookCopy = new BookCopy(bookCopyId, book.getBookId());
			bookCopies.add(bookCopy);
			bookCopyService.createBookCopy(bookCopy);
		}
		return bookCopies;
	}

	private Book createBook(AddBookRequest addBookRequest, List<Author> authors, List<Publisher> publishers) {
		Book book = new Book();
		book.setAuthors(authors);
		book.setPublishers(publishers);
		book.setBookId(addBookRequest.getBookId());
		book.setTitle(addBookRequest.getTitle());
		bookService.createBook(book);
		return book;
	}

	private List<Publisher> addPublishers(AddBookRequest addBookRequest) {
		List<Publisher> publishers = new ArrayList<>();
		for (String publisherName : addBookRequest.getPublishers()) {
			Publisher publisher = publisherService.getPublisher(publisherName);

			if (publisher == null) {
				publisher = new Publisher(publisherName);
				publisherService.createPublisher(publisher);
			}
			publishers.add(publisher);
		}
		return publishers;
	}

	private List<Author> addAuthors(AddBookRequest addBookRequest) {
		List<Author> authors = new ArrayList<>();
		for (String authorName : addBookRequest.getAuthors()) {
			Author author = authorService.getAuthor(authorName);

			if (author == null) {
				author = new Author(authorName);
				authorService.createAuthor(author);
			}
			authors.add(author);
		}
		return authors;
	}

}
