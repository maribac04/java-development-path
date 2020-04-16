package com.java.training.d04.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

    public static void main(String[] args) {
        //hashSet();

        //productsHashSet();

        //linkedHashSet();

        treeSet();
    }

    private static void treeSet() {
        Set<Product> products = new TreeSet<>();
        products.add(new Product(3, "Keyboard"));
        products.add(new Product(2, "Phone"));

        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void linkedHashSet() {
        Set<Product> products = new LinkedHashSet<>();
        products.add(new Product(1, "Phone"));
        products.add(new Product(2, "Phone"));
        products.add(new Product(3, "Keyboard"));

        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void productsHashSet() {
        Set<Product> products = new HashSet<>();
        products.add(new Product(1, "Phone"));
        products.add(new Product(2, "Phone"));
        products.add(new Product(3, "Keyboard"));

        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void hashSet() {
        Set<String> strings = new HashSet<>();
        strings.add("something");
        strings.add("something");
        strings.add("else");
        strings.add(null);

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
