package stackoverflow.service;

import stackoverflow.model.User;

public class AdminService {

	public void blockMember(User user) {
		user.setBlocked(true);
	}

	public void unblockMember(User user) {
		user.setBlocked(false);
	}
}
