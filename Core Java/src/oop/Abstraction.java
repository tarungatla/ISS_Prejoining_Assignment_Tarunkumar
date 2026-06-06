package oop;


/**
 * Abstraction:
 * Hides implementation details and
 * shows only essential functionality.
 */

abstract class Shape {

    public abstract double calculateArea();
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

public class Abstraction{

    public static void main(String[] args) {

        Shape shape = new Circle(5);

        System.out.println("Area: " + shape.calculateArea());
    }
}