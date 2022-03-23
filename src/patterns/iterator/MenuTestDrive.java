package patterns.iterator;

import java.util.Arrays;

/**
 * @author FLIGHT
 * @creationDate 21.03.2022
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        Waitress waitress = new Waitress(Arrays.asList(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu()));
        waitress.printMenu();
    }
}
