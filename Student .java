public class Student {

    // Private attributes
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor to initialize the attributes
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter and Setter for marks
    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks. Marks should be between 0 and 100.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student = new Student("John Doe", 101, 85.5);

        // Displaying student details
        student.displayDetails();

        // Using setters to modify student attributes
        student.setName("Jane Smith");
        student.setRollNumber(102);
        student.setMarks(90.0);

        // Displaying modified student details
        System.out.println("\nUpdated Student Details:");
        student.displayDetails();
    }
}
