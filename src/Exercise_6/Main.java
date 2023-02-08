package Exercise_6;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        double value = 81;
        double valueSquareRoot = Math.sqrt(value);
        System.out.println(valueSquareRoot);
    }

    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;
        int maxValue = Math.max(valueA,valueB);
        int minValue = Math.min(valueA,valueB);

        System.out.println("Max=" +maxValue);
        System.out.println("Min=" +minValue);

        // Write your code here
    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 50;
        int costPerBurger = 9;
        // Write your code here
        int totalBurgersBought = totalMoney / costPerBurger;
        int remainderAfterBuyingMaxBurgers = totalBurgersBought % costPerBurger;
        System.out.println("Remainder=" +remainderAfterBuyingMaxBurgers);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // Ceiling probably returns the next integer value of a decimal
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
        // Floor probably returns the previous integer value of a decimal
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
        // Round probably rounds the decimal, up between 0,5 and 0,9, down between 0,1 and 0,4
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));
        // Elevates ourValue to the power of the number in the brackets, in this case resulting in 4,5 ^ 2 (4.5*4.5)
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
        // Elevates ourValue to the power of the number in the brackets, in this case resulting in 4,5 ^ 3 (4.5*4.5*4.5)
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
        // Random probably generates a random number from 0 to 1 unless specified in the brackets , so in this case we would
        // get a random number between 0 and 4.5
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}