package org.example;

public class ErrorHandlerTest {
    // Method to test performArithmeticOperation
    public static void testArithmeticOperations() {
            ErrorHandler operationHandler = new ErrorHandler();

            // Test case 1: Addition (Success)
            int result1 = operationHandler.performArithmeticOperation(5, 3, "add");
            System.out.println("Addition result: " + result1);

            // Test case 2: Division (Arithmetic exception)
            int result2 = operationHandler.performArithmeticOperation(10, 0, "divide");
            System.out.println("Division result: " + result2);

            // Test case 3: Unsupported operation (UnsupportedOperationException)
            int result3 = operationHandler.performArithmeticOperation(7, 2, "power");
            System.out.println("Unsupported operation result: " + result3); // This won't be printed due to the exception
        }
    public static void main(String[] args) {

        testArithmeticOperations();
    }
}

