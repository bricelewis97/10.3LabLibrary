package com.tts;

public class Book {


    String title;
    boolean borrowed;

    public Book(String title) {

    }

    // Creates a new Book
    public Book(String title,boolean borrowed) {
        // Implement this method
       this.title = title;
       this.borrowed = borrowed;

    }

    public Book() {

    }

    public String toString() {
        return "Book{title='" +
                this.title + "', borrowed=" +
                this.borrowed + "}";
    }




    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }

    // Marks the book as rented
    public void borrowed() {
        // Implement this method
        this.borrowed = true;
    }

    // Marks the book as not rented
    public void returned() {
        // Implement this method
        this.borrowed = false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
        return this.borrowed;
    }

    // Returns the title of the book
    public String getTitle() {
        // Implement this method
        return this.title;
    }
}