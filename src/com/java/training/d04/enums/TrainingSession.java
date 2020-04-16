package com.java.training.d04.enums;

public enum TrainingSession {
    FIRST("First session") {
        @Override
        public void displayValue() {
            System.out.println(getValue());
        }
    },
    SECOND("The second one") {
        @Override
        public void displayValue() {}
    },
    THIRD("The third", 3) {
        @Override
        public void displayValue() {}
    };

    private final String name;
    private final int value;

    TrainingSession(String name, int value) {
        this.name = name;
        this.value = value;
    }

    TrainingSession(String name) {
        this.name = name;
        this.value = 0;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public abstract void displayValue();
}
