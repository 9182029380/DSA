package org.example.FlightRouteFinder;

import java.util.*;
import java.util.ArrayList;

public class FlightRouteFinder {
    public List<String> findshortestroute(City start, City destination) {
        if (start == null || destination == null) {
            return Collections.emptyList();
        }
        Queue<City> queue = new LinkedList<>();
        Map<City, City> parent = new HashMap<>();
        queue.offer(start);
        parent.put(start,null);

        while (!queue.isEmpty()) {
            City current = queue.poll();
            if (current.name.equals(destination.name)) {
                return reconstructPath(parent,destination);
            }


            for (City neighbor : current.connections) {
                if (!parent.containsKey(neighbor)) {
                    queue.offer(neighbor);
                    parent.put(neighbor, current);
                }
            }
        }

        return Collections.emptyList();
    }

    private List<String> reconstructPath(Map<City, City> parent, City destination) {
        List<String> path = new ArrayList<>();
        City current = destination;
        while (current != null) {
            path.add(0, current.name);
            current = parent.get(current);
        }
        return path;
    }
}
