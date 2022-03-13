package patterns.facade.elements;

/**
 * @author FLIGHT
 * @creationDate 13.03.2022
 */
public class TheaterLights {

    public void dim(int percents) {
        System.out.println("Theater lights dimming to " + percents + "%");
    }

    public void on() {
        System.out.println("Theater ceiling lights on");
    }
}
