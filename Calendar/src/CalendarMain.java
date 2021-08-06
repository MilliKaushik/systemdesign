import java.util.Scanner;

public class CalendarMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			Calendar cal = new Calendar();
			String s = sc.nextLine();
			String start = s.substring(0, 2);
			switch (start) {
			case "ad": {
				cal.addUser(s.split(" ")[1]);
				break;
			}
			case "cr": {
				String[] strArr = s.split(" ");
				cal.createEvent(strArr);
				break;
			}
			case "sh": {
				cal.showEvent(s.split(" "));
				break;
			}
			case "su": {
				cal.showEvent(s.split(" "));
				break;
			}
			}
		}

//		cal.createEvent("create-event 2021-07-21 600 60 2 user1 user2");
//		cal.createEvent("create-event 2021-07-21 660 30 2 user1 user2");
	}

}
