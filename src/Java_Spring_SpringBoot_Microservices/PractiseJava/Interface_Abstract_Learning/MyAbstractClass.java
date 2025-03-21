package Java_Spring_SpringBoot_Microservices.PractiseJava.Interface_Abstract_Learning;

/**
 * Abstract class can't be final. Because this class need to be inherited
 * Final means that class can't be inherited.
 */
public abstract class MyAbstractClass {

    /**
     * VARIABLES IN ABSTRACT CLASS
     * Here variables like any other normal class - static and non-static both
     */
    int normalNumber = 5;
    static int staticNumber = 6;
    final int finalNumber = 7;


    /**
     * METHODS IN ABSTRACT CLASS
     * Motive - We don't want the child class to show them our signature, so we do abstraction. To hide our methods.
     * So Learning is in Abstract Class you can have both Abstract method and non-abstract method.
     * Abstract method should not have definition, you should use abstract keyword
     * Non-Abstract method must have body else it will give compile time error, Non abstract method works like usual class methods.
     * Types of Methods :
     *  1. Abstract Methods - No implementation or body, Only definition, Use Abstract Keyword
     *      Abstract methods should be public, protected. They can't be static, can't be default as well, default only for interface concept
     *  2. Non-Abstract Methods - Can have body, works like any other normal class
     *      Non-Abstract methods - can be anything like any other class method, but body should be there, can't be default, default only for interface concept
     *
     */

    public abstract void abstractPublicMethod();

    protected abstract void abstractProtectedMethod();

    public abstract void abstractMethod2();

    private void nonAbstractPrivateMethod(){
        System.out.println("I am non abstract method, so i must be implemented and have body, I can be private");
    }

    public static void staticMethod(){
        System.out.println("Hi i am static method in abstract class, but I must have body");
    }

    public void normalNonAbstractMethod(){
        System.out.println("Hello from AbstractClass -  I do not abstract keyword in my method, I should have body else give compile time error");
    }

    //default methods not supported in abstract class, will give compile time error
//    public abstract default void defaultMethod();
//
//    public default void defaultMethodNonAbstract(){
//        System.out.println("hello, default methods not supported in abstract class");
//    }


}
