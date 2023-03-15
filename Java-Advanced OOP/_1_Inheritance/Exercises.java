package _1_Inheritance;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog chihuahua = new Dog("Chihuahua", 0.25, 6);
        Dog pastore = new Dog("Pastore Tedesco", 0.7, 29);
        Fish cod = new Fish("Merluzzo", 0.35, 8);
        Fish trota = new Fish("Trota", 0.12, 0.7);
        Bird passero = new Bird(0.15, 0.08, 0.1);
        Bird aquila = new Bird(2, 0.3, 1.3);
        List<Animal> concorrentiSfida = new ArrayList<>(Arrays.asList(chihuahua, passero, pastore, trota, cod, aquila));
        // E' una cosa un po' convoluta, ma perché volevo provare l'inheritance nei cicli e nelle Collection
        Map<Animal, Double> velocità = new HashMap<>();
        for (Animal x : concorrentiSfida) {
            if (x instanceof Dog) {velocità.put(x, ((Dog) x).runSpeedMetersPerSecond());}
            else if (x instanceof Fish) {velocità.put(x, ((Fish) x).swimSpeedMetersPerSecond());}
            else if (x instanceof Bird) {velocità.put(x, ((Bird) x).flySpeedMetersPerSecond());}
        }
        Animal fastest = null;
        double speed = Integer.MIN_VALUE;
        for (Map.Entry<Animal, Double> entry : velocità.entrySet()) {
           if (entry.getValue() > speed) {speed = entry.getValue(); fastest = entry.getKey();}
        }
        System.out.println("The fastest animal is " + fastest);
    }
}
