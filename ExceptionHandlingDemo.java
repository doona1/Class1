import java.io.*;
import java.util.Scanner;

public class ExceptionHandlingDemo {

    // Method to handle invalid user input
    public static void handleInvalidInput() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        
        // Loop until valid integer input is received
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter an integer: ");
                number = Integer.parseInt(scanner.nextLine()); // May throw NumberFormatException
                validInput = true; // If input is valid, exit loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        
        System.out.println("You entered the integer: " + number);
    }

    // Method to handle file not found exception
    public static void handleFileNotFound() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name to read: ");
        String fileName = scanner.nextLine();
        
        try {
            // Attempt to open the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("File contents:");
            
            // Read and display file contents line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // Handle the case where the file doesn't exist
            System.out.println("File not found. Please check the file name and try again.");
        } catch (IOException e) {
            // Handle other I/O exceptions
            System.out.println("An error occurred while reading the file.");
        }
    }

    public static void main(String[] args) {
        // Demonstrating exception handling for invalid user input
        handleInvalidInput();

        // Demonstrating exception handling for file not found
        handleFileNotFound();
    }
}
