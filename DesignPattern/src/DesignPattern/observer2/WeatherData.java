package DesignPattern.observer2;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {

	private List<Observer> observers;

	private double temperature;

	private double pressure;

	private double humidity;

	public WeatherData(List<Observer> observers) {
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		if (observers.indexOf(observer) >= 0)
			observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers)
			observer.update();
	}

	public void measurementsChanged(double temperature, double humidity, double pressure) {
		setTemperature(temperature);
		setHumidity(humidity);
		setPressure(pressure);
		notifyObservers();
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

}
