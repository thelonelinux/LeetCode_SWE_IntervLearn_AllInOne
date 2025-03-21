package Java_SpringBoot_Microservices.PractiseJava;


import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is for practise of java learning and concepts practise");

        //Arrays are made with size 0, or size greater than int max, or size of negative
        int[] arr1 = new int[0]; //No error
       // int[] arr2 = new int[12345678910]; //Int size greater than max int. gives compile time error
       // int[] arr3 = new int[-1]; //Runtime error say, array size can't be negative

        //char without double quote will add up
        System.out.println("Hello char concatenated => " + 'a' + 'b' + 'c'); //Prints Hello....abc
        System.out.println('a' + 'b' + 'c'); //Prints sum of ascii a
    }

    //Multiple Main Class Example //gives compile time error //As JVM won't be able to find which one to run
//    public static void main(String[] args) {
//
//    }

    ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();

    //Main class with Integer Args
    public static void main(Integer[] args) {
        System.out.println("I am just a randon main function with integer args - JVM only treats me as some class method");
    }
}
