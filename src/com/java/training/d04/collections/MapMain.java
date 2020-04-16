package com.java.training.d04.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {

    public static void main(String[] args) {
        hashMap();
    }

    private static void hashMap() {
        Map<String, Product> stringProductMap = new HashMap<>();
        stringProductMap.put("first", new Product(10, "Phone"));
        stringProductMap.put("second", new Product(20, "Tablet"));

        // 1. getting the keys, then the values
        final Set<String> keySet = stringProductMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " - " + stringProductMap.get(key));
        }

        // 2. getting the entries, iterating over them
        final Set<Map.Entry<String, Product>> entries = stringProductMap.entrySet();
        for (Map.Entry<String, Product> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // 3. getting the values
        final Collection<Product> values = stringProductMap.values();
        for (Product value : values) {
            System.out.println(value);
        }

        final Product first = stringProductMap.remove("first");
        System.out.println("We removed " + first);

        final Product second = stringProductMap.get("second");
    }
}
