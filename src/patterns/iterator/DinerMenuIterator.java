package patterns.iterator;

import java.util.Iterator;

/**
 * @author FLIGHT
 * @creationDate 21.03.2022
 */
public class DinerMenuIterator implements Iterator<MenuItem> {

    private final MenuItem[] menuItems;
    private int position;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return (position < menuItems.length && menuItems[position] != null);
    }

    @Override
    public MenuItem next() {
        return menuItems[position++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("You shouldn't be trying to remove menu items");
    }
}
