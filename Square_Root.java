import java.util.Scanner;

/**
 * A class that provides functionality to compute the square root of a number
 * entered by the user via the console.
 */
public class SquareRoot {

    /**
     * Prompts the user to input a non-negative double value and calculates its square root.
     * Validates input to ensure it's not negative, and handles exceptions appropriately.
     *
     * @param scanner A Scanner object used to read input from the console.
     */
    public static void perform(Scanner scanner) {
        try {
            // Prompt the user to enter a number for square root calculation
            System.out.print("Enter a number to find the square root: ");

            // Read a double value from user input
            double a = scanner.nextDouble();

            // Check for negative input, which is invalid for real-number square roots
            if (a < 0) {
                throw new ArithmeticException("Cannot calculate square root of a negative number!");
            }

            // Compute and display the square root using Math.sqrt()
            System.out.println("Result: " + Math.sqrt(a));

        } catch (ArithmeticException ae) {
            // Rethrow ArithmeticException for external handling if necessary
            throw ae;
        } catch (Exception e) {
            // Handle input mismatches or other unexpected exceptions
            System.out.println("Error in SquareRoot: " + e.getMessage());
        }
    }
}

