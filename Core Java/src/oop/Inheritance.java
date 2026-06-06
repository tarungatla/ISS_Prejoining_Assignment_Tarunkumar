package oop;

/**
 * Inheritance:
 * Child class acquires properties and methods
 * of the Parent class.
 */

class Person {

    protected String name;

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {

    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void showStudentDetails() {
        display();
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Inheritance{

    public static void main(String[] args) {

        Student student = new Student("Tarun", 101);

        student.showStudentDetails();
    }
}