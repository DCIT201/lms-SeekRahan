package org.example;
public class Book {
    private String title;
    private String author;
    private int yearPublished;
    // This is your working class

    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    public int getYearPublished(){
        reutrn yearPublished;
    }
    

/**
 * @param yearPublished Add this field
 */
public record Book(String title, String author, int yearPublished) {
    // Constructor
    // Initialize the field
    }
    
}
