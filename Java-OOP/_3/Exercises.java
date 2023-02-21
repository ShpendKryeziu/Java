package _3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        Student albiLu = new Student("Alberto Lugato", 29);
        albiLu.setCourse("Medicina e Chirurgia");
        albiLu.setExamsCompleted(30);
        albiLu.setHasPaidTaxes(true);
        System.out.println(albiLu.getName() + " is a student of " + albiLu.getCourse() + " and " + albiLu.getHasPaidTaxes());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        Student shpend = new Student();
        shpend.setName("Shpend Kryeziu");
        shpend.setAge(-14);
        shpend.setExamsCompleted(-3);
        shpend.setHasPaidTaxes(false);
        shpend.setHasPaidTaxes(false);
        shpend.setHasPaidTaxes(false);
        shpend.setCourse("Java Basics");
        System.out.println("The student is " + shpend.getName() + ". " + shpend.getHasPaidTaxes());
        System.out.println(shpend.getName());
    }

}
