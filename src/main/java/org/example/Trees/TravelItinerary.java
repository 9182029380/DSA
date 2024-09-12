package org.example.Trees;

public class TravelItinerary {
    public void  printItinerary(Destination node) {
        if(node==null)
            return;

        printItinerary(node.left);
        System.out.println("destination-----"+ node.name);
        printItinerary(node.right);


    }

    public int calculateheight(Destination node) {
        if(node==null)
            return -1;
        int leftHeight = calculateheight(node.left);
        int rightHeight = calculateheight(node.right);
        return Math.max(leftHeight, rightHeight)+1;
    }
}
