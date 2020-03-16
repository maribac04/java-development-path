package com.java.training.d02.product;

// an user of the data processing class
// reasoning - Separation of Concerns
public class ProductServiceMain {

    public static void main(String[] args) {
        // 1 - data holding class
        Product product = new Product("Cookie");

        // 2 - data processing class
        ProductService productService = new ProductService();
        productService.process(product);

        Product anotherOne = productService.createProduct(10, "Coffee");
        productService.display(anotherOne);
    }
}
