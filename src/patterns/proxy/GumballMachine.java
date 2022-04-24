package patterns.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author FLIGHT
 * @creationDate 23.04.2022
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private final State soldState;
    private final State soldOutState;
    private final State hasQuarterState;
    private final State noQuarterState;
    private final State winnerState;
    private State currentState;
    private int count;
    private String location;

    public GumballMachine(String location, int numberGumBalls) throws RemoteException {
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        winnerState = new WinnerState(this);
        count = numberGumBalls;

        if (count > 0)
            currentState = noQuarterState;
        else
            currentState = soldOutState;

        this.location = location;
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void injectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void releaseBall() {
        System.out.println("The gumball comes rolling out the slot....");
        if (count > 0) count -= 1;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "GumballMachine Model #2424";
    }
}
