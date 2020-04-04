package com.java.training.d03;

import com.java.training.d03.product.Product;
import com.java.training.d03.product.Tablet;

import java.util.ArrayList;
import java.util.List;

public class InheritanceMain {

    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Holiday tickets");

        Tablet tablet = new Tablet();
        tablet.setName("Useful tablet");

        // polymorphic invocation - the invoked method is determined by the object type
        product.displayName();
        tablet.displayName();

        //Product upCasted = (Product) tablet;  // up-casting
        //Tablet downCasted = (Tablet) product; // down-casting

        System.out.println(tablet instanceof Product);
        System.out.println(product instanceof Tablet);

        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(tablet);

        for (Product item : products) {
            if (item instanceof Tablet) {
                Tablet theTablet = (Tablet) item;
                theTablet.displayName(" - ");
            }
        }
    }
}
