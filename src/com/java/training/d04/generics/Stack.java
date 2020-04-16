package com.java.training.d04.generics;

import java.util.ArrayList;
import java.util.List;

public class Stack<Element> {

    private final List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void displayElementsNumber() {
        System.out.println("There are " + elements.size());
    }
}
