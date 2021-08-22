package libraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class LibraryDAO {

	private Map<Integer, Library> libraryIdToLibrary;

	public LibraryDAO() {
		libraryIdToLibrary = new HashMap<>();
	}

	public void createLibrary(int noOfRacks) {
		Library library = new Library();
		library.setNoOfRacks(noOfRacks);
		int id = IdGenerator.generateId(library);
		libraryIdToLibrary.put(id, library);
	}

}
