package com.java.training.d02.book; // package names --> always lower case

// the new / hipster way to structure data
public class ImmutableBook { // data holding class

    private final int id;

    private final String name;

    private final String author;

    private final int year;

    private final double price;

    // initialize the values
    public ImmutableBook(int id, final String name, String author, int year, double price) {
        // each time when we write 'x = something' --> we do an initialization
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // utility method
    public void displayBookProperties() { // camelCase naming
        System.out.println(id + ", " + name + ", " + author + ", " + price);
    }
    // incorrect names: DisplayBookProperties, displaybookproperties
}
