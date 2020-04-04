package com.java.training.d03.abs;

public abstract class AbstractProduct {

    public abstract String getProducer();

    public abstract String getName();

    private String producer;

    private String name;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayProductCharacteristics() {
        System.out.println(getProducer());
        System.out.println(getName());

        // anything else needed
    }
}
