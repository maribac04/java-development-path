package com.java.training.d03.interf;

import com.java.training.d03.product.Product;

import java.io.Serializable;

public class DiskRepository extends AbstractRepository implements ProductRepository, Serializable {
    @Override
    public Product getProduct(int id) {
        System.out.println("Getting the product from the disk...");
        return new Product();
    }

    @Override
    public void saveProduct(Product product) {

    }
}
