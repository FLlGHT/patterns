package patterns.command;

/**
 * @author FLIGHT
 * @creationDate 09.03.2022
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living room");


        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        remoteControl.setCommand(2, garageDoor::up, garageDoor::down);
        remoteControl.setCommand(3, stereo::on, stereo::off);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonPushed(3);

    }

}
