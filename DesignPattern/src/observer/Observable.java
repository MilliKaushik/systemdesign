package observer;

public interface Observable {

	void addObservers(Observer o);

	void removeObserver(Observer o);

	void notifyObserver();

}
