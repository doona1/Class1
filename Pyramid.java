// Function to print pyramid pattern
public class Pyramid {
    public static void printPyramid(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();  // Newline after each row
        }
    }

    public static void main(String[] args) {
        printPyramid(5);
    }
}
