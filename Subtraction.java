import java.util.Scanner;

/**
 * A class that provides functionality to perform subtraction of two numbers
 * entered by the user via the console.
 */
public class Subtraction {

    /**
     * Prompts the user to input two double values and calculates their difference.
     * Handles any input or runtime exceptions gracefully.
     *
     * @param scanner A Scanner object used to read input from the console.
     */
    public static void perform(Scanner scanner) {
        try {
            // Prompt the user to enter two numbers for subtraction
            System.out.print("Enter two numbers to subtract: ");

            // Read two double values from user input
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            // Calculate and display the result of subtraction (a - b)
            System.out.println("Result: " + (a - b));

        } catch (Exception e) {
            // Catch any input mismatch or runtime exception and display an error message
            System.out.println("Error in Subtraction: " + e.getMessage());
        }
    }
}

