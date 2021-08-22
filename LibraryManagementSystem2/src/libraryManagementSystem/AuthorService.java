package libraryManagementSystem;

public class AuthorService {

	private AuthorDAO authorDAO;

	public void createAuthor(Author author) {
		authorDAO.createAuthor(author);
	}

	public Author getAuthor(String name) {
		return authorDAO.getAuthor(name);
	}

}
