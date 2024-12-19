package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("A teacher's salary", "Joe Grey", 2024));
        library.addBook(new Book("Data Structures", "Jack math", 1949));

        // List all books
        System.out.println("Books in the library:");
        library.listBooks();

        // Create a patron
        Patron patron = new Patron("Ali", 1);

        // Borrow a book
        patron.borrowBook(new Book("A teacher's salary", "Joe Grey", 2024));

        // List borrowed books
        System.out.println("\nBorrowed books:");
        patron.listBorrowedBooks();

        // Return a book
        patron.returnBook(new Book("A teacher's salary", "Joe Grey", 2024));

        // Final library state
        System.out.println("\nBooks in the library after operations:");
        library.listBooks();
    }
}
