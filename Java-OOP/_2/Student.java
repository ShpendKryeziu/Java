package _2;

public class Student {
    String name;
    int age;
    Student (String name, int age) {
        System.out.println("Constructing!");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!");
    }

    Student (int age) {
        this.age = age;
    }
    Student (String name) {
        this.name = name;
    }
    Student () {
    }
}
