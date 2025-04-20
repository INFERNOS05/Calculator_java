import java.util.Scanner;

/**
 * A class that provides functionality to calculate the square of a number
 * entered by the user via the console.
 */
public class Square {

    /**
     * Prompts the user to input a double value and calculates its square.
     * Handles invalid input or runtime exceptions gracefully.
     *
     * @param scanner A Scanner object used to read input from the console.
     */
    public static void perform(Scanner scanner) {
        try {
            // Prompt the user to enter a number to square
            System.out.print("Enter a number to square: ");

            // Read a double value from the console input
            double a = scanner.nextDouble();

            // Calculate and display the square of the number
            System.out.println("Result: " + (a * a));

        } catch (Exception e) {
            // Catch any input mismatch or unexpected exception and print the error message
            System.out.println("Error in Square: " + e.getMessage());
        }
    }
}

