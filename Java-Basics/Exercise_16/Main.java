package Exercise_16;

import java.util.Arrays;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Put this into a function
        double celsius = 30;
        /*double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        // End
        System.out.println(conversionDescription);*/
        System.out.println(tempConversion(12));
    }
    static String tempConversion(double celsius) {
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        return conversionDescription;
    }

    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            namesFormatting(name);
        }
    }
    static void namesFormatting(String name) {
        if (name.contains("0") || name.contains("1") || name.contains("2") || name.contains("3") || name.contains("4") ||
                name.contains("5") || name.contains("6") || name.contains("7") || name.contains("8") || name.contains("9")) {
            System.out.println("Invalid");
        } else System.out.println(name.toUpperCase().trim());
    }
    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;
        // Call your function
        stampaIlPranzo(myLunchPrice, lunchType, description, weightInGrams);
    }
    static void stampaIlPranzo(double lunchPrice, String lunchType, String description, int weightInGrams) {
        System.out.println("The price of my lunch is " +lunchPrice + " for a " +lunchType + ". It's a " + description + " that weighs "
                +weightInGrams + " grams");
    }
}
