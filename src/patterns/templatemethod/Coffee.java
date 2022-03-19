package patterns.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author FLIGHT
 * @creationDate 18.03.2022
 */
public class Coffee extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public boolean customerWant() {
        return getUserInput().startsWith("y");
    }

    private String getUserInput() {
        String answer = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Would you want milk and sugar with your coffee? (y/n)? " );
        try {
            answer = reader.readLine();
        } catch (IOException e) {
            System.out.println("Don't understand");
        }

        return answer;
    }
}
