package org.example.Maps;

import java.util.HashMap;
import java.util.Map;

public class Examplemap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put(null, 1);
        map.put("A", 2);
        map.put("C", 8);
        map.put("D", 8);
        map.put("E", 5);
        map.put(null, 6);
        System.out.println(map);
    }
}
