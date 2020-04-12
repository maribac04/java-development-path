package com.java.training.d04.generics;

import com.java.training.d03.product.Product;

import java.util.List;

public abstract class AbstractProductProcessor<T extends Product> {

    public abstract void process(T t);

    public abstract List<?> getElements();
}
