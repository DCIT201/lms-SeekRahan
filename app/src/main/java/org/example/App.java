
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());


        Library library = new Library();
        Patron patron1 = new Patron("Alice", "123","alic@hi.com","02038489");
        Patron patron2 = new Patron("Bob", "456","bob@hrt.com","0283449");

        library.addBook(new Book("ISBN123", "The Lord of the Rings", "J.R.R. Tolkien"));
        library.addBook(new Book("ISBN456", "Harry Potter", "J.K. Rowling"));

        patron1.borrowBook("ISBN123");

        patron2.borrowBook("ISBN123");

        patron1.returnBook( "ISBN123");
    }
}
    
