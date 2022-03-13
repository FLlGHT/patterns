package patterns.facade.elements;

/**
 * @author FLIGHT
 * @creationDate 13.03.2022
 */
public class Amplifier {

    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println("Amplifier setting " + player.toString() + " to Streaming player");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier surround sound on");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier setting volume to " + volume);
    }
}
