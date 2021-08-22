package libraryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RackDAO {

	Map<Integer, Rack> racks;
	private Map<Integer, Set<BookCopy>> rackNoToBookCopyIdsMap;

	public RackDAO() {
		racks = new HashMap<>();
		rackNoToBookCopyIdsMap = new TreeMap<>();
	}

	public void createRack(int rackNo) {
		Set<BookCopy> bookCopies = new HashSet<>();
		racks.put(rackNo, new Rack(rackNo));
		rackNoToBookCopyIdsMap.put(rackNo, bookCopies);
	}

	public List<Rack> getAllRacks() {
		return new ArrayList<>(racks.values());
	}

	public Rack getRack(int rackNo) {
		return racks.get(rackNo);
	}

	public List<BookCopy> getAllBooksOnRack(int rackNo) {
		return new ArrayList<>(rackNoToBookCopyIdsMap.get(rackNo));
	}

	public void addBookCopyToRack(BookCopy bookCopy, int rackNo) {
		Set<BookCopy> bookCopiesOnRack = rackNoToBookCopyIdsMap.get(rackNo);
		bookCopiesOnRack.add(bookCopy);
		rackNoToBookCopyIdsMap.put(rackNo, bookCopiesOnRack);
	}

	public void removeBookCopyToRack(BookCopy bookCopy, int rackNo) {
		Set<BookCopy> bookCopiesOnRack = rackNoToBookCopyIdsMap.get(rackNo);
		bookCopiesOnRack.remove(bookCopy);
		rackNoToBookCopyIdsMap.put(rackNo, bookCopiesOnRack);
	}

}
