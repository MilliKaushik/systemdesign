package singleton;

public class SingletonEagerInit {

	// this is thread safe as static initialization happens only once(per class
	// loader)
	private static SingletonEagerInit instance = new SingletonEagerInit();

	private SingletonEagerInit() {

	}

	// we have already got an instance, so just return it
	// JVM ensures that the instance will be created before any thread accesses the
	// static instance variable
	public static SingletonEagerInit getInstance() {
		return instance;
	}

}
