package org.example.Trees;



public class Test {
    public static void main(String[] args) {
        Destination root = new Destination("New York");
        root.left = new Destination("Chicago");
        root.right = new Destination("Los Angeles");
        root.left.left = new Destination("San Francisco");
        root.left.right = new Destination("Seattle");
        root.right.left = new Destination("San Diego");
        root.right.right = new Destination("Portland");
        TravelItinerary itinerary = new TravelItinerary();
        System.out.println("Pre-order traversal:");
        itinerary.printItinerary(root);

        int height = itinerary.calculateheight(root);
        System.out.println("Height of the tree: " + height);

    }

}
