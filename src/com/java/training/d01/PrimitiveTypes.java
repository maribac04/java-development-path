package com.java.training.d01;

public class PrimitiveTypes {

    public static void main(String[] args) {
        int today = 1;
        System.out.println("Today is " + today);
        Integer wrapperForInt = today;

        long currentTime = 1420;
        System.out.println("Current time is " + currentTime);

        char monthPrefix = 'm';
        System.out.println("Current month starts with " + monthPrefix);

        // examples for using wrapper classes
        System.out.println("The max value is " + Integer.MAX_VALUE);
        Integer parsed = Integer.parseInt("23");
    }
}
