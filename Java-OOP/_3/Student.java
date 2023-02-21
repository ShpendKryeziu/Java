package _3;

public class Student {
    private String name;
    private int age;
    private String course;
    private boolean hasPaidTaxes;
    private int examsCompleted;
    private int numberOfTimesWeGotTheName;
    private int numberOfTimesHasPaidTaxesWasFalse;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Student(int age) {
        this.age = age;
    }
    Student(String name) {
        this.name = name;
    }
    Student() {
    }

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        numberOfTimesWeGotTheName++;
        if (numberOfTimesWeGotTheName > 1) {
            System.out.println("You should learn to label your Student variables better if you keep forgetting who they are");
        }
        return this.name;
    }

    void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid age");
        } else {this.age = age;}
    }
    int getAge() {
        return this.age;
    }

    void setCourse(String course) {
        this.course = course;
    }
    String getCourse() {
        return this.course;
    }

    void setHasPaidTaxes(boolean hasPaidTaxes) {
        this.hasPaidTaxes = hasPaidTaxes;
        if (!hasPaidTaxes) {
            numberOfTimesHasPaidTaxesWasFalse++;
        }
    }
    String getHasPaidTaxes() {
        if (numberOfTimesHasPaidTaxesWasFalse > 2) {
            return "The student will be expelled if he doesn't pay the taxes one more time";
        } else if (!this.hasPaidTaxes) {
            return "hasn't paid the taxes";
        } else {
            return "has paid the taxes";
        }
    }

    void setExamsCompleted(int examsCompleted) {
        if (examsCompleted < 0) {
            System.out.println("Invalid number of exams");
        } else {this.examsCompleted = examsCompleted;}
    }
    int getExamsCompleted() {
        return this.examsCompleted;
    }
}
