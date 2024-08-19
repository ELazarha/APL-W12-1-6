import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    // Method to remove a book
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Removed book with ISBN: " + isbn);
    }

    // Method to check out a book
    public void checkOutBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && !book.isCheckedOut()) {
                book.setCheckedOut(true);
                System.out.println("Checked out book: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " is not available for checkout.");
    }

    // Method to return a book
    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isCheckedOut()) {
                book.setCheckedOut(false);
                System.out.println("Returned book: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " was not checked out.");
    }

    // Method to generate a report of the library's collection
    public void generateReport() {
        System.out.println("Library Collection Report:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}