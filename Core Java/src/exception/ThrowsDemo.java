package exception;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrates throws keyword.
 *
 * throws is used in method signature
 * to indicate that a method may
 * generate an exception.
 */
public class ThrowsDemo {

    public static void readFile(String fileName)
            throws IOException {

        BufferedReader reader =
                new BufferedReader(
                        new FileReader(fileName));

        System.out.println(reader.readLine());

        reader.close();
    }

    public static void main(String[] args) {

        try {

            readFile("sample.txt");

        }
        catch (IOException e) {

            System.out.println("File handling error!");
            System.out.println(e.getMessage());

        }
    }
}