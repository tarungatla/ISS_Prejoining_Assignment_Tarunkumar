package multithreading;


/**
 * Entire method is synchronized.
 * Only one thread can execute it at a time.
 */

class BankAccount {

    private int balance = 1000;

    public synchronized void withdraw(int amount) {

        if(balance >= amount) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " withdrawing "
                            + amount);

            balance -= amount;

            System.out.println(
                    "Remaining Balance : "
                            + balance);
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }
}

public class MethodSynchronized{

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Runnable task =
                () -> account.withdraw(700);

        Thread t1 = new Thread(task, "User-1");
        Thread t2 = new Thread(task, "User-2");

        t1.start();
        t2.start();
    }
}