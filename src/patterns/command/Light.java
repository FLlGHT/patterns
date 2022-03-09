package patterns.command;

/**
 * @author FLIGHT
 * @creationDate 09.03.2022
 */
public class Light {
    private final String roomName;

    public Light(String name) {
        this.roomName = name;
    }

    public void on() {
        System.out.println(roomName + " light is on");
    }

    public void off() {
        System.out.println(roomName + " light is off");
    }
}
