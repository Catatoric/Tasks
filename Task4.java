import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove all non-alphabetic characters and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Create a StringBuilder object to reverse the cleaned string
        StringBuilder reversedString = new StringBuilder(cleanedInput);
        reversedString.reverse();

        // Check if the cleaned input is equal to the reversed cleaned input
        if (cleanedInput.equals(reversedString.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}