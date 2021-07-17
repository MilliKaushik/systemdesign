package singleton;

public class SingletonSynchronized {

	private static SingletonSynchronized instance;

	private SingletonSynchronized() {

	}

	// this prevents multiple threads from creating many instances. However, this
	// slows down performance as by using synchronized keyword to getInstance, we
	// force every thread to wait its turn before it can enter the method. That is,
	// no two threads can enter the method at the same time. Synchronization is
	// expensive.
	// The only time synchronization is relevant is the first time through this
	// method. In other words, once we have set the instance variable to an instance
	// of Singleton, we have no further need to synchronize this method.
	// After the first time through, synchronization is totally unneeded overhead.
	// This is really useful only the first time that two
	// threads are both entering at the same time and trying to create an instance
	public synchronized static SingletonSynchronized getInstance() {
		if (instance == null)
			instance = new SingletonSynchronized();
		return instance;
	}

}
