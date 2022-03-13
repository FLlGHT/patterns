package patterns.facade;

import patterns.facade.elements.*;

/**
 * @author FLIGHT
 * @creationDate 13.03.2022
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Amplifier(), new Tuner(), new StreamingPlayer(),
                new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
