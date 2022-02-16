package patterns.observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FLIGHT
 * @creationDate 16.02.2022
 */
public class StatisticsDisplay implements DisplayElement, Observer{

    private WeatherData weatherData;
    private float temperature;

    private final List<Float> temperatureHistory;

    private float min;
    private float max;
    private float avg;
    private int count;

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);

        this.weatherData = weatherData;
        temperatureHistory = new ArrayList<>();

        min = Float.MAX_VALUE;
        max = Float.MIN_VALUE;
        avg = 0f;
    }

    public void update() {
        this.temperature = weatherData.getTemperature();
        temperatureHistory.add(temperature);
        calculate();

        display();
    }

    public void display() {
        System.out.println("avg/min/max temperature: " + avg + " / " + min + " / " + max);
    }

    private void calculate() {
        if (temperature < min) min = temperature;
        if (temperature > max) max = temperature;

        avg = (avg * count + temperature) / (count + 1);
        count++;
    }
}
