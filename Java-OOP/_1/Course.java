package _1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
        public static void main(String[] args) {

                String courseName = "Java Basics";
                int maxStudents = 20;
                int qualityRatingOutOf10 = 9;
                int numberOfLessons = 25;
                double hoursPerLesson = 1.5;
                List<Student> students = new ArrayList<>();
                List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
                List<Integer> studentAges = Arrays.asList(23, 31, 38);

                for (int i = 0; i < studentNames.size(); i++) {
                        Student newStudent = createNewStudent(studentNames.get(i), studentAges.get(i));
                        students.add(newStudent);
                }

                for (int i = 0; i < studentNames.size(); i ++) {
                        int y = i + 1;
                        System.out.println("Student number " + y + " is " + students.get(i).name + ", " + students.get(i).age + " years old.");
                }

        }

                public static Student createNewStudent (String name, Integer age){
                        Student student = new Student();

                        student.name = name;
                        student.age = age;

                        return student;
                }
        }
