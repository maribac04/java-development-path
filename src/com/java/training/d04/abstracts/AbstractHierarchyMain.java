package com.java.training.d04.abstracts;

import com.java.training.d04.annotations.TrainingInfo;

@TrainingInfo(
        sessionName = "Abstracts",
        sessionNumber = 4
)
public class AbstractHierarchyMain {

    public static void main(String[] args) {
        Tablet tablet = new Tablet();
        tablet.setId(4);
        tablet.setModel("Lightweight");
        tablet.setName("The tablet");

        System.out.println(tablet.getName() + ", " + tablet.getModel());

        AbstractProduct product = tablet;
        System.out.println(product.getName());

        varArgsMethod("something");
        varArgsMethod("something", "else");
        varArgsMethod("something", "and", "else");
    }

    @SuppressWarnings("unused")
    public static void unusedMethod() {

    }

    // ... = varargs
    // varargs = variable number of arguments; any class / primitive type can be used
    // main rule - the varargs parameter must be the last parameter of the method
    private static void varArgsMethod(String... values) {
        System.out.println("We have " + values.length + " values");
        System.out.println("The last one is " + values[values.length  - 1]);
    }
}
