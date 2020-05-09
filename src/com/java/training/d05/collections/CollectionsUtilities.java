package com.java.training.d05.collections;

import com.java.training.d04.collections.Product;

import java.util.*;

public class CollectionsUtilities {

    public static void main(String[] args) {
        List<String> quickList = Arrays.asList("first", "second");

        // singleton = one instance
        final List<String> strings = Collections.singletonList("single object");
        final Set<String> creatingASet = Collections.singleton("creating a Set");
        final Map<Integer, Product> pizza = Collections.singletonMap(10, new Product(10, "Pizza"));
    }
}
