package oop;


/**
 * Method Overriding:
 * Child class provides its own implementation
 * of a method already present in Parent class.
 */

class Animal {

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.makeSound();
    }
}