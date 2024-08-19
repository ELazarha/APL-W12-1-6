import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. Check out book");
            System.out.println("4. Return book");
            System.out.println("5. Generate report");
            System.out.println("6. Display books");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    Book book = new Book();
                    book.setTitle(title);
                    book.setAuthor(author);
                    book.setIsbn(isbn);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.print("Enter ISBN: ");
                    isbn = scanner.nextLine();
                    library.removeBook(isbn);
                    break;
                case 3:
                    System.out.print("Enter ISBN: ");
                    isbn = scanner.nextLine();
                    library.checkOutBook(isbn);
                    break;
                case 4:
                    System.out.print("Enter ISBN: ");
                    isbn = scanner.nextLine();
                    library.returnBook(isbn);
                    break;
                case 5:
                    library.generateReport();
                    break;
                case 6:
                    library.displayBooks();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}