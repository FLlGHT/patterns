package patterns.composite;

import java.util.Arrays;

/**
 * @author FLIGHT
 * @creationDate 21.03.2022
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent allMenus = createMenus();

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }

    private static MenuComponent createMenus() {
        MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert!");

        MenuComponent allMenus = new Menu("All menus!", "All menus combined!");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(dessertMenu);

        return allMenus;
    }
}
