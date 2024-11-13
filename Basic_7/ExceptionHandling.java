package Basic_7;

import java.io.*;

public class ExceptionHandling {

    public static void main(String[] args) {
        
        // Example 1: Unchecked Exception (ArithmeticException)
        try {
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;  // This will throw ArithmeticException (divide by zero)
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());  // Handling divide by zero error
        }

        // Example 2: Checked Exception (FileNotFoundException)
        try {
            File file = new File("nonexistentfile.txt");
            FileReader fr = new FileReader(file);  // This will throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());  // Handling file not found error
        }

        // Example 3: Multiple Catch Blocks
        try {
            String str = null;
            System.out.println(str.length());  // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());  // Handling null pointer error
        } catch (Exception e) {
            System.out.println("Caught Generic Exception: " + e.getMessage());  // Catch any other exceptions
        }

        // Example 4: Finally Block
        try {
            System.out.println("Trying to open a file...");
            FileReader fr = new FileReader("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException in finally demo: " + e.getMessage());
        } finally {
            // This block is always executed whether an exception occurs or not
            System.out.println("This will always be executed (finally block).");
        }

        // Example 5: Manually Throwing an Exception
        try {
            int num1 = 10;
            int num2 = 0;
            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero");  // Manually throwing exception
            }
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught manually thrown ArithmeticException: " + e.getMessage());
        }
    }
}
