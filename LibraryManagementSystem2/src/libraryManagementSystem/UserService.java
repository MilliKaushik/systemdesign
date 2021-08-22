package libraryManagementSystem;

public class UserService {

	private UserDAO userDAO;

	public void createUser(UserRequest userRequest) {
		User user = new User();
		user.setId(userRequest.getId());
		user.setName(userRequest.getName());
		userDAO.createUser(user);
	}

	public User getUser(Integer userId) {
		return userDAO.getUser(userId);
	}

}
