package org.example.FlightRouteFinder;

import java.util.ArrayList;
import java.util.List;

public class City {
    public String name;
    public List<City> connections;

    public City(String name) {
        this.name = name;
        this.connections = new ArrayList<City>();
    }
    public void addConnection(City city){
        this.connections.add(city);
    }
}
