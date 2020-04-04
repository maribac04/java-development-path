package com.java.training.d03.product;

public class LightweightTablet extends Tablet {

    @Override
    public void displayName() {
        System.out.println(id);
        super.displayName();
    }

    // Product
    //    ˆ
}   //    |
    // Tablet
    //    ˆ
    //    |
    // LightweightTablet
