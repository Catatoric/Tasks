// File name: task10.java
import java.util.Scanner;

class Student {
    // Instance variables
    private String firstName;
    private String lastName;

    // Constructor to initialize student name
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to print the full name
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }
}

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many students they want to enter
        System.out.print("How many students? ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        // Create an array to store the students
        Student[] students = new Student[numberOfStudents];

        // Get the names from the user
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student #" + (i + 1));

            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            // Create a new Student and add it to the array
            students[i] = new Student(firstName, lastName);
        }

        // Print full names of all students
        System.out.println("\nFull names of students:");
        for (Student s : students) {
            s.printFullName();
        }

        scanner.close(); // Close the scanner
    }
}
