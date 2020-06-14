package com.java.training.d08.strings;

// an immutable Product - can be created, cannot be modified
public class Product {

    private final int id;
    private final String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        /*
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
        */

        return id + ", " + name;
    }
}
