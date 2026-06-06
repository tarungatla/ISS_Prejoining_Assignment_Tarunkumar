package exception;
/**
 * Exception Hierarchy in Java
 *
 * Object
 *   └── Throwable
 *         ├── Error
 *         └── Exception
 *               ├── IOException
 *               ├── SQLException
 *               └── RuntimeException
 *                     ├── ArithmeticException
 *                     ├── NullPointerException
 *                     └── ArrayIndexOutOfBoundsException
 */
public class ExceptionHierarchy {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
            System.out.println("Message: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
        catch (Exception e) {
            System.out.println("Exception caught");
        }

        System.out.println("Program continues after exception handling.");
    }
}