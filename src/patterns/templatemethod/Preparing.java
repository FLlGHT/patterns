package patterns.templatemethod;

/**
 * @author FLIGHT
 * @creationDate 19.03.2022
 */
public class Preparing {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\n Preparing tea...");
        tea.prepareRecipe();
        System.out.println("\n Preparing coffee");
        coffee.prepareRecipe();
    }
}
