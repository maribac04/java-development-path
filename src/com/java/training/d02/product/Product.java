// packages = way to structure the code (classes)
// all the projects have multiple packages
package com.java.training.d02.product;

// public = can be used from any package
public final class Product { // data holding class

    // 'static' = belongs to all the instances of that class
    private static final String DEFAULT_NAME; // static + final = defining a constant
                                                // blank final

    static {
        // displaying messages
        System.out.println("Displayed just for the first instance");

        // initializing values
        DEFAULT_NAME = "product";
    }

    // field / property / câmp
    private String name;

    // default constructor (default = no parameters) - it exists even if it's not explicitly written
    // reasons to include it:
    //  - 1: add functionality in it
    //  - 2: restrict access (instantiation)
    // usually it is not needed / used
    public Product() {
        System.out.println("Default constructor");
    }

    // the 2nd constructor, with a parameter
    public Product(String theName) {
        name = theName;
    }

    public Product(String name, boolean isHealthy) {
        //this.name = name;
        this(name);
        System.out.println("The product is healthy - " + isHealthy);
    }

    // getter
    public final String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        createProduct(name); // we can invoke static methods from non-static methods
        this.name = name;
    }

    public static Product createProduct(String name) {
        //setName(name);      // cannot invoke non-static methods from static methods
        //this.name = name;   // cannot access non-static fields from static methods
        return new Product(name);
    }
}
