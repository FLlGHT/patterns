package patterns.composite;

import java.util.Iterator;
import java.util.List;

/**
 * @author FLIGHT
 * @creationDate 21.03.2022
 */
public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
