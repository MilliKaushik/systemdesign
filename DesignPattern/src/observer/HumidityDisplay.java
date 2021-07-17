package observer;

public class HumidityDisplay implements Observer, Display {

	private WeatherData weatherData;

	private WeatherDataService weatherDataService;

	public HumidityDisplay(WeatherDataService weatherDataService) {
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
		System.out.println("Humidity : " + weatherData.getHumidity());
	}

	public void setWeatherData(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

}
