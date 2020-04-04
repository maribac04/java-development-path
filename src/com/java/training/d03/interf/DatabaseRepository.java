package com.java.training.d03.interf;

import com.java.training.d03.product.Product;

public class DatabaseRepository implements ProductRepository {
    @Override
    public Product getProduct(int id) {
        System.out.println("Getting the product from the database...");
        return new Product();
    }

    @Override
    public void saveProduct(Product product) {

    }
}
