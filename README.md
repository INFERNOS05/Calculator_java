# Calculator_java
# Java Console Calculator

## Overview

This Java application is a simple **console-based calculator** that allows users to perform basic mathematical operations such as:

- Addition
- Subtraction
- Multiplication
- Division
- Square of a number
- Cube of a number
- Square root of a number

The program utilizes a **menu-driven interface** where the user can select an operation by entering a corresponding option. The program is designed to be robust and includes error handling for invalid inputs and mathematical errors.

## Features

- **Addition**: Adds two numbers.
- **Subtraction**: Subtracts the second number from the first.
- **Multiplication**: Multiplies two numbers.
- **Division**: Divides the first number by the second with a check for division by zero.
- **Square**: Calculates the square of a number (multiplies the number by itself).
- **Cube**: Calculates the cube of a number (multiplies the number by itself three times).
- **Square Root**: Computes the square root of a number, with a check to prevent negative inputs.
- **Exit**: Allows the user to exit the calculator program.

## Table of Contents

1. [Prerequisites](#prerequisites)
2. [How to Run the Program](#how-to-run-the-program)
3. [Code Structure](#code-structure)
4. [Error Handling](#error-handling)
5. [License](#license)

## Prerequisites

To run this program, you need:

- **Java Development Kit (JDK)** installed on your system.
  - You can download it from the [official Oracle website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- A terminal or command prompt to run the program.
- A text editor or IDE for editing the code (such as IntelliJ IDEA, Eclipse, or VS Code).

## How to Run the Program

### Step 1: Clone the repository (or copy the code)
If you are using a GitHub repository, clone it with:

```bash
git clone https://github.com/your-repository/calculator.git
```
### Step 2: Compile the Java program

Navigate to the folder containing the Java files (if you're using a terminal or command prompt):

```bash
cd /path/to/your/java/files
```
### Step 3: Run the Program

Once compiled, you can run the program with:

```bash
java Main
```

### Code Structure

The program consists of the following classes:

#### Main:
- This is the entry point of the application. It displays the calculator menu, handles user input, and calls the appropriate mathematical operation methods from other classes.
- It uses a while loop to keep the menu active until the user selects the "Exit" option.
- It includes error handling for invalid inputs and arithmetic errors (e.g., division by zero).

#### Addition:
- Performs the addition of two numbers.
- Reads input from the user and prints the result.

#### Subtraction:
- Performs the subtraction of two numbers.
- Similar to the Addition class, it reads input and prints the result.

#### Multiplication:
- Multiplies two numbers.
- Accepts two user inputs and prints the multiplication result.

#### Division:
- Divides two numbers, with a check for division by zero.
- Handles any ArithmeticException (e.g., attempting to divide by zero).

#### Square:
- Calculates the square of a number.
- Accepts a number and prints its square.

#### Cube:
- Computes the cube of a number.
- Similar to Square, but the number is multiplied by itself three times.

#### SquareRoot:
- Calculates the square root of a number.
- Includes a check for negative input values, as square roots of negative numbers are not valid in the real number system.

### Error Handling

The program is designed to handle multiple types of errors:

- **InputMismatchException**: Catches invalid input types (non-numeric values) for menu choices and arithmetic operations.
- **ArithmeticException**: Handles mathematical errors, such as division by zero and invalid square root calculations (negative numbers).
- **IllegalArgumentException**: Catches invalid menu choices, e.g., choosing a number outside the valid range (1-8).
- **Generic Exception Handling**: Any unexpected errors are caught and displayed with a message to the user.

### Example of Error Handling:

If the user attempts to divide by zero, the program will display:

```vbnet
Math error: Cannot divide by zero!
```

### Code Sample
-----------

Here is a brief example of how the menu-driven calculator looks when executed:

```markdown
Calculator Menu:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Square
6. Cube
7. Square Root
8. Exit
Choose an option (1-8): 1
Enter two numbers to add: 5 10
Result: 15.0
```

If the user enters an invalid choice:

```vbnet
Error: Invalid menu option! Please enter between 1 and 8.
```

License
-------

This project is licensed under the MIT License - see the LICENSE file for details.

### Key Features in the README:

*   **Detailed Explanation of Functionality**: Each method (Addition, Subtraction, etc.) is briefly explained.
    
*   **Error Handling**: The document explains what types of errors are handled (e.g., invalid input, arithmetic errors) and how the program responds.
    
*   **Code Structure**: A breakdown of the classes and their responsibilities.

