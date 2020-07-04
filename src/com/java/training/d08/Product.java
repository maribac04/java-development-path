package com.java.training.d08;

// an immutable Product - can be created, cannot be modified
public class Product implements Comparable<Product> {

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

    @Override
    public int compareTo(Product o) {
        //return name.compareTo(o.getName());
        return Integer.compare(id, o.getId());
    }
}
