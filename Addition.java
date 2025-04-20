import java.util.Scanner;

/**
 * A class that provides functionality to perform addition of two numbers
 * entered by the user through the console.
 */
public class Addition {

    /**
     * Reads two double values from the user input and prints their sum.
     * Handles any input-related exceptions gracefully.
     *
     * @param scanner A Scanner object used to read input from the console.
     */
    public static void perform(Scanner scanner) {
        try {
            // Prompt the user to enter two numbers
            System.out.print("Enter two numbers to add: ");

            // Read two double values from the user input
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            // Perform addition and display the result
            System.out.println("Result: " + (a + b));
        } catch (Exception e) {
            // Handle any input mismatch or runtime exceptions and print the error message
            System.out.println("Error in Addition: " + e.getMessage());
        }
    }
}

