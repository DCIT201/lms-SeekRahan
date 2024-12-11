
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        
        Library library = new Library();
        Patron patron1 = new Patron("Alice", 123);
        Patron patron2 = new Patron("Bob", 456);

        library.addBook(new Book("ISBN123", "The Lord of the Rings", "J.R.R. Tolkien"));
        library.addBook(new Book("ISBN456", "Harry Potter", "J.K. Rowling"));

        patron1.borrowBook(library, "ISBN123");

        patron2.borrowBook(library, "ISBN123"); 

        patron1.returnBook(library, "ISBN123");
    }
}
    
