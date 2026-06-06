package oop;

/**
 * Encapsulation:
 * Binding data and methods together
 * and restricting direct access using private variables.
 */

class BankAccount {

    private String accountHolder;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        }
    }
}

public class Encapsulation{

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolder("Tarun");
        account.setBalance(10000);

        System.out.println("Account Holder: "
                + account.getAccountHolder());

        System.out.println("Balance: "
                + account.getBalance());
    }
}