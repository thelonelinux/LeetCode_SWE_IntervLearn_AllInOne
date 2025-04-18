package Core_Java_Learning.PractiseJava.Interface_Abstract_Learning;

/**
 * INTERFACE CAN'T BE FINAL
 * Final means that class can't be inherited
 */

public interface MyInterface {

    /**
     * INTERFACE VARIABLES
     * By default they are static and final, whether you add keyword or not
     * As initially we don't want object interface so we want only static and final as neither inherited and should be class variables only
     *
     */
    int normalNumber = 5;
    static int staticNumber = 6;


    /**
     * INTERFACE METHODS
     * By default all the methods are Abstract and Public. No need to specifically denote with those keywords.
     * However, default keyword can be used to add some body in the methods in interface.
     * Static method too can have body like any other normal class, because it's class properties so
     *
     */

    void normalInterfaceMethodPublicAndAbstract(); //If you add body, it will give compilation error

    default void implementDefaultMethod(){
        System.out.println("Default method in interface have body, they are not like abstract method");
    }


     static void staticMethod(){
        System.out.println("Static method in interface have body, as they are class properties");
    }

}
