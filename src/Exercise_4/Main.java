package Exercise_4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int myAge = 28;
        System.out.println("My name is " +myAge);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        char myInitial = 'S';
        int myAge = 28;
        System.out.println("My age is " +myAge +", my initial is " +myInitial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Defined the boolean variable to the question "Has he eaten lunch?"
        boolean hasEatenLunch = false;
        // Defined the cost of said lunch
        double lunchCost = 5.99;
        // Printed on the console the lunch cost and if the lunch was eaten
        System.out.println("Lunch cost=" + lunchCost);
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
