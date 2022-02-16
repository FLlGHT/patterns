package patterns.observer.weather;

/**
 * @author FLIGHT
 * @creationDate 16.02.2022
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(30, 80, 30.4f);
        weatherData.setMeasurements(32, 75, 30.2f);
        weatherData.setMeasurements(28, 70, 30.2f);
    }
}
