package patterns.command;

/**
 * @author FLIGHT
 * @creationDate 09.03.2022
 */
public class Stereo {

    String roomName;

    public Stereo(String roomName) {
        this.roomName = roomName;
    }

    public void on() {
        System.out.println(roomName + " stereo is on");
    }

    public void off() {
        System.out.println(roomName + " stereo is off");
    }

    public void setCD() {
        System.out.println(roomName + " stereo is set for CD input");
    }

    public void setDVD() {

    }

    public void setRadio() {

    }

    public void setVolume(int volume) {
        System.out.println(roomName + "volume set to " + volume);
    }
}
