package org.example.MensWear;

public class Test {
    public static void main(String[] args) {
        MensWareSaleSystem system = new MensWareSaleSystem();

        Customer customer1 = new Customer("John Doe", "john@example.com", "123 Main St", "555-1234");
        Customer customer2 = new Customer("Jane Smith", "jane@example.com", "456 Oak Ave", "555-5678");
        Customer customer3 = new Customer("Bob Johnson", "bob@example.com", "789 Elm St", "555-9012");


        system.addSale(customer1, new Sale("T-Shirt", 1, 2000.00,"Online"));
        system.addSale(customer1, new Sale("Jeans", 1, 3000.00, "Online"));
        system.addSale(customer2, new Sale("Jeans", 1, 3000.00, "Offline"));
        system.addSale(customer3, new Sale("Socks", 1, 1000.00, "Online"));
        system.addSale(customer3, new Sale("Jeans1", 1, 1000.00, "Offline"));
        system.addSale(customer3, new Sale("Jeans1", 1, 5000.00, "Offline"));
        system.addSale(customer3, new Sale("VIP Socks", 1, 5000.00, "Offline"));
        system.addSale(customer3, new Sale("T-Shirt", 1, 2000.00, "Online"));
        system.addSale(customer3, new Sale("Jeans", 1, 3000.00, "Online"));


        system.generateInvoice(customer3);
        System.out.println("--------------online ---------------------");
        system.processonlineOrder();
        System.out.println("--------------offline ---------------------");
        system.processOfflineOrder();








    }
}
