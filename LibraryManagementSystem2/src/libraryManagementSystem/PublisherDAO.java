package libraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class PublisherDAO {

	private Map<String, Publisher> publishers;

	public PublisherDAO() {
		publishers = new HashMap<>();
	}

	public void createPublisher(Publisher publisher) {
		publishers.put(publisher.getName(), publisher);

	}

	public Publisher getPublisher(String name) {
		return publishers.get(name);
	}

}
