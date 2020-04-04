package com.java.training.d03.interf;

public class InterfacesMain {

    public static void main(String[] args) {
        ProductRepository repository = new DiskRepository();
        System.out.println(repository.getProduct(5));
    }
}
