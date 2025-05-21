import java.util.Scanner;

public class Task8 {

    // Method with variable number of integer arguments
    public static int calculateTotalCumulativeSum(int... numbers) {
        int totalSum = 0;

        for (int number : numbers) {
            int cumulativeSum = 0;

            // Calculate sum from 1 to number
            for (int i = 1; i <= number; i++) {
                cumulativeSum += i;
            }

            System.out.println("Cumulative sum of " + number + " is " + cumulativeSum);
            totalSum += cumulativeSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many numbers they want to enter
        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        // Create an array to store the numbers
        int[] inputNumbers = new int[count];

        // Read the numbers from the user
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            inputNumbers[i] = scanner.nextInt();
        }

        // Call the method and display the result
        int total = calculateTotalCumulativeSum(inputNumbers);
        System.out.println("Total Sum: " + total);

        scanner.close();
    }
}
