package basics;


/**
 * final keyword:
 * 1. Final Variable -> value cannot be changed
 * 2. Final Method -> cannot be overridden
 * 3. Final Class -> cannot be inherited
 */

// Final Class
final class Utility {

    public void displayMessage() {
        System.out.println("Utility Class");
    }
}

class Employee {

    // Final Variable (Constant)
    private final int EMPLOYEE_ID = 101;

    public void displayEmployeeId() {
        System.out.println("Employee ID: " + EMPLOYEE_ID);
    }

    // Final Method
    public final void companyPolicy() {
        System.out.println("Follow company policies.");
    }
}

class Developer extends Employee {

    /*
     * Compilation Error:
     * Cannot override the final method from Employee
     *
     * public void companyPolicy() {
     *     System.out.println("New Policy");
     * }
     */

    public void writeCode() {
        System.out.println("Writing Java Code");
    }
}

public class FinalKeyword {

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.displayEmployeeId();
        developer.companyPolicy();
        developer.writeCode();

        Utility utility = new Utility();
        utility.displayMessage();

        /*
         * Compilation Error:
         * Cannot assign a value to final variable
         *
         * developer.EMPLOYEE_ID = 200;
         */

        /*
         * Compilation Error:
         * Cannot inherit from final class Utility
         *
         * class Test extends Utility {
         * }
         */
    }
}