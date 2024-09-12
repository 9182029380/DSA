package org.example.FlightRouteFinder;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        City city = new City("mumbai");
        City city1 = new City("delhi");
        City city2 = new City("chennai");
        City city3 = new City("kolkata");
        City city4 = new City("bangalore");
        City city5 = new City("hyderabad");
        City city6 = new City("pune");
        City city7 = new City("ahmedabad");

        city.addConnection(city1);
        city.addConnection(city2);
        city.addConnection(city3);
        city1.addConnection(city4);
        city2.addConnection(city5);
        city3.addConnection(city6);
        city4.addConnection(city7);
        city2.addConnection(city7);


        FlightRouteFinder routeFinder = new FlightRouteFinder();
        List<String> shortestroute = routeFinder.findshortestroute(city, city6);
        if (shortestroute.isEmpty()) {
            System.out.println("no route found");
        } else {
            System.out.println("shortest route is " + String.join("->", shortestroute));
        }
    }
}
