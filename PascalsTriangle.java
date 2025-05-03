// Function to print Pascal's Triangle
public class PascalsTriangle {
    public static void printPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int num = 1;  // First element in the row
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);  // Binomial coefficient
            }
            System.out.println();  // Newline after each row
        }
    }

    public static void main(String[] args) {
        printPascalTriangle(5);
    }
}
