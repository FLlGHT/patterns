package patterns.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author FLIGHT
 * @creationDate 24.04.2022
 */
public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        String[] location = {"rmi://flight1/gumball-machine",
                "rmi://flight2/gumball-machine",
                "rmi://flight3/gumball-machine"};

        List<GumballMonitor> monitors = new ArrayList<>();
        for (String address : location) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(address);
                GumballMonitor monitor = new GumballMonitor(machine);
                monitors.add(monitor);
                System.out.println(monitor);
            } catch (NotBoundException | MalformedURLException | RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        for (GumballMonitor gumballMonitor : monitors) {
            gumballMonitor.report();
        }
    }
}
