package observer;

public class ObserverMain {

	public static void main(String[] args) {

		WeatherDataService weatherDataService = new WeatherDataService();

		Observer tempObserver = new TemperatureDisplay(weatherDataService);

		Observer humidityObserver = new HumidityDisplay(weatherDataService);

		WeatherData weatherData = new WeatherData(96.8, 100, 50);
		weatherDataService.setState(weatherData);

	}

}
