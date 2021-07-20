package observer;

public class WeatherData {

	private double temperature;

	private double pressure;

	private double humidity;

	public WeatherData(double temperature, double pressure, double humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
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