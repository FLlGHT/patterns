package patterns.iterator;

import java.util.Iterator;

/**
 * @author FLIGHT
 * @creationDate 21.03.2022
 */
public class DinerMenu implements Menu {

    private static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Fake bacon with lettuce && tomato",
                true, 2.99);
        addItem("BLT", "Bacon with lettuce && tomato ",
                false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad",
                false, 3.29);
        addItem("Hot Dog", "A hot dog with saurkraut, relish, onions, topped with cheese",
                false, 3.05 );
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        }
        else {
            menuItems[numberOfItems++] = menuItem;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
