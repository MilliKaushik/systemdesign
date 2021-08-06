package stackoverflow.service;

import stackoverflow.model.User;

public class PointService {

	public void addPoints(User user, int points) {
		user.setPoints(user.getPoints() + points);
	}

	public void reducePoints(User user, int points) throws LessUserPointException {
		if (user.getPoints() >= points)
			user.setPoints(user.getPoints() - points);
		else
			throw new LessUserPointException();
	}

}
