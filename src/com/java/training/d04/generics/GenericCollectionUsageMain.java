package com.java.training.d04.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericCollectionUsageMain {

    public static void main(String[] args) {
        rawCollectionUsage();

        correctGenericsUsage();
    }

    private static void correctGenericsUsage() {
        List<String> strings = new ArrayList<>(); // we limited the types of objects that we can add in it
        strings.add("something");
        //strings.add(true); --> trying to add a different type of object - compile error
    }

    // if the collection type is not defined, it automatically uses the Object type
    // --> we can add any type of object in it
    private static void rawCollectionUsage() {
        List list = new ArrayList();
        list.add("string");
        list.add(5);
        list.add(true);
    }
}
