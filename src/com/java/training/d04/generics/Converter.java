package com.java.training.d04.generics;

import com.java.training.d03.product.Product;
import com.java.training.d03.product.Tablet;

public class Converter<Input, Output> {

    public void convert(Input input, Output output) {
        System.out.println("Converting a " + input.getClass().getSimpleName() + " into a " + output.getClass().getSimpleName());
    }

    @SuppressWarnings("unchecked")
    public static <Type extends Product> Type createProduct(String name) {
        return (Type) new Tablet();
    }
}
