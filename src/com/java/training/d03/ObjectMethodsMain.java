package com.java.training.d03;

import com.java.training.d03.product.Product;
import com.java.training.d03.product.Tablet;

public class ObjectMethodsMain {

    public static void main(String[] args) {
        Product product = new Product();
        product.setId(10);
        product.setName("Ice-cream");

        Tablet tablet = new Tablet();
        tablet.setId(10);
        tablet.setName("The light one, with a big screen");

        //toString(product, tablet);
        //equals(product);
        hashCode(product, tablet);
    }

    private static void hashCode(Product product, Tablet tablet) {
        System.out.println(product.hashCode());
        System.out.println(tablet.hashCode());
    }

    private static void equals(Product product) {
        Product another = new Product();
        another.setId(10);
        another.setName("Lemonade");

        System.out.println(product.equals(another));
    }

    private static void toString(Product product, Tablet tablet) {
        System.out.println(product);
        System.out.println(tablet.toString());
    }
}
