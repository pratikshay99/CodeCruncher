package Beginner.advanced.collectionsEg;

import java.util.HashMap;
import java.util.Map;

// A simple class to store student details
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class CustomClassAsMapValue {
    public static void main(String[] args) {
        // Map of Roll Number (String) to Student object
        Map<String, Student> studentMap = new HashMap<>();

        // Create Student objects
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);

        // Put into map using roll numbers as keys
        studentMap.put("101", s1);
        studentMap.put("102", s2);

        // Access a student by roll number
        Student s = studentMap.get("101");
        System.out.println("Student 101: " + s.name + ", Age: " + s.age);
        //Op: Student 101: Alice, Age: 20

        // Loop over the map
        System.out.println("\nAll students:");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            String roll = entry.getKey();
            Student student = entry.getValue();
            System.out.println("Roll: " + roll + ", Name: " + student.name + ", Age: " + student.age);
        }
        /**
         All students:
         Roll: 101, Name: Alice, Age: 20
         Roll: 102, Name: Bob, Age: 22
         */
    }
}
