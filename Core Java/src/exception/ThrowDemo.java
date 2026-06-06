package exception;

/**
 * Demonstrates throw keyword.
 *
 * throw is used to explicitly create
 * and throw an exception.
 */
public class ThrowDemo {

    public static void validateAge(int age) {

        if (age < 18) {

            throw new IllegalArgumentException(
                    "Age must be 18 or above for voting."
            );

        }

        System.out.println("Eligible for voting.");
    }

    public static void main(String[] args) {

        try {

            validateAge(15);

        }
        catch (IllegalArgumentException e) {

            System.out.println("Validation Failed!");
            System.out.println(e.getMessage());

        }
    }
}