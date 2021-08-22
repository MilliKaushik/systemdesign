package libraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class AuthorDAO {

	private Map<String, Author> authors;

	public AuthorDAO() {
		authors = new HashMap<>();
	}

	public void createAuthor(Author author) {
		authors.put(author.getName(), author);
	}

	public Author getAuthor(String name) {
		return authors.get(name);
	}

}
