package libraryManagementSystem;

import java.util.Objects;

public class IdGenerator {

	public static int generateId(Object o) {
		return Objects.hash(o);
		// return UUID.randomUUID().toString();
	}

}
