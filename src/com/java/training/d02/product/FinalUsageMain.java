package com.java.training.d02.product;

public class FinalUsageMain {

    public static void main(String[] args) {
        Product cookie = new Product("Cookie");         // allocate memory zone A
        final Product coffee = new Product("Coffee");   // allocate memory zone B

        //coffee = cookie; // cannot re-assign a final object --> changing the memory reference
        cookie = coffee;    // changing the object reference

        // = assignment
        // == verification

        coffee.setName("Very good coffee"); // can change the properties of a final object
    }
}
