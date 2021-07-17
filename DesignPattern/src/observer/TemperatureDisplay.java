package observer;

public class TemperatureDisplay implements Observer, Display {

	private WeatherData weatherData;

	private WeatherDataService weatherDataService;

	public TemperatureDisplay(WeatherDataService weatherDataService) {
		this.weatherDataService = weatherDataService;
		weatherDataService.addObservers(this);
	}

	@Override
	public void update() {
		setWeatherData(weatherDataService.getState());
		display();
	}

	@Override
	public void display() {
		System.out.println("Temperature : " + weatherData.getTemperature());
	}

	public void setWeatherData(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

}
