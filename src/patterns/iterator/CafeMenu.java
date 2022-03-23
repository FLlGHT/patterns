package patterns.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author FLIGHT
 * @creationDate 23.03.2022
 */
public class CafeMenu implements Menu {

    private final Map<String, MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new HashMap<>();
        addItem("Burrito", "A large burrito", false, 4.29);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
