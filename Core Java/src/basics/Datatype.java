package basics;

class Book {
    public String title;
    public String author;
}

public class Datatype {

    public static void main(String[] args) {

        // Primitive Data Types

        byte age = 22;
        System.out.println("Byte (Age): " + age);

        short year = 2025;
        System.out.println("Short (Year): " + year);

        int population = 1500000;
        System.out.println("Int (Population): " + population);

        long mobileNumber = 9876543210L;
        System.out.println("Long (Mobile Number): " + mobileNumber);

        float temperature = 36.5f;
        System.out.println("Float (Temperature): " + temperature);

        double pi = 3.14159265359;
        System.out.println("Double (PI Value): " + pi);

        char grade = 'A';
        System.out.println("Char (Grade): " + grade);

        boolean isJavaFun = true;
        System.out.println("Boolean (Is Java Fun?): " + isJavaFun);

        // Non-Primitive / Reference Data Type

        Book book1 = new Book();
        book1.title = "Clean Code";
        book1.author = "Tarun";

        System.out.println("\nBook Details");
        System.out.println("Title : " + book1.title);
        System.out.println("Author: " + book1.author);
    }
}