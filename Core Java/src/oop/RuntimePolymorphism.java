package oop;


/**
 * Polymorphism:
 * Allows objects to take on multiple forms, enabling the same interface or method to behave differently based on the object it is acting upon.
 */

class Vehicle {

    public void start() {
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car Started");
    }
}

class Bike extends Vehicle {

    @Override
    public void start() {
        System.out.println("Bike Started");
    }
}

public class RuntimePolymorphism{

    public static void main(String[] args) {

        Vehicle vehicle;

        vehicle = new Car();
        vehicle.start();

        vehicle = new Bike();
        vehicle.start();
    }
}