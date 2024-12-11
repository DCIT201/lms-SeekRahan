public class Book {
     private String bookId;
     private String title;
     private String genre;
     private String author;
     private boolean status;
   

    // Constructor
    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.status = true;
    }

    // Getters and Setters (Encapsulation)
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}



public class Patron {
    private String name;
    private int id;

    // Constructor
    public Patron(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Methods to borrow and return books
    public void borrowBook(Library library, String isbn) {
        // Implement logic to borrow a book from the library
    }

    public void returnBook(Library library, String isbn) {
        // Implement logic to return a book to the library
    }
}

    }
