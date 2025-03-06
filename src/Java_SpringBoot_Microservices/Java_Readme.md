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
* 7. Write about daemon thread and non-daemon thread
  * https://stackoverflow.com/questions/2213340/what-is-a-daemon-thread-in-java
  * Definition of Daemon (Computing):
    * daemon: d(isk) a(nd) e(xecution) mon(itor) or from de(vice) mon(itor)
      * Definition of Daemon (Computing):
      * A background process that handles requests for services such as print spooling and file transfers, and is dormant when not required.
      * Source: English by Oxford Dictionaries
      * What is Daemon thread in Java?
        Daemon threads can shut down any time in between their flow, Non-Daemon i.e. user thread executes completely.
        Daemon threads are threads that run intermittently in the background as long as other non-daemon threads are running.
        When all of the non-daemon threads complete, daemon threads terminates automatically.
        Daemon threads are service providers for user threads running in the same process.
        The JVM does not care about daemon threads to complete when in Running state, not even finally block also let execute. JVM do give preference to non-daemon threads that is created by us.
        Daemon threads acts as services in Windows.
        The JVM stops the daemon threads when all user threads (in contrast to the daemon threads) are terminated. Hence daemon threads can be used to implement, for example, a monitoring functionality as the thread is stopped by the JVM as soon as all user threads have stopped.* .
  * .
* 8. Write about serialization and non-serialization
  * YT Added, just add the link - https://www.youtube.com/watch?v=Uxhb3IHKMQk&t=164s&ab_channel=LetsMakeAutomationEasy-PradeepNailwal
  * Layman words converting object to store in data, file, memory or db in stream of byte. see yt for more
* 9. Inheritance vs Composition
  * https://stackoverflow.com/questions/2399544/difference-between-inheritance-and-composition
* 10. Aggregation vs Association vs Composition
  * https://stackoverflow.com/questions/14837826/association-vs-aggregation-vs-composition-in-java
  * https://stackoverflow.com/questions/20304116/aggregation-and-composition-in-java-code
* 11. Marker Interface
  * https://stackoverflow.com/questions/58602321/what-is-the-point-of-marker-interface-in-java-and-why-cant-we-go-on-without-the

 
 
## OTHER TOPICS - INTERVIEWBIT PLUS NOTES AND LEARNING WITH PRACTICAL
### JAVA VERSIONS AND LTS
* See link for detail learning - https://medium.com/@a.r.m.monesan_9577/java-8-vs-java-11-vs-java-17-vs-java-21-a-comprehensive-comparison-aa4635f9c3fe
* Java Long Term Support (Will be working for a long time)
  * Example how angular was going very fast from angular 1 to angular 12. Like that java will also go, but in long term support 
  * there will be no depreciation so fast for those versions. They will keep on getting support and security check from oracles 
    * Java 8 (LTS)
    * Java 11 (LTS)
    * Java 17 (LTS)
    * Java 21 (LTS)
* 1. Overview of Java Release Cycle
  * Starting with Java 9, Oracle introduced a new six-month release cycle. 
  * This means a new Java version is released twice a year. 
  * However, Long-Term Support (LTS) versions — such as Java 8, 11, 17, and now 21 — are released every few years and are supported for longer periods.
  * To check there end of support year see in link above.

### ANNOTATIONS IN JAVA
* Link to follow - https://www.linkedin.com/pulse/java-annotations-rahul-ranjan/
* In Layman words - 
  * It was introduced in java 5.
  * Annotations are java constructs which decorate a class, method, field, parameter, variable, constructor, or package.
  * It acts like Metadata attribute to define the class.
    * So to decorate Class we use @Controller (For Controller Class), @Service (For service class), @SpringBootApplication, @Entity, @Component and so on
    * To decorate Method we use @Override, @PostMapping (To make that method as some Post verb)
    * To decorate variable we use @id (To make that variable as primary key in Entity class table)
    * To decorate parameter we use @Nullable (To make sure that parameter can be null as well)
    * And so on.
  * Now proceeding there are three forms of annotations that can be defined in java as follows:
    * Marker Annotations: These are the annotations inside which no variables are declared or defined.
    * Single-value Annotations: These are the annotations inside which only a single variable is declared or defined.
    * Multi-value Annotations: These are the annotations inside which multiple variables of multiple types can be declared and defined.
  * Pros & Cons
    * Pros
      * Readability [All the information is in a single file]
      * Flexibility [When the class changes, no need to modify  at other place]
      * Length [Annotations are much simpler to use.]
    * Cons
     * Annotations that can cause lifecycle mismatches should be avoided.
     * ORM mapping, database configuration, hard coded config for items that may vary between deployment environments.
     * Tightly couple code to a particular library or framework.
  * ..

  
### JAVA 8 - FEATURES
* Interviewbit - https://www.interviewbit.com/blog/java-8-features/
  * 1. FUNCTIONAL INTERFACES AND LAMBDA EXPRESSION
     * FUNCTIONAL INTERFACE
       * Functional Interfaces means only one Abstract Method in Interface, can have many default or static method though
       * So we can create object of this functional interfaces using lambda expression. 
       * Example see in this above link only.
       * java.lang. Runnable is a fantastic example of a functional interface since it has one abstract method, run ().
       * Lambda Expression is used to implement abstract methods in shortcut manners and create object.
       * If we had abstract method as void func(int x, int y)
       * Then to create object using functional interface we need to implement that single abstract method which we do by the help of Lambda expression
       * SomeInterface interfaceObject = (x,y) -> System.out.println(x+y);
       * If abstract method as int func(int x)
       * then 
       * SomeInterface interfaceObject = x -> return x*4;
    * LAMBDA EXPRESSION
      * You may send Lambda Expression as an argument to the “forEach” method, which accepts the Functional Interface as a single parameter.
      *       subList.forEach(sub -> System.out.println(sub));
      * Here sub is a abstract function or say interface abstract method of functional dependency
  * 2. FOREACH METHOD - 
    * To iterate a list or collection (See above lambda example, this is it)
  * 3. OPTIONAL CLASS - 
    * This is used to check null pointer of an object and helps in reducing nullpointer exception 
    * in our code by doing check with their methods in Optional Class which is final class.
    * Example see in the link only mentioned in the above
  * 4. DEFAULT AND STATIC METHODS - Introduced in Java 8
    * In Java 8, you may add non-abstract methods to interfaces, allowing you to create interfaces with method implementation. 
    * To construct interfaces with method implementation, use the Default and Static keywords.
  * 5. ETC ETC.. check in link only.


### JAVA 11 - FEATURES
* Interviewbit - https://www.interviewbit.com/blog/java-11-features/
  * 1. NEW HTTP AND WEB SOCKET CLIENT
  * 2. NESTED CLASSES ATTRIBUTES


### JAVA 17 - FEATURES


### JAVA 21 - FEATURES