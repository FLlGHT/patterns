package patterns.proxy.gumballmachine;

import java.io.Serializable;

/**
 * @author FLIGHT
 * @creationDate 23.04.2022
 */
public interface State extends Serializable {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
