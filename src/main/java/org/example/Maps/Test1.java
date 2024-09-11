package org.example.Maps;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        // Create a HashMap
        Map<Student, Integer> studentScores = new HashMap<>();

        // Create some Student objects
        Student student1 = new Student("John", 20);
        Student student2 = new Student("Jane", 22);

        // Add entries to the HashMap
        studentScores.put(student1, 90);
        studentScores.put(student2, 85);

        // Retrieve a value from the HashMap
        int score = studentScores.get(student1);
        System.out.println("John's score: " + score);

        // Iterate over the HashMap
        for (HashMap.Entry<Student, Integer> entry : studentScores.entrySet()) {
            Student student = entry.getKey();
            int studentScore = entry.getValue();
            System.out.println(student.getName() + ": " + studentScore);
        }
    }
}

