package basics;


//Creating a class
class BankAccount {

 // Attributes
 private String accountHolderName;
 private long accountNumber;
 private double balance;

 // Getter and Setter methods
 public String getAccountHolderName() {
     return accountHolderName;
 }

 public void setAccountHolderName(String accountHolderName) {
     this.accountHolderName = accountHolderName;
 }

 public long getAccountNumber() {
     return accountNumber;
 }

 public void setAccountNumber(long accountNumber) {
     this.accountNumber = accountNumber;
 }

 public double getBalance() {
     return balance;
 }

 public void setBalance(double balance) {
     this.balance = balance;
 }

 // Business methods
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited ₹" + amount);
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn ₹" + amount);
     } else {
         System.out.println("Insufficient Balance!");
     }
 }

 public void displayAccountDetails() {
     System.out.println("Account Holder: " + accountHolderName);
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Available Balance: ₹" + balance);
 }
}

public class Class{

 public static void main(String[] args) {

     // Creating object
     BankAccount account = new BankAccount();

     // Setting values using setters
     account.setAccountHolderName("Tarun");
     account.setAccountNumber(1234567890L);
     account.setBalance(10000);

     // Calling methods
     account.deposit(5000);
     account.withdraw(3000);

     // Display details
     account.displayAccountDetails();
 }
}