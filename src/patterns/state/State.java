package patterns.state;

/**
 * @author FLIGHT
 * @creationDate 23.04.2022
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
