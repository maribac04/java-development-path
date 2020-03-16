package com.java.training.d01;

public class ArithmeticOperators {

    public static void main(String[] args) {
        // additive
        int sum = 20 + 30;
        String concatenated = "Today" + " and tomorrow";

        // subtract
        int difference = 30 - 20;

        // divide
        double value = 80 / 2.5;

        // multiply
        int numberOfCats = 5 * 2;

        // remainder / modulo
        boolean isEven = 30 % 2 == 0;
        System.out.println(isEven);

        boolean isOdd = !isEven;

        boolean isFirstOfMarch = true;
        boolean isSpring = isFirstOfMarch ? true : false;
        // ternary operator

        String season = isFirstOfMarch ? "spring" : "winter";

        boolean isWarmOutside = isFirstOfMarch || isSpring;
        boolean andCondition = isSpring && isFirstOfMarch;
    }
}
