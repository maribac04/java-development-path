package com.java.training.d04.collections;

import java.util.*;

public class ListMain {

    public static void main(String[] args) {
        //arrayList();

        linkedList();
    }

    private static void linkedList() {
        List<String> strings = new LinkedList<>();
        strings.add("first");
        strings.add("third");
        strings.add("second");
        Collections.sort(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static void comparatorExample() {
        List<Product> products = new ArrayList<>(2);
        products.add(new Product(3, "Phone"));
        products.add(new Product(2, "Monitor"));

        Collections.sort(products, new ProductComparator());
    }

    private static void arrayList() {
        List<String> strings = new ArrayList<>(10);
        strings.add("something");
        strings.addAll(Arrays.asList("first", "second"));
        strings.add("something");

        System.out.println("There are " + strings.size() + " elements");
        for (String string : strings) {
            System.out.println(string);
        }

        final String removed = strings.remove(2);
        System.out.println(removed);

        final boolean wasRemoved = strings.remove("first_x");
        System.out.println(wasRemoved);
    }

    private static class ProductComparator implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            return o1.compareTo(o2);
        }
    }
}
