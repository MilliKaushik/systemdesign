package libraryManagementSystem;

public class PublisherService {

	private PublisherDAO publisherDAO;

	public void createPublisher(Publisher publisher) {
		publisherDAO.createPublisher(publisher);
	}

	public Publisher getPublisher(String name) {
		return publisherDAO.getPublisher(name);
	}

}
