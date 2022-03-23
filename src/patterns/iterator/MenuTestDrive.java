package patterns.iterator;

/**
 * @author FLIGHT
 * @creationDate 21.03.2022
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
        waitress.printMenu();
    }
}
