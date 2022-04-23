package patterns.state;

/**
 * @author FLIGHT
 * @creationDate 23.04.2022
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        System.out.println(gumballMachine);

        gumballMachine.injectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.injectQuarter();
        gumballMachine.turnCrank();
        gumballMachine.injectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
