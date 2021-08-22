package libraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {

	private Map<Integer, User> users;

	public UserDAO() {
		users = new HashMap<>();
	}

	public void createUser(User user) {
		users.put(user.getId(), user);
	}

	public User getUser(int id) {
		return users.get(id);
	}

}
