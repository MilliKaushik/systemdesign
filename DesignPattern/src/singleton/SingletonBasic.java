package singleton;

public class SingletonBasic {

	private static SingletonBasic instance;

	private SingletonBasic() {
	}

	// Lazy initialization - if we never need any instance of the class during the
	// lifetime of the program, we never initialize it. This is useful in case of
	// objects that are resource intensive.
	public static SingletonBasic getInstance() {
		if (instance == null)
			instance = new SingletonBasic();
		return instance;
	}

}
