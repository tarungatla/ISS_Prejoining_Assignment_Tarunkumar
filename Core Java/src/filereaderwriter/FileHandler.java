package filereaderwriter;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
This class handles file operations such as 
creating, writing, appending, and reading files.
**/

public class FileHandler {

    // File object to represent the file
    public File file;

    // Constructor to initialize the File object with the given file path
    public FileHandler(String filePath) {
        this.file = new File(filePath);
    }

    // Method to create a new file
    public void createFile() {
        try {
            if (file.createNewFile()) {
                System.out.println("\nFile created: " + file.getName());
            } else {
                System.out.println("\nFile already exists.");
            }
        } catch (IOException e) {
            System.out.println("\nAn error occurred during file creation.");
            e.printStackTrace();
        }
    }

    // Method to write the file
    public void writeToFile(String content) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            System.out.println("\nWritten to file successfully.");
        } catch (IOException e) {
            System.out.println("\nFailed to write to file.");
            e.printStackTrace();
        }
    }

    // Method to append in the file
    public void appendToFile(String content) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(content);
            System.out.println("\nAppended to file successfully.");
        } catch (IOException e) {
            System.out.println("\nFailed to append to file.");
            e.printStackTrace();
        }
    }

    // Method to read from the file
    public void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\nReading file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("\nFailed to read file.");
            e.printStackTrace();
        }
    }
}