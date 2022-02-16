package patterns.observer.weather;

/**
 * @author FLIGHT
 * @creationDate 16.02.2022
 */
public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

    public float getTemperature();
    public float getHumidity();
    public float getPressure();
}
