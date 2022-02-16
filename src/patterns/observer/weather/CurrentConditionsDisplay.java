package patterns.observer.weather;

/**
 * @author FLIGHT
 * @creationDate 16.02.2022
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();

        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature +
                "C degrees and " + humidity + " % humidity");
    }
}
