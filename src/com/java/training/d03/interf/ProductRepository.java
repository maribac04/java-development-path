package com.java.training.d03.interf;

import com.java.training.d03.product.Product;

import java.io.Serializable;

public interface ProductRepository extends Serializable, Cloneable {

    Product getProduct(int id);

    void saveProduct(Product product);

    // Java 8+
    default void processProduct(Product product) {
        System.out.println("Processing the product...");
    }

    // private methods - since Java 10 or 11?
    // private void something() {}
}
