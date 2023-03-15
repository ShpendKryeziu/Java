package _3_Object_class;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String address;
    public Person(String name, int age, String address) {
        this.name = name; this.age = age; this.address = address;
    }
    @Override
    public String toString() {
        return  "Name = " + name + '\'' +
                ", age = " + age +
                ", address = '" + address + '\'';
    }
    @Override
    public int hashCode() {
        String person = name+age+address;
        return person.hashCode();
    }
}
