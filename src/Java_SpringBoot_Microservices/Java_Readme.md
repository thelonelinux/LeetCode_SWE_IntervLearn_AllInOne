# JAVA LEARNING

## MY LEARNING APPROACH FOR INTERVIEW
### 1. FROM INTERVIEWBIT
* Get/download pdf from interview bit and learn

### 2. FROM GFG INTERVIEWBIT
* Get the link and learn from there


### 3. PRACTICE CODE AND LEARN
* See the github edureka microservice learning and how different java code is written to build microservice application
* Also can add some important topic below like JVM structure etc mentioned below and learn better by YT


## DIFFICULT TOPICS MY LEARNING
* 0. EXTRAS TOPICS ON TOP OF
  * THREAD-SAFE AND SYNCHRONIZED MEANING
    * Means in that java program, if we have multiple instance calling that object, then there value won't be changes in both the place
    * like we have issue in critical section. Instead when they go in on Critical section of a thread, then it will use lock
    * and hence they are called thread-safe and synchronized.
* 1. JVM, JRE, JDK ARCHITECTURE, JIT, CLASSLOADER WHOLE FLOW LEARN.
    * YT Link : https://www.youtube.com/watch?v=CDijVBqEeJ8&ab_channel=BitsAndBytes
* 2. Revise OOPs Concepts all with better examples
  * Encapsulation => All class members are stored in one place within the class
  * Abstraction => Abstraction in Java is the process of hiding the implementation details and only showing the essential functionality 
    * or features to the user.
    * In Java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.
    * Abstraction Real-Life Example:
      * Consider a real-life example of a man driving a car. 
      * The man only knows that pressing the accelerator will increase the speed of a car or applying brakes will stop the car, 
      * but he does not know how on pressing the accelerator the speed is actually increasing, 
      * he does not know about the inner mechanism of the car or the implementation of the accelerator, brakes, etc. in the car. 
      * This is what abstraction is.
  * Polymorphism => Polymorphism is an important feature of Java OOPs concept and it allows us to perform multiple operations by using the single name of any method (interface)
    * Very important to learn for Method Overloading
      * https://stackoverflow.com/questions/2439782/overload-with-different-return-type-in-java?newreg=cd9c27c0a57e4c008e37b10d5dc95682
      * Why is it not possible to overload a function just by changing the return type? Will that change in a future version of Java? By the way, just for reference, is this possible in C++?
        * You can't do it in Java, and you can't do it in C++. 
        * The rationale is that the return value alone is not sufficient for the compiler to figure out which function to call:
        * public int foo() {...}
        * public float foo() {..}
        * ...
        * foo(); // which one?
    * https://www.programiz.com/java-programming/method-overloading
    * Note: The return types of the above methods are not the same. 
      * It is because method overloading is not associated with return types. 
      * Overloaded methods may have the same or different return types, but they must differ in parameters.
      * REMEMBER THEY MUST HAVE DIFFERENT PARAMETERS IN TWO METHODS OF SAME METHOD NAME TO BE USED AS METHOD OVERLOADING.
  * Inheritance => Reusing the old class with new methods.
* 3. Vector in java
  * https://www.geeksforgeeks.org/java-util-vector-class-java/
  * It is like ArrayList only, But it is thread safe and synchronized. Here critical section issue will not be there.
* 4. String, StringPools, StringBuffer and StringBuilder
  * YT Link (String literal vs String object) : https://www.youtube.com/watch?v=ykqbCdz6Mk0&ab_channel=TechStack9
  * YT Link (Difference between string, stringBuffer and StringBuilder): https://www.youtube.com/watch?v=poh4e8Uubbo&ab_channel=TechStack9  
* 5. Primitive Data Types and Wrapper Class
  * YT Link : https://www.youtube.com/watch?v=BypnBPwZf0w&t=19s&ab_channel=TechStack9
* 6. Method Overloading
  * In Method overloading method name should be same.
  * Return type should be same (Return type does not play any role in method overloading)
  * Only Parameter type or number of parameter can be different.