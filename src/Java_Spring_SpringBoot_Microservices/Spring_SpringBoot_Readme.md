# SPRINGBOOT LEARNING
* First learn basic spring concepts before going to learn spring boot, because core is important to understand in depth.

## MY LEARNING APPROACH FOR INTERVIEW
### 1. FROM INTERVIEWBIT
* Get/download pdf from interview bit and learn

### 2. FROM GFG INTERVIEWBIT
* Get the link and learn from there


### 3. PRACTICE CODE AND LEARN
* See the github edureka java springboot microservice learning and how different java code is written to build microservice application


## MY LEARNING (SPRING FRAMEWORK, CORE TO SPRING BOOT)
* FOR ALL SPRING LEARNING PLEASE CHECK THIS FIRST - IT INCLUDES MY LEARNING AND PRACTISE  AND YT LINKS - https://github.com/thelonelinux/Spring_Framework_Interv_Learning
* https://www.geeksforgeeks.org/spring-boot/
* Parallelly do code and learn
### MAVEN LEARNING
  * Maven is a build tool, like gradle. 
  * Let say in spring or springboot project we need to use SQL connector, so for that we need Sql connector jar files to use in our project.
  * So all this download task is done by maven build tool.
  * So this is what main task for maven. It will also take care of versions and download accordingly.
  * artifactID and groupId is like finding that dependency by unique project identification.
  * Make sure you are connected with the internet when downloading the jar file from remote repository.
  * first Maven search in your local repository, if not found in local then it will look to remote repository.
  * YT link : https://www.youtube.com/watch?v=dqJanLvjDqc&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=3&ab_channel=Telusko
### HOW TO CREATE A MAVEN PROJECT IN INTELLIJIDEA OR ECLIPSE, AND LATER A SPRING PROJECT FROM IT
  * YT link : https://www.youtube.com/watch?v=uEYjXpMDJiU&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=3&ab_channel=Telusko
  * This is make sure you have pom.xml file.
  * In intellijIdea, just create new project, chose maven archetype and select archetype, it will create a project wiht pom.xml
  * for spring boot, there only you have to chose spring boot when creating new project, not for spring core, framework project.
### SPRING FRAMEWORK LEARNING (JUST SEE YT LINKS PLAYLIST OF SPRING FRAMEWORK, YOU WILL UNDERSTAND ALL AND YOU NOT NEED TO DO ANY OTHER LEARNING, THEY ARE ENOUGH)
* Check other repo(Spring_Framework_IntervLearning for indepth Spring framework, core and mvc learning with code)
  * YT Link Follow Part 1 (Most Important) - https://www.youtube.com/watch?v=JNeAwX_MOcU&list=PLsyeobzWxl7rFkYFysfTwBu1JBPaNNDrk&index=1&ab_channel=Telusko
    * This will give you complete idea of Spring Framework, 
      * Project Creation in IntellijIdea, Dependency Injection, What is bean, Bean Factory and ApplicationContext
      * BeanFactory being deprecated, How to make object beans in different ways.
      * Very importantly learn this, you will understand whole concept of core Spring Framework
  * YT Link follow Part 2 (Most Important) - https://www.youtube.com/watch?v=wteFNBKs8oU&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=2&ab_channel=LazyProgrammer
    * In this YT link, You will bit more about Spring core, beans, with good theory explanation
  * but for once learn this - https://www.geeksforgeeks.org/introduction-to-spring-framework/
  * 
  * DEPENDENCY INJECTION 
    * THREE TYPES
      * VIA CONSTRUCTOR
      * VIA SETTER METHOD
      * VIA FIELD INJECTION (USING @AUTOWIRED). Like a Data Member of Class.
  * INVERSION OF CONTROL CONTAINER (BEAN CONTAINERS) 
    * In Lay Man words - https://www.youtube.com/watch?v=8xBF3RUMQfU&list=PLOktGWstEbloSPMJ1unePUM6RBRq5PITf&index=4&ab_channel=LazyProgrammer
    * (Very Very Imp - As we do in IOM also for mapper class as you know)In this YT, You can see real life example to understand it's use case of why object created by programmer is tight coupled and issue we face.
      * Inversion of control is a core component of Spring Framework
      * (Very Very Imp) It is a design pattern in which the creation of object is inverted - So now instead of programmer to create the object, it will be done by framework itself.
      * It is independent of languages.
      * It describes the way in which object should be created
      * Control of object creation is inverted. We do this to achieve loose-coupling
      * This is implemented using Dependency injection. Object are created in Spring Container or Bean factory for say in via xml or via configuration class annotation.
      * When we use dependency injection to inject and create those beans rather by using new operator. It will find bean/object and create object for ourselves.
    * TWO TYPES
      * BEAN FACTORY
      * APPLICATION CONTEXT
  * WHY SPRING BOOT
    * We don't have to all these spring framework, it will remove all these boiler plate code
    * And help programmer to directly begin with main task
### TABLE OF CONTENT (SPRING BOOT LEARNING)
* 1. Spring Boot – Basics
     Introduction to Spring Boot
     7 Major Reasons to Choose Spring Boot For Microservices Development
     Best Way to Master Spring Boot – A Complete Roadmap
     Difference between Spring and Spring Boot
     Difference between Spring MVC and Spring Boot
     How to Create a Simple Spring Boot Project?
     How to Run Spring Boot Application?
* 2. Spring Boot – Software Setup and Configuration (STS/Eclipse/IntelliJ)
     How to Download and Install Spring Tool Suite (Spring Tools 4 for Eclipse) IDE?
     How to Create and Setup Spring Boot Project in Spring Tool Suite?
     How to Create a Spring Boot Project with IntelliJ IDEA?
     How to Create and Setup Spring Boot Project in Eclipse IDE?
     How to Run Your First Spring Boot Application in IntelliJ IDEA?
     How to Run Your First Spring Boot Application in Spring Tool Suite?
* 3. Prerequisite (Spring Core Concepts)
     In this section, we will learn some of the essential Spring Core Concepts as prerequisites. If you already know these concepts then you can skip this section.
     Understanding Inversion of Control with Example
     Spring – BeanFactory
     Spring – ApplicationContext
     Spring – Difference Between BeanFactory and ApplicationContext
     Spring Dependency Injection with Example
     Spring – Difference Between Inversion of Control and Dependency Injection
     Spring – Injecting Objects By Constructor Injection
     Spring – Dependency Injection by Setter Method
     Spring – Injecting Objects by Setter Injection
     Spring – Injecting Literal Values By Setter Injection
     Spring – Injecting Literal Values By Constructor Injection
     Bean life cycle in Java Spring
     Custom Bean Scope in Spring
     How to Create a Spring Bean in 3 Different Ways?
     Spring – IoC Container
     Spring – Autowiring
     Singleton and Prototype Bean Scopes in Java Spring
     How to Configure Dispatcher Servlet in web.xml File?
* 4. Spring Boot Core
     Spring Boot Architecture
     Spring Boot Annotations
     Spring Boot Actuator
     How to create a basic application in Java Spring Boot
     Best Practices For Structuring Spring Boot Application
     Spring Boot – Hello World Example
     How to Create a Spring Boot Project in Spring Initializr and Run it in IntelliJ IDEA?
     Dynamic Dropdown From Database using Spring Boot
     How to Get the Body of Request in Spring Boot?
     How to Make Put Request in Spring Boot?
     Spring Boot – Code Structure
     Spring Boot – RestTemplate
     Spring Boot – Change Port
     Spring Boot – Scheduling
     Spring Boot – Sending Email via SMTP
     Spring Boot – Transaction Management Using @Transactional Annotation
     Spring Boot – Map Entity to DTO using ModelMapper
     Spring Boot – Validation using Hibernate Validator
     Spring Boot – Cache Provider
     Spring Boot – Logging
     Spring Boot – Auto-configuration
     Spring Boot – EhCaching
     Spring Boot – File Handling
     Spring Boot – Service Class Example for Displaying Response Codes and Custom Error Codes
     Spring Boot – Create a Custom Auto-Configuration
     Spring Boot – Starter Test
     Spring Boot – Exception Handling
     Spring Boot – Project Deployment Using Tomcat
     Spring Boot – Packaging
     Spring Boot – Thymeleaf with Example
     Spring Boot – Multi-Module Project
     Spring Boot – DevTools
     Spring Boot – Dependency Management
     Spring Boot – Caching
     Spring Boot – Starter Web
     Spring Boot – application.yml/application.yaml File
     Spring Boot – Application Properties
     Spring Boot – Starter Parent
     Spring Boot – Customize the Jackson ObjectMapper
     Spring Boot – Starters
     Spring Boot – Difference Between @Service Annotation and @Repository Annotation
     How to Make a Simple RestController in Spring Boot?
     How to Implement Simple Authentication in Spring Boot?
     What is PathVariable in the Spring Boot?
     Validation in Spring Boot
     What is Command Line Runner Interface in Spring Boot?
     Difference Between Spring Boot Starter Web and Spring Boot Starter Tomcat
     How to Dockerize a Spring boot application with Maven
     Creating a Spring Boot App using Dockerfile
     How to encrypt passwords in a Spring Boot project using Jasypt
     Upload Multiple Files in Spring Boot using JPA, Thymeleaf, Multipart
     How to Implement One-to-Many Mapping in Spring Boot?
     Deploying Spring Boot Application with MySQL Database on Azure
     How to Call or Consume External API in Spring Boot?
     How to Create Todo List API using Spring Boot and MySQL?
     How to Make a Project Using Spring Boot, MySQL, Spring Data JPA, and Maven?
* 5. Spring Boot with REST API
     Spring Boot – Introduction to RESTful Web Services
     Spring Boot – REST Example
     How to create a REST API using Java Spring Boot
     Easiest Way to Create REST API using Spring Boot
     How to Make a Simple RestController in Spring Boot?
     JSON using Jackson in REST API Implementation with Spring Boot
* 6. Spring Boot with Database and Data JPA
     Spring Boot – H2 Database
     Spring Boot – JDBC
     Advantages of Spring Boot JDBC
     Spring Boot – CRUD Operations
     Spring Boot – Integrating Hibernate and JPA
     Spring Boot – MongoRepository with Example
     Spring Boot – JpaRepository with Example
     Spring Boot – CrudRepository with Example
     Spring Boot – Difference Between CrudRepository and JpaRepository
     Spring Boot – CRUD Operations using MongoDB
     How to Connect MongoDB with Spring Boot?
     Spring Boot – Spring Data JPA
     Spring Boot – CRUD Operations using MySQL Database
     Spring Boot Integration With MySQL as a Maven Project
     Spring Boot Integration With MongoDB as a Maven Project
     Spring Boot Integration With PostgreSQL as a Maven Project
     Spring Boot JPA Sample Maven Project With Query Methods
     How to Make a Project Using Spring Boot, MySQL, Spring Data JPA, and Maven?
* 7. Spring Boot with Microservices
     Java Spring Boot Microservices Sample Project
     Different Ways to Establish Communication Between Spring Microservices
* 8. Spring Boot with Kafka
     Spring Boot Kafka Producer Example
     Spring Boot Kafka Consumer Example
     Spring Boot – How to consume JSON messages using Apache Kafka
     Spring Boot – How to consume string messages using Apache Kafka
     Spring Boot – How to publish String messages on Apache Kafka
     Spring Boot – How to publish JSON messages on Apache Kafka
     Spring Boot – Create and Configure Topics in Apache Kafka
     Spring Boot – Consume JSON Object From Kafka Topics
     Spring Boot – Start/Stop a Kafka Listener Dynamically
     Message Compression in Apache Kafka using Spring Boot
     Spring Boot – Consume Message Through Kafka, Save into ElasticSearch, and Plot into Grafana
* 9. Spring Boot with AOP
     How to Implement AOP in Spring Boot Application?
     Spring Boot – AOP(Aspect Oriented Programming)
     Spring Boot – Cache Provider
     Spring Boot – AOP Around Advice
     Spring Boot – Difference Between AOP and OOP
     Spring Boot – Difference Between AOP and AspectJ
     Spring Boot – AOP After Throwing Advice
     Spring Boot – AOP After Returning Advice
     Spring Boot – AOP After Advice
     Spring Boot – AOP Before Advice
* 10. Spring Boot Testing
      Unit Testing in Spring Boot Project using Mockito and Junit
      How to Test Spring Boot Project using ZeroCode?
      Spring Boot MockMVC Testing with Example Project
      Spring Boot MockMVC Example
* 11. Spring Boot Features
      Web Development
      Spring Application
      Application events and listeners
      Admin features
      Externalized Configuration
      Properties Files
      YAML Support
      Type-safe Configuration
      Logging
      Security
* 12. Spring Boot Advantages
      It generates standalone Spring applications that are launched with the Java -jar command.
      It easily tests web applications using several Embedded HTTP servers like as Tomcat, Jetty, and others. We don’t need to distribute WAR files.
      It provides ‘starter’ POMs with strong opinions to help us simplify our Maven settings.
      It includes features that are ready for production, such as metrics, health checks, and externalised settings.
      There is no need for XML configuration.
      It includes a command-line utility for designing and testing Spring Boot applications.
      It provides a number of plug-ins.
      It also minimizes writing multiple boilerplate codes, XML configuration, and annotations.
      It boosts productivity while decreasing development time.
* 13. Limitations of Spring Boot
      While Spring Boot is powerful, it has some drawbacks to consider:
      It can be tricky to learn at first, especially for beginners.
      It may use more memory and take longer to start compared to simpler frameworks.
      Its conventions can restrict customization options for specific needs.
      Managing multiple microservices can get complicated.
      Upgrading or integrating with certain tools may be tricky.
      Applications built with Spring Boot can be larger to deploy.
* 14. Conclusion
    You’ve made it through our Spring Boot tutorial, and now you have a solid grasp of essential concepts like dependency injection, 
    Spring Boot starters, and application configuration. With these new skills, you’re ready to build and deploy efficient, scalable Java applications.
    Spring Boot simplifies the development process, whether you’re creating microservices, RESTful web services, or enterprise applications. 
    Keep exploring the vast Spring Boot ecosystem, stay active in the developer community, and apply what you’ve learned to real-world projects.