package org.example.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreateNewFile {

    public static void main(String[] args) {
        // new file path
        Path filePath = Paths.get("C:\\Users\\kuchi\\tools\\file2.txt");
        try {
            /*
                Using java.nio.file.Files package.

             */

            Path file = Files.createFile(filePath);
            System.out.println("File created successfully!");

            String str = "Hello, How are you doing?";
            byte[] bytes = str.getBytes();
            Files.write(filePath,bytes);

            List<String> allLines = Files.readAllLines(filePath);

            System.out.println("Read data from file: "+ allLines.get(0));

             /*
                Use BufferedWriter to write a String to a new file
             */
            String str1 = "hello, how are you?";
            File fileName = new File("C:\\Users\\kuchi\\tools\\bufferFile.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write(str1);
            bufferedWriter.close();


        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("No permission to create file: " + e.getMessage());
        }

    }
}
