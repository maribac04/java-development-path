package com.java.training.d02.book;

public class BookMain { // data processing class

    public static void main(String[] args) {
        Book book = new Book();
        book.setId(20);
        book.setName("50 leagues under sea");
        book.setAuthor("Jules Verne");
        book.setPrice(20);
        book.setYear(1970);

        System.out.println(book.getId() + ", " + book.getName() + ", " + book.getAuthor());

        book.setAuthor("Bogdan");

        // prefer immutable classes as much as possible
        // reasons:
        //  20-30% - setting all the properties
        //  70-80% - disabling the possibility to change them
        // prefer creating new objects, instead of adding setters
        ImmutableBook immutableBook = new ImmutableBook(10, "Inferno", "Dan Brown",
                2000, 10);
        System.out.println(immutableBook.getAuthor());

        // if we need to create a new object with some of the properties of an existing object
        ImmutableBook theOtherObject = new ImmutableBook(immutableBook.getId(), immutableBook.getName(),
                "The new author", immutableBook.getYear(), immutableBook.getPrice());
        theOtherObject.displayBookProperties();
    }
}
