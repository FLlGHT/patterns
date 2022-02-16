package patterns.observer.weather;

/**
 * @author FLIGHT
 * @creationDate 16.02.2022
 */
public class ForecastDisplay implements DisplayElement, Observer{

    private WeatherData weatherData;
    private Float previousTemperature;
    private float temperature;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
        this.weatherData = weatherData;
    }

    public void update() {
        this.temperature = weatherData.getTemperature();

        display();
        this.previousTemperature = this.temperature;
    }

    public void display() {
        if (previousTemperature == null) {
            System.out.println("How typical is this temperature in these parts?");
            return;
        }
        if (temperature > previousTemperature) {
            System.out.println("It's getting warmer!");
        }
        else if (temperature < previousTemperature) {
            System.out.println("It's getting colder :( ");
        }
        else System.out.println("Temperature is stable");
    }
}
