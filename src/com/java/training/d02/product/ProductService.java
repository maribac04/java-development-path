package com.java.training.d02.product;

// Separation of Concerns
public class ProductService { // data processing class

    // Q: how small / big should the methods be?
    // A: as small as possible
    public void process(Product product) {
        System.out.println("Processing the product " + product.getName() + "...");

        this.doSomething();
        doSomethingElse();
    }

    // Q: should we prefer big and few methods or small and many?
    // A: small and many, each and every time
    public Product createProduct(int id, String name) {
        return new Product(name);
    }

    private void doSomething() {
        System.out.println("Doing something");
    }

    private void doSomethingElse() {
        System.out.println("Doing something else");
    }

    public void display(Product product) {
        System.out.println(product.getName());
    }
}
