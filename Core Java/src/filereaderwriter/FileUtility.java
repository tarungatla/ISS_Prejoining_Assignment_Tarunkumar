package filereaderwriter;


import java.io.File;

public class FileUtility {

    // Method to check if a file exists
    public static void checkFileExists(File file) {
        System.out.println("\nFile exists: " + file.exists());
    }

    // Method to print file details
    public static void printFileDetails(File file) {
        if (file.exists()) {
        	System.out.println("\n---File Details---");
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
        } else {
            System.out.println("File does not exist.");
        }
    }

    // Method to delete a file
    public static void deleteFile(File file) {
        if (file.delete()) {
            System.out.println("\nDeleted the file: " + file.getName());
        } else {
            System.out.println("\nFailed to delete the file.");
        }
    }
}