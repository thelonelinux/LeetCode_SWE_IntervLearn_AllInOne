package Core_Java_Learning.PractiseJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        try {
            // Step 1: Create a file
            java.io.File file = new java.io.File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Step 2: Write to the file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("This is an example file.\nLearning file operations in Java.");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // Step 3: Read the file
            Scanner reader = new Scanner(file);
            System.out.println("Reading file content:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}