package singleton;

public class SingletonDoubleCheckedLocking {

	// volatile keyword ensures that multiple threads handle the instance variable
	// correctly when it is being initialized to the SingletonDoubleCheckedLocking
	// instance
	private volatile static SingletonDoubleCheckedLocking instance;

	private SingletonDoubleCheckedLocking() {

	}

	public static SingletonDoubleCheckedLocking getInstance() {
		if (instance == null) {
			// here we only synchronize the first time through
			synchronized (SingletonDoubleCheckedLocking.class) {
				if (instance == null)
					instance = new SingletonDoubleCheckedLocking();
			}
		}
		return instance;
	}

}
