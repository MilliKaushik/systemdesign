package stackoverflow.service;

import stackoverflow.model.User;

//strategy pattern
public interface BadgeService {

	public void handleBadgeAssignment(User user);

}
