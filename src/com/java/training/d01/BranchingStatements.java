package com.java.training.d01;

public class BranchingStatements {

    public static void main(String[] args) {
        //breakStatement();

        continueStatement();
    }

    private static void continueStatement() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i < 7) continue; // --> skip this iteration

            sum = sum + i;
            System.out.println(i);
        }

        System.out.println(sum);
    }

    private static void breakStatement() {
        for (int i = 0; i < 10; i++) {
            if (i < 7) {
                System.out.println(i);
            } else break;
        }
    }
}
