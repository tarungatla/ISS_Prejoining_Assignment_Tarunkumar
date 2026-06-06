package oop;

import utilities.Calculator;

public class Package {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(
                "Sum = " + calculator.add(10, 20));
    }
}
