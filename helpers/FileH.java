package helpers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.net.URISyntaxException;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.security.CodeSource;

import java.util.Scanner;


public class FileH {
    
    // File to array
    /** 
     * Converts a named file into an array of all its lines
     * 
     * @param fileName = The name of the file to read
     * 
     * @return {@code String[]} = The array of all file lines
     */
    public static String[] fileToArray(String fileName) {
        File file = new File(fileName);
        Scanner fileScanner;

        try {fileScanner = new Scanner(file);
            
        } catch (Exception e) {
            fileScanner = new Scanner("File {" + fileName + "} not found");
        }

        String[] returnArray = new String[0];

        while (fileScanner.hasNextLine()) {
            String curLineString = fileScanner.nextLine();

            String[] newHolder = new String[returnArray.length + 1];
                
            for (int j = 0; j < returnArray.length; j++) {
                newHolder[j] = returnArray[j];
            }

            newHolder[returnArray.length] = curLineString;
            
            returnArray = newHolder.clone();
        }

        fileScanner.close();

        return returnArray;
    }

    // Array to file
    /**
     * Creates a file with the given lines
     * 
     * @param fileName = The name of the file to write
     * @param writeLines = The lines to write to the file
     * 
     * @throws IOException 
     */
    public static void arrayToFile(String fileName, String[] writeLines) {
        FileWriter outputWriter;
        try {
            outputWriter = new FileWriter(fileName);

            for (int i = 0; i < writeLines.length; i++) {
                if (writeLines.length - 1 != i) {
                    outputWriter.write(writeLines[i] + "\n");
                }
                else {
                    outputWriter.write(writeLines[i]);
                }
            }
    
            outputWriter.close();

        } catch (IOException e) {
            
            e.printStackTrace();
        }

        
    }

    // Get external filepath
    /**
     * Used to obtain the path of a file starting from the project folder / where the jar is housed
     * 
     * @param filepath = The path including the filename and type of the desired file
     * 
     * @return {@code String} = The string representation of the filepath
     */
    public static String getFilePath(String filepath) {
        // Get the location of the file
        CodeSource codeSource = FileH.class.getProtectionDomain().getCodeSource();
        File jarFile;
        try {
            jarFile = new File(codeSource.getLocation().toURI().getPath());

            // Get the parent directory of the JAR file
            Path parentDir = jarFile.getParentFile().toPath();

            PyJav.printl(parentDir.toString());
            

            // Define the file path in the parent directory
            Path filePath = Paths.get(parentDir.toString(), filepath);

            // Convert Path to String for file operations
            return filePath.toString();

        } catch (URISyntaxException e) {
            PyJav.printl("Something went wrong: No " + filepath + " in directory");
            
        }
        
        return "";
        
    }

    // Encrypt string
    public static String encryptString(String toEncrypt, String key) {
        char[] encryptChars = toEncrypt.toCharArray();
        char[] keyChars = key.toCharArray();

        String encryptedString = "";

        for (int i = 0; i < encryptChars.length; i++) {
            int charNum = encryptChars[i] * keyChars[i % keyChars.length];
            
            encryptedString += (char) charNum;
        }
        

        return encryptedString;
    }

    // Decrypt string
    public static String decryptString(String toDecrypt, String key) {
        char[] encryptChars = toDecrypt.toCharArray();
        char[] keyChars = key.toCharArray();

        String decryptedString = "";

        for (int i = 0; i < encryptChars.length; i++) {
            int charNum = encryptChars[i] / keyChars[i % keyChars.length];
            
            decryptedString += (char) charNum;
        }

        return decryptedString;
    }

}
