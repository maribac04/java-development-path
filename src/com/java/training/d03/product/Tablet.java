package com.java.training.d03.product;

public class Tablet extends Product {

    @Override
    public void displayName() {
        System.out.println(id);
        // super. --> a call to a method from the parent class
        //super.displayName();

        System.out.println("The tablet name is " + getName());
    }

    // overloading is not affected by final
    public void displayName(String suffix) {
        System.out.println(getName() + " - " + suffix);
    }
}
