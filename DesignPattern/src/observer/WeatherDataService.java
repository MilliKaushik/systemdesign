package observer;

import java.util.ArrayList;
import java.util.List;

//https://www.baeldung.com/java-observer-pattern
//https://www.youtube.com/watch?v=_BpmfnqjgzQ&t=179s
public class WeatherDataService implements Observable {

	private WeatherData weatherData;

	private List<Observer> observers;

	public WeatherDataService() {
		observers = new ArrayList<>();
	}

	public void setState(WeatherData weatherData) {
		this.weatherData = weatherData;
		notifyObserver();
	}

	public WeatherData getState() {
		return weatherData;
	}

	@Override
	public void addObservers(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = this.observers.indexOf(o);
		if (index >= 0)
			observers.remove(index);
	}

	@Override
	public void notifyObserver() {
		for (Observer o : observers) {
			o.update();
		}
	}

}
