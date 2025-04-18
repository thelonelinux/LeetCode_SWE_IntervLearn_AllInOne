# JAVA LEARNING
* Interview level learning core java YT Playlist
  * https://www.youtube.com/watch?v=iBCZFYEZ6hg&list=PLlhM4lkb2sEjtoPRP2AfVGJWFoltwtDdx&ab_channel=SmartProgramming
* For spring related learning check repo : thelonelinux/Spring_Framework_Interv_Learning

## MY LEARNING APPROACH FOR INTERVIEW
### 1. FROM INTERVIEWBIT (PDF attached learn from it)
### 2. FROM GFG (You can go to the link in geeksforgeeks and learn from it)
### 3. PRACTICE CODE AND LEARN
* See Practise code added in this repo in Java folder in this repo only to understand critical topics with code practise
### 4. TODO TOPICS (MY DOUBT TOPICS TO LEARN AND UNDERSTAND IN JAVA)
* Add some important topic below like JVM structure etc mentioned below and learn better by YT


## MY LEARNING (DIFFICULT TOPICS FOR UNDERSTANDING)
### 0. THREADS IN JAVA (RUNNABLE INTERFACE)
* https://www.geeksforgeeks.org/java-threads/

### 1. THREAD-SAFE AND SYNCHRONIZED MEANING (https://www.geeksforgeeks.org/thread-safety-and-how-to-achieve-it-in-java/)
* IN LAYMAN WORDS - Use of synchronized keyword in function to make it work like lock, makes it critical section.
  * Means when that function is called by one thread, then until that function call is completed all other threads goes in pause state.
  * Means when a synchronized function is called by anyone of the thread, then it stops all other thread and once the synchronized function is done
    * other threads re-starts (So this is what we usually do in critical section)
  * So this way we achieve thread safety by making our function as critical section.

* How to Achieve Thread Safety in Java? There are four ways to achieve Thread Safety in Java. These are:
* 1. Using synchronized keyword in function : Synchronization
* Synchronization is the process of allowing only one thread at a time to complete the particular task. It means when multiple threads executing simultaneously, and want to access the same resource at the same time, then the problem of inconsistency will occur. so synchronization is used to resolve  inconsistency problem by allowing only one thread at a time. 
* Synchronization uses a synchronized keyword. Synchronized is the modifier that creates a block of code known as a critical section. 
    * Used in the function name keyword, So that when this function is running, 
    * all other threads will be stopped and allow this function to operate and complete first, Like Critical Section or like lock in C#.
    * So we have function print five numbers. then when two threads call this function, then whichever thread first run this function will first complete it
    * then only next thread will start running.

* 2. Using Volatile Keyword - Used for field modifier.
    * when volatile int is used in thread, then first the int task is completed, and it stops all other threads. so it acts like critical section variable.
* 3. Using Atomic Variable - AtomicInteger class. 
    * It behaves like wrapper integer class but with volatile keyword, So when this is used in thread, first it will get completed, then only other thread will process
* 4. Using Final Keyword

* CONCURRENT HASHMAP (https://www.geeksforgeeks.org/concurrenthashmap-in-java/)
  * This map internally have Synchronized keyword in the function which make it work like lock like as in critical section.
  * https://www.geeksforgeeks.org/how-does-concurrenthashmap-achieve-thread-safety-in-java/
* REMEMBER - There is no lock keyword in java as we have in C#. Here we have synchronized keywork to be used in function.

### 2. JVM, JRE, JDK ARCHITECTURE, JIT, CLASSLOADER WHOLE FLOW LEARN. (https://www.youtube.com/watch?v=CDijVBqEeJ8&ab_channel=BitsAndBytes)
#### 2A. CODE FLOW - FROM CODING TO BYTECODE TO MACHINE CODE (In Layman words)
* Let say we make a HelloWorld.java class
* Then next step is to compile this class. So javac compiler will compile this class and convert it to bytecode HelloWorld.class
* This byte code is executed by JVM.
* So in JVM this bytecode goes in several states and it generates a machine code.
  * JVM Interpret the byte code  and the output will be machine code.
* So Overall Flow is like : Developer Creates class (HelloWorld.java ) => Javac Compiler compiles it to Bytecode (HelloWorld.class) => JVM executes this Bytecode in several steps within JVM and produces Machine code.
#### 2B. JDK JVM JRE (https://www.youtube.com/watch?v=s7UgQ7_1KQY&ab_channel=Telusko)(https://www.youtube.com/watch?v=Q9ccJsqmDbs&ab_channel=SmartProgramming)
* JDK (JAVA DEVELOPMENT KIT)
  * It is development KIT, is used to develop, test and deploy java applications.
  * As a developer we install JDK in our system.
  * It contains 
    * Development Tools and 
    * Runtime Environment (JRE)
  * Development Tools (You can find this tools under JDK/bin folder - all these tools you can find there)
    * java - Used to run the compile java program (bytecode).
    * javac - Used to compile java source code into bytecode.
    * jar - Used to package java classes into  a compressed file.
    * javadoc - Used to generate API documentation from java source code.
    * jdb - Used to debugs java programs during execution.
    * etc
* JRE (JAVA RUNTIME ENVIRONMENT)
  * In side JRE We have JVM. So JVM is part of JRE
  * JVM needs some library to run the code which is provided by JRE.
  * The java Runtime Environment (JRE) is like the stadium where the game is played, 
    * the JRE provides the environment to run java applications, with the necessary libraries and resources, but without the development tools.
  * JRE contains
    * JVM
    * Java package Classes - 
      * Go in Jdk/lib/src/base/java/lang (Here in this folder you will find all the java package class like util. lang. etc)
      * So all these predefined classes are present in JRE
    * Runtime Libraries
      * Same as above as above package class.
  * JRE does not contains Development tools for developing java programs. As here we do code execution. Compilation already done. 
    * Thus it is suitable for end users who just want to run java applications.
    * As from here only bytecode is further proceeds.
    * So JDK is used for Development but JRE is only to execute the java program.
* JVM (JAVA VIRTUAL MACHINE)
  * This is execution Machine present in JRE, 
  * It make use of Libraries file present in JRE and Executes our code.
  * It takes the byte code (from .class file)
  * translates into machine specific code and run on any platform. 
    * So since it translates into machine specific code only for the given bytecode so it makes java platform independent.
    * We only need bytecode. And run it everywhere in windows JVM or Linux JVM or Mac JVM. 
    * They will later convert the byte code to machine code in that machine specific code only so it is platform independent code.
  * VERY VERY VERY IMP
    * JVM is "Platform Dependent" which makes "Java Platform Independent"
    * The JVM is platform-dependent, meaning each platform (Windows, Linux, macOS) has its own specific JVM designed to run Java Code on that platform.
    * This enables Java to be platform-independent, as the same Java code can run on any platform with its respective JVM.
  * JVM Contains
    * Bytecode verifier
    * Memory Area
    * Execution Engine
* NOTES (JDK, JRE, JVM) - https://smartprogramming.in/tutorials/java/jdk-jre-jvm-in-java
* NOTE -
  * C++ Will only run in the machine in which it is compiled - So it is not platform independent. 
    * The bytecode will only run in the same machine in which it is compiled.
  * Whereas java's compiled code (bytecode) can run in any machine. As JVM will run this bytecode and not the machine.
    * And each machine has got it's own dependent JVM. So when you execute that bytecode, JVM will run it. 
    * Hence this makes Java a platform independent language.
#### 2C. JVM ARCHITECTURE
* JVM Mainly divided into three parts
* 1. CLASS LOADER (Here it first receives the bytecode HelloWorld.class file in jvm)
  * CLASS LOADER SUBSYSTEM - 
    * LOADING
      * Bootstrap class loader
        * It is the first class loader that is responsible for loading the core java libraries in the "<JAVA_HOME>/jre/lib/*.jar".
        * It will load all the jar file present in that folder
      * Extension Class loader
        * It is a child class of BootStrap class loader
        * It is responsible of loading all classed from the extension class path in java.
        * Extension class path is : "<JAVA_HOME>/jre/lib/ext".
        * It will load all the jar present in ext folder 
      * Application class loader
        * It is a child class of Extension class loader
        * It is responsible of loading classes from the application classpath.
        * Application class loader dealing with application-specific classes.
    * LINKING
      * Verify (Verification)
        * It checks whether the ".class" file is generated by valid compiler or not
        * If verification fails,  it throws java.lang.VerifyError
      * Prepare (Preparation)
        * JVM allocates memory for class variables and initializes them with default values.
      * Resolve (Resolution)
        * It is the process of replacing the symbolic reference with direct reference to actual memory addresses.
        * Example see in YT only. time 06:06 mins
    * INITIALIZATION
        * 1. All Static variables are assign with value
        * 2. Static block will be executed from top to bottom.
* 2. MEMORY AREA
  * Method Area
    * It stores class level information like class name, method and variable information. Static variables
    * The method area is shared among all the threads running in the JVM. (Not thread safe.)
    * Only one Method area per JVM
    * Note - Method Area, also known as the "Permanent Generation" in older JVM versions (up to java 7) or as the "Metaspace" in java 8 and later.
  * Heap Area
    * It stores objects, arrays, instance variable.
    * The Heap area is shared among all the threads running in the JVM. (Not thread safe.)
    * Only one Heap area per JVM
  * Stack Area
    * It stores local variables, current running methods.
    * For every THREAD, JVM creates one runtime stack
    * Each block of stack is called activation record/stack frame.
    * Each stack frame contains : local variable, frame data and operand stack.
  * PC Registers
    * It stores current execution instruction, once it completes, Automatically update the next PC Register.
    * Each THREAD has separate PC Registers.
  * Native Method Stack
    * Memory used for native method execution
    * It is separate from the java stack to handle native (non-java) code.
    * For every thread separate native stack is created.
* 3. EXECUTION ENGINE
  * INTERPRETER
    * It is responsible to read byte code and interprets into machine code line by line.
    * The problem with interpreter is, it interprets every time even if repeated method called.
      * Which effects the performance.
      * IN LAY MAN WORDS (Very imp) - Same Method it will interpret again and again if it is called multiple times in the code. Which is overhead.
    * To overcome this problem JIT Compiler introduced in 1.1 version. Introduced by Sun microsystems.
  * JIT COMPILER (JUST IN TIME COMPILER)
    * The main purpose of JIT compiler is to improve the performance.
    * It compiles entire byte code and convert into the machine code.
    * Whenever interpreter see repeated method calls JIT Compiler start working on this. Or say interpreter will activate the JIT compiler when it sees repeated methods.
      * So this JIT compiler will compile entire method byte code and convert into the machine code.
    * Profiler is responsible to identify the repeated method calls (Repeated method calls is also called as Hotspot)
    * So the JIT compiler Includes below flow components
      * Intermediate Code Generator
      * Code Optimizer
      * Target Code Generator
      * Machine code / Native Code
      * Profiler
  * OTHER COMPONENTS
    * Garbage Collector
    * Security Manager
    * etc.
* Java Native Interface
  * Execution Engine <=> Java Native Interface (JNI) => Native Method Library
  * JNI interact with the Native Method Library and provides the native method library to Execution engine.
  * In other word you can say, JNI is responsible to provide the native information to JVM
* JVM - Architecture (Full Image Flow of Architecture you can see in YT)



### 3. OOPS CONCEPTS WITH GOOD EXPLAIN EXAMPLE FOR INTERIVEW (https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)
* OOPS (JAVA)
  * OOPS is a programming paradigm which deals with classes and objects
  * Here blue print is Class
#### 3A. FOUR PILLARS OF JAVA OOPS CONCEPTS (https://www.youtube.com/watch?v=LqPl23MTK5o&ab_channel=EngineeringDigest)
##### A1. ENCAPSULATION 
* All class members are stored in one place within the class
* Bundling of data and methods into a single unit. So inside class we bundled them.
* Access modifiers are stated here.
  * Encapsulation also does data hiding :  We can hide data here with private. And later we can set them using getters and setters.

##### A2. INHERITANCE
* Reusing the old class with new methods. Code reusability is achieved.
* Inherits some properties of parent class in child class
* Animal is extended by cat
* Vehicle is extended by car and so on.

##### A3. POLYMORPHISM
* Notes with example -  https://www.geeksforgeeks.org/polymorphism-in-java/
* Polymorphism is an important feature of Java OOPs concept and it allows us to perform multiple operations by using the single name of any method (interface)
* METHOD OVERLOADING (TRICKY INTERVIEW QUESTION) (***Very important to learn for Method Overloading)
  * https://stackoverflow.com/questions/2439782/overload-with-different-return-type-in-java?newreg=cd9c27c0a57e4c008e37b10d5dc95682
  * Why is it not possible to overload a function just by changing the return type? Will that change in a future version of Java? By the way, just for reference, is this possible in C++?
    * You can't do it in Java, and you can't do it in C++.
    * THE RATIANALE IS THAT THE RETURN VALUE ALONE IS NOT SUFFICIENT FOR THE COMPILER TO FIGURE OUT WHICH FUNCTION TO CALL:
    * public int foo() {...}
    * public float foo() {..}
    * ...
    * foo(); // which one?
  * https://www.programiz.com/java-programming/method-overloading
    * Note: The return types of the above methods are not the same.
    * It is because method overloading is not associated with return types.
    * VERY VERY IMP - Overloaded methods may have the same or different return types, but they must differ in parameters.
    * REMEMBER THEY MUST HAVE DIFFERENT PARAMETERS IN TWO METHODS OF SAME METHOD NAME TO BE USED AS METHOD OVERLOADING.
 
* METHOD OVERRIDING (TRICKY INTERVIEW QUESTION)
  * Parent parent = new Parent();
  * Parent parentChild = new Child(); //Means object of Parent but reference of Parent // Here child overriden method will be called if it calls any parent method then.
  * Child childParent = new Parent(); //this will give run time error, as child method not found in parent object
  * Child child = new Child();

##### A4. ABSTRACTION (HIDING IMPLEMENTATION DETAILS) (https://www.geeksforgeeks.org/abstraction-in-java-2/)
* Abstraction in Java is the process of hiding the implementation details and only showing the essential functionality or features to the user.
* In Java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.
  * We can't make objects of abstract class or interface. But we can do if we implement along.
* Abstraction in code example with real-life
  * Let say we have computer class, this class needs hardDisk. So HardDisk has functionality of storing and data management method in it. 
    * Now if we implement this HardDisk with seagate Class, then it will just show us the method name and we will implement it. But still how abstraction is achieved??????
* Abstraction Real-Life Example:
  * Consider a real-life example of a man driving a car. 
  * The man only knows that pressing the accelerator will increase the speed of a car or applying brakes will stop the car, 
  * but he does not know how on pressing the accelerator the speed is actually increasing, 
  * he does not know about the inner mechanism of the car or the implementation of the accelerator, brakes, etc. in the car. 
  * This is what abstraction is.

#### 3(EXTRAS) ABSTRACTION VS ENCAPSULATION (https://stackoverflow.com/questions/742341/difference-between-abstraction-and-encapsulation)
* Encapsulation is the packing of "data" and "functions operating on that data" into a single component and restricting the access to some of the object's components.
* Encapsulation means that the internal representation of an object is generally hidden from view outside of the object's definition.
* Abstraction is a mechanism which represent the essential features without including implementation details.
* Encapsulation:-- Information hiding.
* Abstraction:-- Implementation hiding.
 

### 4. VECTOR IN JAVA (https://www.geeksforgeeks.org/java-util-vector-class-java/)
* It is like ArrayList only, But it is thread safe and synchronized. Here critical section issue will not be there.
* The Vector class implements a growable array of objects. Vectors fall in legacy classes, but now it is fully compatible with collections. 
* It is found in java.util package and implement the List interface.
* Thread-Safe: All methods are synchronized, making it suitable for multi-threaded environments. However, this can lead to performance overhead in single-threaded scenarios.
* Allows Nulls: Can store null elements.
* Enumeration Support: Provides backward compatibility with Enumeration, a legacy way of iterating over elements.
* FEW MORE POINTS about Vector are mentioned below : 
  * They are very similar to ArrayList, but Vector is synchronized and has some legacy methods that the collection framework does not contain.
  * It also maintains an insertion order like an ArrayList. Still, it is rarely used in a non-thread environment as it is synchronized, and due to this, 
    * it gives a poor performance in adding, searching, deleting, and updating its elements.
  * The Iterators returned by the Vector class are fail-fast. In the case of concurrent modification, it fails and throws the ConcurrentModificationException.


### 5. STRING, STRINGBUFFER AND STRINGBUILDER (STRING LITERALS AND STRING POOLS)
#### A. String, String Ojbect, String Literals, String Constant Pool, Heap Memory, Equals of String and (==) of String
* All these I have written in String_Learning_Heap.java class. check there for example and also attached screenshot of demo of how things work there 
* YT Link (String literal vs String object) : https://www.youtube.com/watch?v=ykqbCdz6Mk0&ab_channel=TechStack9
#### B. YT Link (Difference between string, stringBuffer and StringBuilder)
* https://www.youtube.com/watch?v=poh4e8Uubbo&ab_channel=TechStack9  
* Check in interviewbit only Q.34

### 5-01. Immutable vs Final Keyword
* YT Link : https://www.youtube.com/watch?v=JWBqZDy97fw&ab_channel=SmartProgramming
* From the video as I learn in layman word
  * Final => We can't change the reference of this object. It will be assigned only once. (Here reference can't be changed)
  * Immutable => Means we can't change it's value/state. But will create a new object literal and takes that value and assign to it. (Here literal values can't be changed, string literal values can't be changed). So when we concate, we make new concatenated string and re-assign that literal, instead of changing the string literal. that old unconcatenated string literal will remain there.

#### Important Features of String Class (www.smartprogramming.in)
1. String Constant Pool (SCP):- It is special memory location in heap area which stores String Literals.
2. Immutable Objects:- The String objects are immutable which means once String object is created its data or state can't be changed but a new string object is created. Means if you try to change the data of string, like by concatenation then it will create a new string literal with that concatenated string and assign that concatenated literal string to this as new object string literal.
3. + Operator for Strings:- Multiple Strings can be concatinated using + operator.
4. Security:- The parameters used for network connections, database connection URLs, usernames/ passwords, etc are represented in Strings. If it was mutable, these parameters could be changed easily.
5. Class loading:- String is used as an arguments for class loading. If mutable, it could result in the wrong class being loaded (because mutable objects change their state).
6. Synchronization and Concurrency:- Making String immutable automatically makes them thread safe thereby solving the synchronization issues.
7. Memory management:- When compiler optimizes our String objects, it seems that if two objects have the same value (a =" test", and b =" test") and thus we need only one string object (for both a and b, these two will point to the same object).

#### String Literal vs String object 
* (https://www.geeksforgeeks.org/string-initialization-java-string-literal-vs-string-object/)

### 5-02. Equals vs (==) operator
* YT Link : https://www.youtube.com/watch?v=i7vYjvJOIiw&t=667s&ab_channel=SmartProgramming

### 6. PRIMITIVE DATA TYPES AND WRAPPER CLASS. (WHY WE NEED WRAPPER IF WE ALREADY HAVE PRMITIVE, AUTOBOXING AND UNBOXING)
* YT Link : https://www.youtube.com/watch?v=BypnBPwZf0w&t=19s&ab_channel=TechStack9
* For notes check this : https://www.geeksforgeeks.org/wrapper-classes-java/
* We need wrapper class for our primitive types to convert primitive to object. so it can be later used by collection like list to store.
  * As list or other collections only stores object.
  * Also this objects can be synchronized and used in threads so we need the wrapper of our primitive types.
* Unboxing : Convert object Integer to prmitive int
* Autoboxing : Converting prmitive int to Integer object. more see in notes
* Primitive data types default values is something see in notes, for wrapper class it is null.
* Prmivtive are mutable and stored in stack. Wrapper are immutable and stored in heap.

### 7. DAEMON THREAD AND NON-DEAMON THREAD
* YT : https://www.youtube.com/watch?v=zdYPQH7aR8k&ab_channel=NareshiTechnologies
* In Layman : 
  * Non daemon thread is like what you see in the frontend whatever is loading in the page. 
  * Daemon thread is one which is loading the services in the background and helping non daemon thread to full fill its task. 
  * Hence once the non-daemon thread is fully loaded. It won't need the help of deamon thread. 
  * Hence JVM will stop daemon thread. So this is how it is in simple language. You can see YT above for details.
* For code level understanding see this : https://www.geeksforgeeks.org/daemon-thread-java/

* IN DEPTH STACKOVERFLOW BELOW
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

### 8. SERIALIZATION AND NON-SERIALIZATION (IGNORE FOR NOW - NOT USUALLY ASKED IN JAVA INTERVIEWS)
* YT Added, just add the link - https://www.youtube.com/watch?v=Uxhb3IHKMQk&t=164s&ab_channel=LetsMakeAutomationEasy-PradeepNailwal
* Layman words converting object to store in data, file, memory or db in stream of byte. see yt for more

### 9. INHERITANCE VS COMPOSITION (IGNORE FOR NOW - NOT ASKED IN INTERVIEW MOSTLY)
* https://stackoverflow.com/questions/2399544/difference-between-inheritance-and-composition

### 10. AGGREGATION VS ASSOCIATOIN VS COMPOSITION (IGNORE FOR NOW - NOT ASKED IN INTERVIEW MOSTLY)
* https://stackoverflow.com/questions/14837826/association-vs-aggregation-vs-composition-in-java
* https://stackoverflow.com/questions/20304116/aggregation-and-composition-in-java-code

### 11. MARKER INTERFACE (JUST IGNORE)
* https://stackoverflow.com/questions/58602321/what-is-the-point-of-marker-interface-in-java-and-why-cant-we-go-on-without-the

### 12. DATA STRUCTURE : COLLECTIONS FRAMEWORK IN JAVA - LIST, SET, QUEUE. MAP IS NOT PART OF COLLECTION
#### A. DATA STRUCTURE IN JAVA (https://www.youtube.com/watch?v=Od-4hMfBkMI&list=PLlhM4lkb2sEiOcuH1g-CUuU288qmMNpyj&ab_channel=SmartProgramming)
* Complete collection playlist yt video
* Java has provided 8 data types. boolean, int, long, etc
* Efficient storing of data is called data structures. Time and space algorithm comes up in the picture here.

#### B. COLLECTION (JAVA.UTIL PACKAGE)
* Collection hirarchy includes set, list and queue. Map is not part of collection hierarchy
* https://www.youtube.com/watch?v=cXeMxHBbatQ&list=PLlhM4lkb2sEiOcuH1g-CUuU288qmMNpyj&index=8&ab_channel=SmartProgramming

##### B1. LIST INTERFACE : ARRAYLIST CLASS AND VECTOR CLASS (IMPLEMENTS LIST INTERFACE, LIST INTERFACE EXTENDS COLLECTION INTERFACE)
* List interface is implemented by ArrayList, LinkedList, Vector class. Vector class is further extended by Stack class.
* ArrayList is created on the basis of resizable or growable Array. Internally it uses Array only.
* Arrays size can't be increased or decreased, but we can increase or decrease the size of ArrayList.
* ArrayList stored data in underlying Array in index based, means in sequence like we do in array.
* ArrayList can store heterogenous data types.
* Can store duplicate elements, and also can store any number of null.
* Doesnot follow sorting order
* Not synchronised, but Vectors are synchronised. Vector is like ArrayList only, but it is thread safe unlike ArrayList.
* ARRAYLIST VS VECTOR
  * https://www.youtube.com/watch?v=EdwHigOS8bE&list=PLlhM4lkb2sEiOcuH1g-CUuU288qmMNpyj&index=14&ab_channel=SmartProgramming
  * Vectors are synchronized means - Methods in vectors are synchronized, whereas ArrayList are not synchronized
  * So Vector is thread-safe, and since it stops other thread due to synchronization, then overhead comes up and this make vector slower than arrayList
  * ArrayList new_capacity : (old_capacity * 3) / 2 + 1
  * Vector new_capacity : old_capacity * 2

##### B2. SET INTERFACE : HASHSET AND TREESET CLASS
* SET Interface is implemented by HashSet class. HashSet is further extended by LinkedHashSet class.
* SET Interface is extended by SortedSet interface, which is further extended by NavigableSet interface and this is implemented by TreeSet class.
* HASHSET
  * Underlying data structure of HashSet is hashtable. 
    * So HashSet in backed by Map (see #C below to learn more about map and hashtable)
  * Here data are not stored in indexed basis, not stored in sequence, But it store the elements according to their hashcode values. 
    * hashcode is unique integer.
  * NOTE : Hashtable is just an Array of Linkedlist.
  * Also the values we add in our HashSet is stored in the backend as Key for Map. So we can't have duplicate key. Also key can't have multiple null, 
    * Hence HashSet don't store duplicate and multiple null value.
  * Can store heterogeneous values.
  * Does not store data in sorted order.
  * HashSet are non-synchronized data structure.
* TREESET
  * Underlying data structure is Balanced Tree.
  * Not an indexed based data structure. Also, does not follows the insertion order, means retrieving the element in same sequence you inserted.
  * It follows the sorting order. Gets data in sorted order.

##### B3. QUEUE INTERFACE : ENQUEU (IGNORE FOR NOW)
* .



#### C. MAP : HASHMAP, HASHTABLE CLASS
* We have 4 classes which implement Map Interface : HashMap, HashTable, LinkedHashMap, TreeHashMap
* Difference between HashMap and HashTable and more (https://www.youtube.com/watch?v=z5tZ0Zb5rJQ&ab_channel=Telusko)
* Map is not part of Collection

##### C1. HASHTABLE CLASS INTERNAL WORKING
* https://www.youtube.com/watch?v=YhQJdRnyO7A&list=PLlhM4lkb2sEiOcuH1g-CUuU288qmMNpyj&index=25&ab_channel=SmartProgramming
* HashTable make use of hashtable data structure to make store the data. hashtable is array of linkedlist.
* hashtable has concept of hashing to store the data and during hash collision linkedlist comes into play.
* See more in YT.
* HashTable initial capacity is 11.

##### C2. HASHMAP CLASS AND ITS INTERNAL WORKING
* Underlying data structure is hashtable. It stores data in the basis of hash code.
* It stores the value in key value pair. for key it generates hash code integer and stores in the hashtable bucket.
* hashtable is Array of LinkedList.
* Key can't be duplicate. Key can have only one null value. Values can be duplicate and can store any number of null values.
* Each Key value pair is called Entry. Entry is internal interface in Map interface. Entry is used to get these key value pairs.
* Hashmap is not synchronized.

### 13. SINGLETON DESIGN PATTERN - REAL TIME EXAMPLE (https://www.programiz.com/java-programming/singleton)
* Use of Singleton in Java
* Singletons can be used while working with databases. 
* They can be used to create a connection pool to access the database while reusing the same connection for all the clients. For example,




 

------------------------

## OTHER TOPICS - INTERVIEWBIT PLUS NOTES AND LEARNING WITH PRACTICAL
### 1. JAVA VERSIONS AND LTS
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

### 2. ANNOTATIONS IN JAVA 
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
  * How to create custom annotations : https://www.geeksforgeeks.org/how-to-create-your-own-annotations-in-java/?ref=ml_lbp
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

  
### 3. JAVA 8 - FEATURES
* Interviewbit - https://www.interviewbit.com/blog/java-8-features/
  * 1. FUNCTIONAL INTERFACES AND LAMBDA EXPRESSION
     * FUNCTIONAL INTERFACE
       * Functional Interfaces means only one Abstract Method in Interface, can have many default or static method though
       * So we can create object of this functional interfaces using lambda expression to implement abstract methods
       * Example see in this above link only.
       * java.lang. Runnable is a fantastic example of a functional interface since it has one abstract method, run ().
       * Lambda Expression is used to implement abstract methods in shortcut manners and create object.
       * If we had abstract method as void func(int x, int y)
       * Then to create object using functional interface we need to implement that single abstract method which we do by the help of Lambda expression
       * SomeInterface interfaceObject = (x,y) -> System.out.println(x+y);
       * An anonymous function may be defined as a Lambda Expression (or function) (a function with no name and an identifier). 
         * Lambda Expressions are defined precisely where they are required, often as a parameter to another function.
       * If abstract method as int func(int x)
       * then 
       * SomeInterface interfaceObject = x -> return x*4;
    * LAMBDA EXPRESSION
      * You may send Lambda Expression as an argument to the “forEach” method, which accepts the Functional Interface as a single parameter.
      *       subList.forEach(sub -> System.out.println(sub));
      * Here sub is a abstract function or say interface abstract method of functional dependency
  * 2. forEach() Method In Iterable Interface 
    * To iterate a list or collection (See above lambda example, this is it)
    * n Java 8, the Java.lang interface now supports a “forEach” function. Iterable that can iterate over the collection’s items.
  * 3. OPTIONAL CLASS - 
    * This is used to check null pointer of an object and helps in reducing nullpointer exception 
    * in our code by doing check with their methods in Optional Class which is final class.
    * Example see in the link only mentioned in the above
  * 4. DEFAULT AND STATIC METHODS IN INTERFACE - Introduced in Java 8
    * In Java 8, you may add non-abstract methods to interfaces, allowing you to create interfaces with method implementation. 
    * To construct interfaces with method implementation, use the Default and Static keywords.
  * 5. ETC ETC.. check in link only.


### JAVA 11 - FEATURES
* Interviewbit - https://www.interviewbit.com/blog/java-11-features/
  * 1. NEW HTTP AND WEB SOCKET CLIENT
  * 2. NESTED CLASSES ATTRIBUTES


### JAVA 17 - FEATURES

### JAVA 21 - FEATURES