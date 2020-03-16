package com.java.training.d02.product;

// uses the Product class --> they are in the same package
public class ProductMain {

    public static void main(String[] args) {
        // creating an object from a class
        Product product = new Product("Holiday tickets");

        // calling the setter method
        //product.setName("Healthy lemon");

        // calling the getter method
        System.out.println("The product is '" + product.getName() + "'");

        Product laptop = new Product("A very fast laptop");
        System.out.println(laptop.getName());

        product = laptop;   // assignment
        product = null;     // null assignment

        // a memory zone is allocated, but the 'name' property is not set --> null
        Product nonInitializedName = new Product();
        if (nonInitializedName.getName() != null) {
            System.out.println(nonInitializedName.getName());
        }

        // !! pay extra attention to not initialized objects and their properties
        Product notInitializedReference = null; // no memory is allocated

        // the way to handle them:
        if (notInitializedReference != null) {
            System.out.println(notInitializedReference.getName());
        } else {
            System.err.println("The object is null");
        }

        // static methods are invoked on classes, not on objects
        Product anotherOne = Product.createProduct("Chocolate");
        product.createProduct("something"); // incorrect usage
    }
}
