package Java_Spring_SpringBoot_Microservices.PractiseJava.Interface_Abstract_Learning;

public class SomeChild extends MyAbstractClass implements MyInterface{
    @Override
    public void abstractPublicMethod() {
        System.out.println("Abstract Public Method in Child");
    }

    @Override
    protected void abstractProtectedMethod() {
        System.out.println("Abstract Protected Method in Child");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("Abstract Public Method2 in Child");
    }

    @Override
    public void normalInterfaceMethodPublicAndAbstract() {
        System.out.println("Normal Interface Method (By default they are public and abstract) in Child");
    }


    public static void main(String[] args) {
        System.out.println("Abstraction learning via Abstract class and interface");

        SomeChild someChild = new SomeChild();
        int a = someChild.finalNumber;
        //int b = someChild.normalNumber; //Present in both interface and abstract class hence giving ambiguous  compile time error.

        someChild.normalNonAbstractMethod();
        someChild.abstractProtectedMethod();
        someChild.abstractMethod2();

        someChild.normalInterfaceMethodPublicAndAbstract();

        System.out.println("============ We can however create AbstractClass Object and Interface Object, " +
                "Only if we could implement abstract methods in that same object creation block =========");

        System.out.println("INTERFACE OBJECT CREATION");
        MyInterface myInterface = new MyInterface() {
            @Override
            public void normalInterfaceMethodPublicAndAbstract() {
                System.out.println("Create Interface object by implementing all the abstract methods in object creation block");
            }
        };

        myInterface.normalInterfaceMethodPublicAndAbstract();

        System.out.println("ABSTRACT CLASS OBJECT CREATION");
        MyAbstractClass myAbstractClass = new MyAbstractClass() {
            @Override
            public void abstractPublicMethod() {
                System.out.println("Create Abstract object by implementing all the abstract methods in object creation block");
            }

            @Override
            protected void abstractProtectedMethod() {
                System.out.println("Create Abstract object by implementing all the abstract methods in object creation block");
            }

            @Override
            public void abstractMethod2() {
                System.out.println("Create Abstract object by implementing all the abstract methods in object creation block");
            }
        };

        myAbstractClass.abstractPublicMethod();
        myAbstractClass.abstractProtectedMethod();
        myAbstractClass.abstractMethod2();
    }
}
