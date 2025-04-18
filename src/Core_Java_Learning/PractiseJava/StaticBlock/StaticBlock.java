package Core_Java_Learning.PractiseJava.StaticBlock;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("Hello I am a constructor, I am called when object is created after bracked blocked");
    }

    static {
        System.out.println("First all static block is executed from top to down when main function is called in that class whther " +
                "you create object or not");
    }

    {
        System.out.println("Secondly all the braced block is executed from top to down only when object is created");
    }

    public static void main(String[] args) {

        System.out.println("Hello world from main");
        StaticBlock sb  = new StaticBlock();

    }
}
