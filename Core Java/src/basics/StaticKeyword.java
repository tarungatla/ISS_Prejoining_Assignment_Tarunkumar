package basics;

/**
 * static keyword:
 *
 * 1. Static Variable
 *    - Shared among all objects of the class.
 *
 * 2. Static Method
 *    - Can be called without creating an object.
 *
 * 3. Static Block
 *    - Executes once when the class is loaded.
 */

class Library {

    // Static Variable
    static String libraryName = "City Central Library";

    // Instance Variable
    String bookTitle;

    // Static Block
    static {
        System.out.println("Library Class Loaded");
    }

    public Library(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    // Static Method
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Instance Method
    public void displayBook() {
        System.out.println("Book Title: " + bookTitle);
    }
}

public class StaticKeyword {

    public static void main(String[] args) {

        // Call static method without creating object
        Library.displayLibraryName();

        Library book1 =
                new Library("Clean Code");

        Library book2 =
                new Library("Effective Java");

        System.out.println();

        book1.displayBook();
        book2.displayBook();

        System.out.println();

        // Access static variable using class name
        System.out.println(
                "Library Name from Book1: "
                + Library.libraryName);

        System.out.println(
                "Library Name from Book2: "
                + Library.libraryName);
    }
}