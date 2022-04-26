package patterns.proxy.gumballmachine;

import java.rmi.*;

/**
 * @author FLIGHT
 * @creationDate 24.04.2022
 */
public interface GumballMachineRemote extends Remote {

    int getCount() throws RemoteException;
    String getLocation() throws  RemoteException;
    State getCurrentState() throws RemoteException;

}
