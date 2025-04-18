package Core_Java_Learning.PractiseJava;

public class String_Learning_Heap {
    
    public static void main(String[] args) {
        
        //I have attached the image, Check to understand String, String Pool, String Literal, String Object, String Data/State/Value, Heap Memory


        String str1 = "Vicky"; //This String Literal will be created in String Pool. 
        //No New object is created here. str1 is just a reference not pointing to any address in heap. Only pointing to String Literal in String pool

        String str2 = new String("Vicky");   //Here the String Object is created in Heap Memory, 
        //Its value/state will be pointed to Same String Literal created above by str1 in the string pool.

        boolean bool1 = str1 == str2 ;   // (==) operator compares the ADDRESS. //Two objects will never have same address in the heap, Hence gives false
        System.out.println("boolean bool1 = str1 == str2 ; // => " + bool1);


        //================================================================================================================

        String str3 = "Vicky"; //Here no new object is created in Heap. Only the value is pointed to String Literal created by str1 in string pool
        boolean bool2 = str1 == str3 ;   // (==) operator compares the address. //Here both are pointing to only address, No new object in heap

        System.out.println("boolean bool2 = str1 == str3 ; // => " + bool2);


        //------------------------EQUALS (ONLY COMPARES THE VALUE) ------------------------------------------------
        Boolean bool3 = str1.equals(str2);
        Boolean bool4 = str1.equals(str3);
        Boolean bool5 = str2.equals(str3);
        //All will give true as all of them point to same string Literal "Vicky" present in string pool

        System.out.println(bool3);
        System.out.println(bool4);
        System.out.println(bool5);


        // ---------------------------- TWO DIFFERENT OBJECT OF STRING POINTING TO SAME STRING LITERAL -------------------------
        String str4 = new String("Vicky"); //This will create a new object and its value will be that same string literal already present in string pool

        Boolean bool6 = str2 == str4; //This is comparing the address of there object, will return false.
        boolean bool7 = str2.equals(str4);  //This is comparing there value/state/data. Since both state, value are both pointing to same string literal
        //so this will give true

        System.out.println(bool6);
        System.out.println(bool7);



    }
}
