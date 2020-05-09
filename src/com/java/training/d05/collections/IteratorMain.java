package com.java.training.d05.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("the first");
        strings.add("the last");
        strings.add("the other one");

        final Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String nextValue = iterator.next();
            System.out.println("\tNext is: " + nextValue);
            if (nextValue.length() > 8) {
                iterator.remove();
            }
        }

        System.out.println("The list has now " + strings.size() + " elements");
    }
}
