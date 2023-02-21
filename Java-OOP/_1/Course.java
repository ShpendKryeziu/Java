package _1;

import java.util.List;

public class Course {
    String courseName;
    int maxStudents;
    int qualityRatingOutOf10;
    int numberOfLessons;
    double hoursPerLesson;
    List<Student> students;

    public double averageAgeOfStudents() {
        double sum = 0;
        for (Student student : students) {
            sum += student.age;
        }
        return sum / students.size();
    }

    @Override
    public String toString() {
        return "Course{" +
                courseName +
                ", Max Students = " + maxStudents +
                ", Quality Rating = " + qualityRatingOutOf10 + "/10" +
                ", Number of lessons = " + numberOfLessons +
                ", Hours per lesson = " + hoursPerLesson +
                '}';
    }
}
