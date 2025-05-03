public class PassByValueAndReference {

    // Pass-by-Value with Primitive Type (int)
    public static void passByValue(int x) {
        x = 10;  // Changes only the local copy, not the original variable
        System.out.println("Inside passByValue method, x = " + x);
    }

    // Pass-by-Reference with Object (Reference Type)
    public static void passByReference(Student student) {
        student.setName("Alice");  // Changes the original object's data
        student = new Student("Bob");  // Reassigns the reference, no effect on original
        System.out.println("Inside passByReference method, student name = " + student.getName());
    }

    public static void main(String[] args) {
        // Demonstrating Pass-by-Value with primitive type
        int a = 5;
        System.out.println("Before passByValue method, a = " + a);
        passByValue(a);
        System.out.println("After passByValue method, a = " + a);  // a remains unchanged

        // Demonstrating Pass-by-Reference with object
        Student student = new Student("John");
        System.out.println("Before passByReference method, student name = " + student.getName());
        passByReference(student);
        System.out.println("After passByReference method, student name = " + student.getName());  // Name changes to Alice
    }
}

// A simple Student class for demonstration
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
