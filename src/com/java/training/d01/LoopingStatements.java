package com.java.training.d01;

public class LoopingStatements {

    public static void main(String[] args) {
        //whileStatements();

        //doWhileStatements();

        forStatements();
    }

    private static void forStatements() {
        //indexBasedFor();

        itemBasedFor();
    }

    private static void itemBasedFor() {
        String[] words =
            "Java is a friendly language".split(" ");
        for (String word : words) { //for-each
            System.out.println(word);
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    private static void indexBasedFor() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }

    private static void doWhileStatements() {
        int availableHolidayDays = 30;
        do {
            //System.out.println("I still have " + availableHolidayDays);
            if (availableHolidayDays > 0) {
                System.out.println("Let there be holiday :)");
            } else {
                System.out.println("Going to work...");
            }
            availableHolidayDays = availableHolidayDays - 5;
        } while (availableHolidayDays >= 0);
    }

    private static void whileStatements() {
        int shoppingMoney = 50;
        while (shoppingMoney > 0) {
            System.out.println("Buying things...");
            shoppingMoney = shoppingMoney - 10;
        }
    }
}
