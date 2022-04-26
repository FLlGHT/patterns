package patterns.proxy.gumballmachine;

import java.rmi.*;

/**
 * @author FLIGHT
 * @creationDate 24.04.2022
 */
public class GumballMonitor {

    private final GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("Gumball machine " + gumballMachine.getLocation());
            System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
            System.out.println("Current state " + gumballMachine.getCurrentState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
