import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calendar {

	private class UserEvent {
		String user;
		Date eventDate;

		public UserEvent(String user, Date eventDate) {
			this.user = user;
			this.eventDate = eventDate;
		}
	}

	private class Event {
		int startTime;
		int endTime;
		List<String> eventUsers;

		public Event(int startTime, int endTime, List<String> eventUsers) {
			this.startTime = startTime;
			this.endTime = endTime;
			this.eventUsers = eventUsers;
		}
	}

	List<String> users;
	Map<UserEvent, Event> map;

	public Calendar() {
		users = new ArrayList<>();
		map = new HashMap<>();
	}

	public void addUser(String username) {
		if (users.contains(username)) {
			System.out.println("failure");
			return;
		}
		users.add(username);
		System.out.println("success");
	}

	public void createEvent(String[] strArr) {
		int j = 0;
		Date eventDate = null;
		try {
			eventDate = new SimpleDateFormat("yyyy-MM-dd").parse(strArr[1]);
		} catch (ParseException e) {
			System.out.println("failure");
			return;
		}

		int startTime = Integer.parseInt(strArr[2]);
		int duration = Integer.parseInt(strArr[3]);
		int noOfUsers = Integer.parseInt(strArr[4]);
		int x = noOfUsers;
		int k = 5;
		List<String> userList = new ArrayList<>();
		while (x-- != 0) {
			userList.add(strArr[k]);
			k++;
		}

		int endTime = startTime + duration;
		for (Map.Entry<UserEvent, Event> entry : map.entrySet()) {
			UserEvent userEvent = entry.getKey();
			if (!userEvent.eventDate.equals(eventDate))
				continue;
			Event e = entry.getValue();
			if (e.endTime < startTime || endTime < e.startTime)
				continue;
			else {
				System.out.println("failure");
				return;
			}
		}
		for (int i = 0; i < noOfUsers; i++) {
			UserEvent u = new UserEvent(userList.get(i), eventDate);
			Event e = new Event(startTime, endTime, userList);
			map.put(u, e);
		}
		System.out.println("success");
	}

	public void showEvent(String[] strArr) {
		Date eventDate = null;
		try {
			eventDate = new SimpleDateFormat("yyyy-MM-dd").parse(strArr[1]);
		} catch (ParseException e) {
			System.out.println("failure");
			return;
		}

		String user = strArr[2];
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");

		for (Map.Entry<UserEvent, Event> entry : map.entrySet()) {
			UserEvent u = entry.getKey();

			if (u.user.equals(user) && (fmt.format(eventDate).equals(fmt.format(u.eventDate)))) {
				Event e = entry.getValue();
				System.out.println(e.startTime + "-" + e.endTime + " " + e.eventUsers);
			}

		}
	}

	public void suggestEvent(String[] strArr) {
		Date eventDate = null;
		try {
			eventDate = new SimpleDateFormat("yyyy-MM-dd").parse(strArr[1]);
		} catch (ParseException e) {
			System.out.println("failure");
			return;
		}
		int startRange = Integer.parseInt(strArr[2]);
		int endRange = Integer.parseInt(strArr[3]);
		int dur = Integer.parseInt(strArr[4]);
		int noOfUsers = Integer.parseInt(strArr[5]);
		int x = noOfUsers;
		int k = 6;
		List<String> userList = new ArrayList<>();
		while (x-- != 0) {
			userList.add(strArr[k]);
			k++;
		}

		for (String user : userList) {

		}
	}
}
