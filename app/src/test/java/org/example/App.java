public class App { 
    package org.example;
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
   
       
        Library library = new Library();

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "ISBN001");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN002");
        Book book3 = new Book("1984", "George Orwell", "ISBN003");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
      
        library.displayBooks();

        Patron patron = new Patron("Alice", "P001");

       
        patron.borrowBook(library, "ISBN001");
        patron.displayBorrowedBooks();
        patron.returnBook(library, "ISBN001");
      
        library.displayBooks();
    }
}

