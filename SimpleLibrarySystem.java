import java.util.Scanner;
import java.util.ArrayList;

// Book class with basic attributes
class Book {
    int id;
    String title;
    String author;
    boolean isAvailable;

    // Constructor
    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;  // Book is available by default
    }

    // Method to display book details
    void displayBook() {
        System.out.println(id + ". " + title + " by " + author + " - " + (isAvailable ? "Available" : "Not Available"));
    }
}

// Library class to manage books
class Library {
    ArrayList<Book> books = new ArrayList<>();  // Use ArrayList instead of array

    // Add book to library
    void addBook(int id, String title, String author) {
        books.add(new Book(id, title, author));  // Add book to list
        System.out.println("Book added successfully!");
    }

    // Display all books
    void showBooks() {
        System.out.println("\n--- Book List ---");
        for (Book book : books) {
            book.displayBook();
        }
    }

    // Borrow a book
    void borrowBook(int bookId) {
        for (Book book : books) {
            if (book.id == bookId) {
                if (book.isAvailable) {
                    book.isAvailable = false;
                    System.out.println("You borrowed: " + book.title);
                } else {
                    System.out.println("Sorry, book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Return a book
    void returnBook(int bookId) {
        for (Book book : books) {
            if (book.id == bookId) {
                if (!book.isAvailable) {
                    book.isAvailable = true;
                    System.out.println("Thank you for returning: " + book.title);
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        // Add some default books
        lib.addBook(1, "Harry Potter", "J.K. Rowling");
        lib.addBook(2, "Java Basics", "James Gosling");
        lib.addBook(3, "The Alchemist", "Paulo Coelho");

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lib.showBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowId = sc.nextInt();
                    lib.borrowBook(borrowId);
                    break;
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    lib.returnBook(returnId);
                    break;
                case 4:
                    System.out.println("Thanks for using the library!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
