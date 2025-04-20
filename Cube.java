import java.util.Scanner;

/**
 * A class that provides functionality to calculate the cube of a number
 * entered by the user through the console.
 */
public class Cube {

    /**
     * Reads a double value from the user input and prints its cube.
     * Handles any input-related exceptions gracefully.
     *
     * @param scanner A Scanner object used to read input from the console.
     */
    public static void perform(Scanner scanner) {
        try {
            // Prompt the user to enter a number
            System.out.print("Enter a number to cube: ");

            // Read a double value from the user input
            double a = scanner.nextDouble();

            // Compute the cube of the number and display the result
            System.out.println("Result: " + (a * a * a));
        } catch (Exception e) {
            // Handle any input mismatch or runtime exceptions and print the error message
            System.out.println("Error in Cube: " + e.getMessage());
        }
    }
}

