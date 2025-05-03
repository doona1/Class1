import java.io.*;

public class FileModifier {

    // Function to read from one file, modify the content, and write to another file
    public static void modifyFile(String inputFile, String outputFile) {
        try {
            // Step 1: Create a reader to read from the input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Step 2: Create a writer to write to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;

            // Step 3: Read each line from the input file
            while ((line = reader.readLine()) != null) {
                // Step 4: Modify the line (for example, convert it to uppercase)
                String modifiedLine = line.toUpperCase();

                // Step 5: Write the modified line to the output file
                writer.write(modifiedLine);

                // Add a new line after writing each line
                writer.newLine();
            }

            // Step 6: Close both the reader and writer
            reader.close();
            writer.close();

            System.out.println("File has been read, modified, and written to: " + outputFile);
        } catch (IOException e) {
            // Handle errors related to file operations
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Input file name (make sure this file exists)
        String inputFile = "input.txt";

        // Output file name (this file will be created or overwritten)
        String outputFile = "output.txt";

        // Call the function to modify the file
        modifyFile(inputFile, outputFile);
    }
}
