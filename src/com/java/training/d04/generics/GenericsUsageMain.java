package com.java.training.d04.generics;

import com.java.training.d03.product.Tablet;

import java.util.List;

public class GenericsUsageMain {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Stack<Integer> integers = new Stack<>();

        Converter<String, Integer> converter = new Converter<String, Integer>();
        converter.convert("20", 5);

        TabletProcessor processor = new TabletProcessor();
        processor.process(new Tablet());
        final List<?> elements = processor.getElements();
    }
}
