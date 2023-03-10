package _6_Enum;

public class Exercises6 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }

    private enum Days {
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);
        private boolean isWeekend;
        Days(boolean isWeekend) {
            this.isWeekend = isWeekend;
        }
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        getDatesOfSeasons(Seasons.WINTER);
        getDatesOfSeasons(Seasons.SUMMER);
    }

    private static void getDatesOfSeasons(Seasons input) {
        switch (input) {
            case SPRING -> System.out.println("Spring goes from 21/03 to 20/06");
            case SUMMER -> System.out.println("Summer goes from 21/06 to 22/09");
            case FALL -> System.out.println("Fall goes from 23/09 to 20/12");
            case WINTER -> System.out.println("Winter goes from 21/12 to 20/03");
        }
    }


    private enum Seasons {
        SPRING, SUMMER, FALL, WINTER;
    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        System.out.println(nextLight(TrafficLight.RED));
    }

    private enum TrafficLight {
        RED, YELLOW, GREEN;
    }

    private static TrafficLight nextLight (TrafficLight input) {
        return switch (input) {
            case RED -> TrafficLight.GREEN;
            case YELLOW -> TrafficLight.RED;
            case GREEN -> TrafficLight.YELLOW;
        };
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        canWePartyYet(Days.SATURDAY);
    }

    private static void canWePartyYet(Days day) {
        if (day.isWeekend) {
            System.out.println("Weekend!!");
        } else {System.out.println("weekday.."); }
    }



    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;

        System.out.println(operation(num1, num2, Operator.MULTIPLY));
    }

    private enum Operator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE;
    }

    private static double operation(double x, double y, Operator operator) {
        return switch (operator) {
            case ADD -> x+y;
            case SUBTRACT -> x-y;
            case MULTIPLY -> x*y;
            case DIVIDE -> x/y;
        };
    }
}
