package org.example;
public class Book {
    private String title;
    private String author;
    private int yearPublished;
    // This is your working class

/**
 * @param yearPublished Add this field
 */
public record Book(String title, String author, int yearPublished) {
    // Constructor
    // Initialize the field
    }
    
}
