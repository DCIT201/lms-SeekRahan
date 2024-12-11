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





    
