import java.util.Scanner;

public class GradeOnlyIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        }

        if (marks >= 80 && marks < 90) {
            System.out.println("Grade: B");
        }

        if (marks >= 70 && marks < 80) {
            System.out.println("Grade: C");
        }

        if (marks >= 60 && marks < 70) {
            System.out.println("Grade: D");
        }

        if (marks < 60 && marks >= 0) {
            System.out.println("Grade: F");
        }

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered.");
        }

        scanner.close();
    }
}
