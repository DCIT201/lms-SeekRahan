package org.example;

import java.util.ArrayList;

public class Patron {
    private final String name;
    private final ArrayList<Book> borrowedBooks;

    public Patron(String name, int id) {
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }
    

    public void borrowBook(Book book) {
        if (library.removeBook(book.getTitle())) {
            borrowedBooks.add(book);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book not available.");
        }
    }

    
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            library.addBook(book);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println("You don't have this book.");
        }
    }
    

    public void listBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println(book.getTitle());
            }
        }
    }
}
