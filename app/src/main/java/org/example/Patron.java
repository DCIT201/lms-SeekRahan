import java.util.ArrayList;
import java.util.List;

public class Patron {
    private final String patronId;
    private final String name;
    private final String email;
    private final String phone;
    private final List<String> borrowedBookIds; // List of borrowed book IDs

    // Constructor
    public Patron(String patronId, String name, String email, String phone) {
        this.patronId = patronId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.borrowedBookIds = new ArrayList<>();
    }

    // Borrow a book
    public void borrowBook(String bookId) {
        borrowedBookIds.add(bookId);
    }


    public void returnBook(String bookId) {
        borrowedBookIds.remove(bookId);
    }


    public List<String> listBorrowedBooks() {
        return borrowedBookIds;
    }

    // Getters and Setters
    public String getPatronId() {
        return patronId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
