import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }
  
    public void displayBooks() {
        System.out.println("\nBooks in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book findBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    public boolean borrowBook(String ISBN) {
        Book book = findBookByISBN(ISBN);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book borrowed: " + book.getTitle());
            return true;
        } else {
            System.out.println("Book is not available or doesn't exist.");
            return false;
        }
    }

    public boolean returnBook(String ISBN) {
        Book book = findBookByISBN(ISBN);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Book returned: " + book.getTitle());
            return true;
        } else {
            System.out.println("Book is not borrowed or doesn't exist.");
            return false;
        }
    }
}

