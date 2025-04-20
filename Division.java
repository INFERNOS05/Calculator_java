import java.util.Scanner;

/**
 * A class that provides functionality to perform division of two numbers
 * entered by the user via the console.
 */
public class Division {

    /**
     * Reads two double values from user input and performs division (a / b).
     * Checks for division by zero and handles exceptions appropriately.
     *
     * @param scanner A Scanner object used to read input from the console.
     */
    public static void perform(Scanner scanner) {
        try {
            // Prompt the user to enter two numbers
            System.out.print("Enter two numbers to divide: ");

            // Read two double values from the user input
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            // Check for division by zero, which would cause an arithmetic exception
            if (b == 0) throw new ArithmeticException("Cannot divide by zero!");

            // Perform division and display the result
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException ae) {
            // Explicitly rethrow ArithmeticException to be handled elsewhere if needed
            throw ae;
        } catch (Exception e) {
            // Handle all other exceptions (e.g., input mismatch) and display an error message
            System.out.println("Error in Division: " + e.getMessage());
        }
    }
}

