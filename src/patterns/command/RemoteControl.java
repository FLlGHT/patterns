package patterns.command;

import java.util.Arrays;

/**
 * @author FLIGHT
 * @creationDate 09.03.2022
 */
public class RemoteControl {
    private final Command[] onCommands;
    private final Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        toString.append("\n-------- Remote Control ----- \n");
        for (int i = 0; i < onCommands.length; i++) {
            toString.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append("    ").append(offCommands[i].getClass().getName()).append("\n");
        }
        return toString.toString();
    }
}
