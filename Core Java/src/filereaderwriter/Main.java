package filereaderwriter;


import filereaderwriter.FileHandler;

public class Main {
    public static void main(String[] args) {

        // Specifying the file path
        String path = "src/filereaderwriter/temp.txt";
        
        // Creating an instance of FileHandler with the specified path
        FileHandler handler = new FileHandler(path);

        // File Creation
        handler.createFile();

        // Writing to File
        handler.writeToFile("Namaste\n");

        // Appending to File
        handler.appendToFile("Hii\n");

        // Reading from File
        handler.readFromFile();

        // Utility operations
        FileUtility.checkFileExists(handler.file);
        FileUtility.printFileDetails(handler.file);
//        FileUtility.deleteFile(handler.file);
    }
}
