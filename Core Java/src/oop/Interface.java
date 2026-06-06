package oop;

/**
 * Interface:
 * Contains abstract methods that
 * implementing classes must define.
 */

interface Payment {

    void pay(double amount);
}

class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println(
                "Paid ₹" + amount + " using Credit Card");
    }
}

public class Interface {

    public static void main(String[] args) {

        Payment payment =
                new CreditCardPayment();

        payment.pay(5000);
    }
}