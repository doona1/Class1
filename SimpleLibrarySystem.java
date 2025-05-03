import java.util.Scanner;

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
    Book[] books = new Book[5];  // fixed size for simplicity
    int count = 0; // track number of books

    // Add book to library
    void addBook(int id, String title, String author) {
        if (count < books.length) {
            books[count] = new Book(id, title, author);
            count++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full.");
        }
    }

    // Display all books
    void showBooks() {
        System.out.println("\n--- Book List ---");
        for (int i = 0; i < count; i++) {
            books[i].displayBook();
        }
    }

    // Borrow a book
    void borrowBook(int bookId) {
        for (int i = 0; i < count; i++) {
            if (books[i].id == bookId) {
                if (books[i].isAvailable) {
                    books[i].isAvailable = false;
                    System.out.println("You borrowed: " + books[i].title);
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
        for (int i = 0; i < count; i++) {
            if (books[i].id == bookId) {
                if (!books[i].isAvailable) {
                    books[i].isAvailable = true;
                    System.out.println("Thank you for returning: " + books[i].title);
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
public class SimpleLibrarySystem {
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
