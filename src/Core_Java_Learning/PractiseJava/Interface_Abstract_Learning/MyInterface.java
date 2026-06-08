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
     * They are not abstract, as they have body, but they are public by default. They can be overridden in the implementing class, but it is not mandatory to override as it has body, so it's not abstract.
     * Static method too can have body like any other normal class, because it's class properties so
     *
     * A default method in Java is a method declared inside an interface with the default keyword and a method body.
     * It was introduced in Java 8 to allow interfaces to add new methods without breaking existing classes that implement them.
     */

    void normalInterfaceMethodPublicAndAbstract(); //If you add body, it will give compilation error

    default void implementDefaultMethod(){ //This method can be overridden in the implementing class, but it is not mandatory to override as it has body, so it's not abstract.
        System.out.println("Default method in interface have body, they are not like abstract method");
    }

    default void implementDefaultMethod2(){ //This method can be overridden in the implementing class, but it is not mandatory to override as it has body, so it's not abstract.
        System.out.println("Default method in interface have body, they are not like abstract method");
    }


     static void staticMethod(){
        System.out.println("Static method in interface have body, as they are class properties");
    }

}
