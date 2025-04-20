import java.util.Scanner;

/**
 * A class that provides functionality to perform multiplication of two numbers
 * entered by the user via the console.
 */
public class Multiplication {

    /**
     * Prompts the user to input two double values and calculates their product.
     * Handles any input or runtime exceptions gracefully.
     *
     * @param scanner A Scanner object used to read input from the console.
     */
    public static void perform(Scanner scanner) {
        try {
            // Prompt the user to enter two numbers for multiplication
            System.out.print("Enter two numbers to multiply: ");

            // Read two double values from user input
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            // Compute and display the product of the two numbers
            System.out.println("Result: " + (a * b));

        } catch (Exception e) {
            // Catch any input mismatch or runtime exception and display an error message
            System.out.println("Error in Multiplication: " + e.getMessage());
        }
    }
}

