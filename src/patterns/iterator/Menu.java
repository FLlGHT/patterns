package patterns.iterator;

import java.util.Iterator;

/**
 * @author FLIGHT
 * @creationDate 21.03.2022
 */
public interface Menu {
    public Iterator<MenuItem> createIterator();
}
