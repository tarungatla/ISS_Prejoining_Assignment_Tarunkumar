package exception;

/**
 * Demonstrates Exception Handling using:
 * 1. try
 * 2. catch
 * 3. finally
 */
public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        try {

            System.out.println("Trying to access invalid index...");
            System.out.println(numbers[5]);

        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception Occurred!");
            System.out.println("Message: " + e.getMessage());

        }
        finally {

            System.out.println("Finally block always executes.");

        }

        System.out.println("Program completed successfully.");
    }
}