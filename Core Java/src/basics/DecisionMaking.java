package basics;

/**
 * Decision Making Statements:
 * 1. if statement
 * 2. if-else statement
 * 3. nested if-else
 * 4. if-else-if ladder
 * 5. switch statement
 */
public class DecisionMaking {

    public static void main(String[] args) {

        // if statement

        double accountBalance = 15000;

        System.out.println("Account Balance: ₹" + accountBalance);

        if (accountBalance >= 10000) {
            System.out.println("Eligible for Premium Banking Benefits\n");
        }

        // if-else statement

        boolean hasValidKyc = false;

        if (hasValidKyc) {
            System.out.println("Account is fully activated");
        } else {
            System.out.println("Please complete KYC to activate your account\n");
        }

        // nested if-else

        int age = 25;
        double annualIncome = 600000;

        if (age >= 21) {
            if (annualIncome >= 500000) {
                System.out.println("Eligible for Personal Loan");
            } else {
                System.out.println("Income criteria not met");
            }
        } else {
            System.out.println("Age criteria not met");
        }

        System.out.println();

        // if-else-if ladder

        int creditScore = 780;
        String loanCategory;

        if (creditScore >= 800) {
            loanCategory = "Excellent";
        } else if (creditScore >= 750) {
            loanCategory = "Very Good";
        } else if (creditScore >= 700) {
            loanCategory = "Good";
        } else if (creditScore >= 650) {
            loanCategory = "Average";
        } else {
            loanCategory = "Poor";
        }

        System.out.println("Credit Score: " + creditScore);
        System.out.println("Loan Category: " + loanCategory + "\n");

        // switch statement

        int transactionType = 2;

        switch (transactionType) {
            case 1:
                System.out.println("Deposit Selected");
                break;

            case 2:
                System.out.println("Withdrawal Selected");
                break;

            case 3:
                System.out.println("Balance Inquiry Selected");
                break;

            case 4:
                System.out.println("Fund Transfer Selected");
                break;

            default:
                System.out.println("Invalid Transaction Type");
        }
    }
}