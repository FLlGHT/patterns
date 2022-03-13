package patterns.facade.elements;

/**
 * @author FLIGHT
 * @creationDate 13.03.2022
 */
public class StreamingPlayer {

    private String currentMovie;

    public void on() {
        System.out.println("Streaming player on");
    }

    public void off() {
        System.out.println("Streaming player off");
    }

    public void play(String movie) {
        currentMovie = movie;
        System.out.println("Streaming player playing " + movie);
    }

    public void stop() {
        System.out.println("Streaming player stopped " + currentMovie);
    }

    @Override
    public String toString() {
        return "StreamingPlayer{" +
                '}';
    }
}
