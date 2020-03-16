package com.java.training.d01;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DecisionalStatements {

    public static void main(String[] args) {
        ifStatements();

        switchStatements();
    }

    private static void ifStatements() {
        boolean isSpring = true;
        if (isSpring) {
            System.out.println("The sun is coming");
        } else {
            System.out.println("Waiting for the sun...");
        }
    }

    private static void switchStatements() {
        //DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
        String currentDay = "Sunday";
        switch (currentDay) {
            case "Sunday":
                System.out.println("Plan for the week");
                break;
            case "Friday":
                System.out.println("The weekend is coming!");
                break;
            default: // not mandatory, but recommended
                System.out.println("The day is " + currentDay);
                break;
        }
    }
}
