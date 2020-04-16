package com.java.training.d04.enums;

import java.time.LocalDate;

public class EnumsMain {

    public static void main(String[] args) {
        TrainingSession trainingSession = TrainingSession.SECOND;
        TrainingSession anotherOne = TrainingSession.valueOf("FIRST");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfWeek());
    }
}
