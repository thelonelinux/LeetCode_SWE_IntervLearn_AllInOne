import java.io.*;
import java.util.*;
import java.lang.*;


public class Practise_Samsung_BufferedRead {

    public static void main(String[] args) throws IOException {       

        // BufferedReader used for fast input 
        // It reads the input from the console as a stream of characters or string or text.       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //br.readLine() reads a line of text from the input stream
        // It reads the input until a newline character is encountered

        System.out.println("STRING READING");
        /** 
        //STRING READING===========================================
        //Reading a string
        System.out.println("Reading a single string");
        String str = br.readLine(); // Read a single line of input
        System.out.println("You entered String as: " + str);

        //Reading multiple strings in same line
        System.out.println("Reading multiple strings in same line");
        String[] strArray = br.readLine().split(" "); // Read a single line of input and split it into an array
        System.out.println("You entered Strings as: " + Arrays.toString(strArray));

        //Reading multiple integers in different line
        System.out.println("Reading multiple integers in different line: enter the string array length");
        int n = Integer.parseInt(br.readLine()); // Read the first line as an integer
        String[] intArray = new String[n]; // Create an array of size n
        for (int i = 0; i < n; i++) {
            intArray[i] = br.readLine(); // Read each line and store it in the array
        }
        System.out.println("You entered Integers as: " + Arrays.toString(intArray));
        //=========================================================
        */

        System.out.println("INTEGER READING");
        /** 
        //INTEGER READING=========================================
        //Reading a single integer
        System.out.println("Reading a single integer");
        int singleInt = Integer.parseInt(br.readLine()); // Read a single line of input and parse it as an integer
        System.out.println("You entered Integer as: " + singleInt);

        //Reading multiple integers in same line
        System.out.println("Reading multiple integers in same line");
        int[] intArraySameLine = Arrays.stream(br.readLine().split(" ")) // Read a single line of input and split it into an array
                .mapToInt(Integer::parseInt) // Convert each element to an integer
                .toArray(); // Convert the stream to an array
        System.out.println("You entered Integers as: " + Arrays.toString(intArraySameLine));

        //Reading multiple integers in different line
        System.out.println("Reading multiple integers in different line: enter the integer array length");
        int nInt = Integer.parseInt(br.readLine()); // Read the first line as an integer
        int[] intArrayDifferentLine = new int[nInt]; // Create an array of size n
        for (int i = 0; i < nInt; i++) {
            intArrayDifferentLine[i] = Integer.parseInt(br.readLine()); // Read each line and parse it as an integer
        }
        System.out.println("You entered Integers as: " + Arrays.toString(intArrayDifferentLine));
        //=========================================================
        */


        System.out.println("CHAR READING");
        //CHARACTER READING=========================================
        //Reading a single character
        System.out.println("Reading a single character");
        //char singleChar = (char) br.read(); // Read a single character from the input stream
        //BUT this will keep the buffer in the same line
        //So better to use br.readLine() and then convert it to char
        char singleChar = br.readLine().charAt(0); // Read a single line of input and get the first character
        System.out.println("You entered Character as: " + singleChar);
       
        //Reading multiple characters in same line separated by space
        System.out.println("Reading multiple characters in same line separated by space");
        char[] charArraySameLine = br.readLine().replaceAll(" ", "").toCharArray(); // Read a single line of input and convert it to a character array
        System.out.println("You entered Characters as: " + Arrays.toString(charArraySameLine));

        //Reading multiple characters in different line
        System.out.println("Reading multiple characters in different line: enter the character array length");
        int nChar = Integer.parseInt(br.readLine()); // Read the first line as an integer
        char[] charArrayDifferentLine = new char[nChar]; // Create an array of size n
        for (int i = 0; i < nChar; i++) {
            charArrayDifferentLine[i] = (char) br.read(); // Read each line and parse it as a character
            br.readLine(); // Consume the newline character after reading the character
        }                                                                           
        System.out.println("You entered Characters as: " + Arrays.toString(charArrayDifferentLine));
       
       
        
    }
    
}
