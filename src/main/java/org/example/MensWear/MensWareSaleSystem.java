package org.example.MensWear;

import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class MensWareSaleSystem {
    List<Sale> saleslist = new ArrayList<>();
    Map<Customer,List<Sale>> customerSalesMap = new HashMap<>();

    Queue<Sale> onlineorders = new LinkedList<>();

    Deque<Sale> offlineOrderDeque = new ArrayDeque<>();

    public void addSale( Customer customer, Sale sale){
        saleslist.add(sale);

        customerSalesMap.computeIfAbsent(customer, k -> new ArrayList<>()).add(sale);
        if (sale.saleType.equalsIgnoreCase("online")) {
            onlineorders.add(sale);
        }else if(sale.saleType.equalsIgnoreCase("offline")){
            if (sale.itemname.contains("VIP")) {
                offlineOrderDeque.addFirst(sale);
            }else {
                offlineOrderDeque.addLast(sale);
            }
        }
    }
    public void processonlineOrder(){
        while (!onlineorders.isEmpty()){
            Sale sale = onlineorders.poll();
            System.out.println("Processing online order: " + sale);
        }

    }
    public void processOfflineOrder(){
        while (!offlineOrderDeque.isEmpty()){
            Sale sale = offlineOrderDeque.poll();
            System.out.println("Processing offline order: " + sale);
        }
    }

    public void generateInvoice(Customer customer){
        List<Sale> customerSales = customerSalesMap.get(customer);
        if (customerSales != null){
            double totalAmount = 0.0;
            System.out.println("Invoice for customer: " + customer.name);
            for (Sale sale : customerSales){
                System.out.println(sale);
                totalAmount += sale.price;
            }
            System.out.println("Total Amount: " + totalAmount);
        }else {
            System.out.println("No sales found for customer: " + customer.name);
        }
    }




}
