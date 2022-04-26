package patterns.proxy.gumballmachine;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * @author FLIGHT
 * @creationDate 23.04.2022
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        try {
            GumballMachine gumballMachine = new GumballMachine(args[0], Integer.parseInt(args[1]));
            Naming.rebind("//" + args[0] + "/gumball-machine", gumballMachine);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
