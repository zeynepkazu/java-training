package org.example;

public class ErrorHandler {
    // Method that performs arithmetic operations on two integers
    public int performArithmeticOperation(int operand1, int operand2, String operation) {
        try {
            int result;

            switch (operation) {
                case "add":
                    result = operand1 + operand2;
                    break;
                case "subtract":
                    result = operand1 - operand2;
                    break;
                case "multiply":
                    result = operand1 * operand2;
                    break;
                case "divide":
                    result = operand1 / operand2;
                    break;
                default:
                    throw new UnsupportedOperationException("Unsupported operation: " + operation);
            }

            return result;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
            return 0; // Return a default value OR handle the exception
        } catch (UnsupportedOperationException e) {
            System.err.println("UnsupportedOperationException: " + e.getMessage());
            return 0; // Return a default value OR handle the exception
        }
    }
}

