package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BankingQueue {
    public static void main(String[] args) {
        /*
         * Create a banking queue system where customers can join the queue
         * and the queue manager can process the customers based on their priority.
         * The queue should support enqueue and dequeue operations.
         */
        Queue<Customer> bankingQueue = new LinkedList<>();

        bankingQueue.add(new Customer("John", 25,1001));
        bankingQueue.add(new Customer("Jane", 30, 1002));
        bankingQueue.add(new Customer("Bob", 35, 1003));
        bankingQueue.add(new Customer("Alice", 40, 1004));
        bankingQueue.add(new Customer("Mike", 45, 1005));
        bankingQueue.add(new Customer("Emily", 50, 1006));
        bankingQueue.add(new Customer("David", 55, 1007));

        while (!bankingQueue.isEmpty()) {
            Customer currentCustomer = bankingQueue.poll();
            System.out.println("Processing customer: " + currentCustomer.getName() + " with priority " );


        }

    }
}
