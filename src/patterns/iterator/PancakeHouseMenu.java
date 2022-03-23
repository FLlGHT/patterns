package patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author FLIGHT
 * @creationDate 21.03.2022
 */
public class PancakeHouseMenu implements Menu {

    private final List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();

        addItem("K&B Pancake breakfast",
                "Pancake with scrambled eggs and toast",
                true, 2.99);

        addItem("Regular pancake breakfast", "Pancakes with fried eggs, sausage",
                false, 2.99);

        addItem("Blueberry Pancakes",
                "Pancake made with fresh blueberries",
                true, 3.49);

        addItem("Waffles", "Waffles",
                true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
