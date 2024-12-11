public class Library {
    private ArrayList<Book> books;

    
    public Library() {
        books = new ArrayList<>();
    }

   
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String bookId) {
        books.remove(bookId);
        
    }

}
