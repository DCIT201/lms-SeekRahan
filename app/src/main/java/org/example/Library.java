package org.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    

    public Library() {
        books = new ArrayList<>();
    }

    
    public void addBook(Book book) {
        books.add(book);
    }
    

    public boolean removeBook(String title) {
        return books.removeIf(book -> book.getTitle().equals(title));
    }

    
    public void listBooks() {
        
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {for (Book book : books) {
                System.out.println(book.getTitle());
        }     
    }
}
