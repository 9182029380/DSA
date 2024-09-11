package org.example.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class EmergencyRoom {
    public static void main(String[] args) {
        Deque<Patient> patientQueue = new ArrayDeque<>();

        patientQueue.addLast(new Patient("Jane",  "Broken Arm"));
        patientQueue.addLast(new Patient("John", "Fever"));
        patientQueue.addLast(new Patient("Bob", "Headache"));
        patientQueue.addLast(new Patient("Alice", "Cough"));
        patientQueue.addLast(new Patient("Mike", "Diabetes"));
        patientQueue.addLast(new Patient("Emily", "Allergic Reaction"));
        patientQueue.addFirst(new Patient("David", "Heart Attack"));

        System.out.println("Patients in the queue:");
        while (!patientQueue.isEmpty()) {
            Patient currentPatient = patientQueue.pollFirst();
            System.out.println("Name: " + currentPatient.getName()  + ", Condition: " + currentPatient.getCondition());
        }
    }
}
