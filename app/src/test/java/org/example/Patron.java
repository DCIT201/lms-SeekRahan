import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String patronId;
    private List<Book> borrowedBooks;

    // Constructor
    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters
    public String getName() { return name; }
    public String getPatronId() { return patronId; }

    // Borrow a book
    public void borrowBook(Library library, String ISBN) {
        if (library.borrowBook(ISBN)) {
            Book book = library.findBookByISBN(ISBN);
            if (book != null) {
                borrowedBooks.add(book);
                System.out.println(name + " borrowed " + book.getTitle());
            }
        }
    }

    // Return a book
    public void returnBook(Library library, String ISBN) {
        Book book = library.findBookByISBN(ISBN);
        if (book != null && borrowedBooks.contains(book)) {
            library.returnBook(ISBN);
            borrowedBooks.remove(book);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println(name + " does not have this book borrowed.");
        }
    }

    // Display borrowed books
    public void displayBorrowedBooks() {
        System.out.println("\n" + name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}

