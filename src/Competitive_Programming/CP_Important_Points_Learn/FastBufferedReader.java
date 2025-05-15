package Competitive_Programming.CP_Important_Points_Learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FastBufferedReader {

    

     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Write a java code to read an array of integer. Read the input by buffered reader
        System.out.println("Enter integers separated by spaces:");
        String input = br.readLine(); // Read the input line
        // Split the input string into an array of strings, then convert to an array of integers
        int[] arr = Arrays.stream(input.trim().split("\\s+"))
                          .mapToInt(Integer::parseInt)
                          .toArray();
        System.out.println("Array: " + Arrays.toString(arr));


        // Write a java code to read an array of string. Read the input by buffered reader
        System.out.println("Enter strings separated by spaces:");
        String input2 = br.readLine();
        String[] arr2 = input2.trim().split("\\s+");
        System.out.println("Array: " + Arrays.toString(arr2));






        // Read the size of the array, then read the integers one by one
        // This is useful when you don't know the size of the array in advance
        // and want to read a specific number of integers line by iine.
        System.out.println("Enter the number of integers:");
        int n = Integer.parseInt(br.readLine());
        int[] arr3 = new int[n];

        System.out.println("Enter " + n + " integers (one per line):");
        for (int i = 0; i < n; i++) {
            arr3[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Array: " + Arrays.toString(arr3));





        // Read the size of the array, then read the strings one by one line by line
        System.out.println("Enter the number of strings:");
        int m = Integer.parseInt(br.readLine());
        String[] arrStr = new String[m];

        System.out.println("Enter " + m + " strings (one per line):");
        for (int i = 0; i < m; i++) {
            arrStr[i] = br.readLine();
        }
        System.out.println("Array: " + Arrays.toString(arrStr));
    }







    
    
}
