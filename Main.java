// Name: Sehajdeep Singh Sikka
// PRN: 23070126119
// Batch: AIML B2

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class that runs a console-based calculator allowing the user to perform basic mathematical operations.
 * It uses a menu-driven approach with options for addition, subtraction, multiplication, division, square, cube, and square root.
 */
public class Main {
    
    /**
     * Main method to run the calculator program.
     * Continuously displays the menu, prompts the user for input, and performs the chosen operation.
     * Handles invalid inputs and exceptions appropriately to ensure smooth user experience.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Boolean flag to keep the calculator running until user chooses to exit
        boolean keepRunning = true;

        // Main loop to display menu and process user choice
        while (keepRunning) {
            try {
                // Display the menu with available operations
                System.out.println("\nCalculator Menu:");
                System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
                System.out.println("5. Square\n6. Cube\n7. Square Root\n8. Exit");
                System.out.print("Choose an option (1-8): ");

                // Read user's choice from input
                int choice = scanner.nextInt();

                // Execute the corresponding operation based on user input
                switch (choice) {
                    case 1 -> Addition.perform(scanner); // Addition operation
                    case 2 -> Subtraction.perform(scanner); // Subtraction operation
                    case 3 -> Multiplication.perform(scanner); // Multiplication operation
                    case 4 -> Division.perform(scanner); // Division operation
                    case 5 -> Square.perform(scanner); // Square operation
                    case 6 -> Cube.perform(scanner); // Cube operation
                    case 7 -> SquareRoot.perform(scanner); // Square Root operation
                    case 8 -> {
                        // Exit the calculator loop
                        System.out.println("Exiting Calculator. Goodbye!");
                        keepRunning = false;
                    }
                    // Handle invalid menu option
                    default -> throw new IllegalArgumentException("Invalid menu option! Please enter between 1 and 8.");
                }

            } catch (InputMismatchException ime) {
                // Handle invalid input such as non-numeric values for menu choice
                System.out.println("Invalid input! Please enter numeric values.");
                scanner.nextLine(); // Clear the input buffer

            } catch (ArithmeticException ae) {
                // Handle math-related errors like division by zero or other arithmetic issues
                System.out.println("Math error: " + ae.getMessage());

            } catch (IllegalArgumentException iae) {
                // Handle invalid menu selection and show appropriate error message
                System.out.println("Error: " + iae.getMessage());

            } catch (Exception e) {
                // Catch any other unexpected exceptions and display an error message
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }

        // Close the scanner object after the loop ends
        scanner.close();
    }
}

