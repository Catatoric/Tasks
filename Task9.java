import static java.lang.Math.*; // Static import for Math methods
import java.util.Scanner; // Import Scanner for user input

public class Task9 {

    // Method for addition
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Method for subtraction
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Method for multiplication
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Method for division
    public static String divide(int a, int b) {
        if (a < b) {
            // Return decimal division if a is smaller than b
            double result = (double) a / b;
            return String.format("%.2f", result); // format to 2 decimal places
        } else {
            // Return integer division using floorDiv
            return Integer.toString(floorDiv(a, b));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt(); // Read first number

        int num2;
        while (true) {
            System.out.print("Enter the second number (not zero): ");
            num2 = scanner.nextInt(); // Read second number

            if (num2 != 0) {
                break; // Exit loop if valid
            } else {
                System.out.println("Error: Division by zero is not allowed. Please try again.");
            }
        }

        // Perform operations
        int sum = add(num1, num2);
        int difference = subtract(num1, num2);
        int product = multiply(num1, num2);
        String quotient = divide(num1, num2); // Use String to handle both int and decimal results

        // Display results
        System.out.println("\nResults:");
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);

        scanner.close(); // Close the scanner
    }
}
