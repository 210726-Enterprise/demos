# Enterprise Play Book

- [Enterprise Play Book](#enterprise-play-book)
  - [Core Java](#core-java)
    - [OOP Concepts](#oop-concepts)
    - [Data Structures](#data-structures)
    - [Exceptions](#exceptions)
    - [Functional Interfaces and Lambda Expressions](#functional-interfaces-and-lambda-expressions)
    - [Streams](#streams)
    - [Multithreading](#multithreading)
    - [Reflection API](#reflection-api)
    - [Servlet API](#servlet-api)
  - [Testing](#testing)
    - [JUnit](#junit)
    - [Mockito](#mockito)
  - [SQL](#sql)
    - [RDB Basics](#rdb-basics)
      - [SQL Sublanguages](#sql-sublanguages)
      - [Database Objects](#database-objects)
    - [Joins](#joins)
    - [Functions/Procedures](#functionsprocedures)
    - [Constraints](#constraints)
    - [Relationships](#relationships)
    - [Normalization](#normalization)
  - [Spring Projects](#spring-projects)
    - [Spring Core](#spring-core)
    - [Spring MVC](#spring-mvc)
    - [Spring Boot](#spring-boot)
    - [Spring Data](#spring-data)
    - [Spring Security](#spring-security)
  - [Web](#web)
    - [HTTP](#http)
      - [HTTP Verbs](#http-verbs)
      - [Status Codes](#status-codes)
    - [REST](#rest)
      - [Guiding Principles](#guiding-principles)
      - [Richardson Maturity Model](#richardson-maturity-model)

## Core Java

### [OOP Concepts](https://stackify.com/oops-concepts-in-java/)

- Abstraction.
  - Abstraction means using simple things to represent complexity. We all know how to turn the TV on, but we don’t need to know how it works in order to enjoy it. In Java, abstraction means simple things like objects, classes, and variables represent more complex underlying code and data. This is important because it lets avoid repeating the same work multiple times.
- Encapsulation.
  - This is the practice of keeping fields within a class private, then providing access to them via public methods. It’s a protective barrier that keeps the data and code safe within the class itself. This way, we can re-use objects like code components or variables without allowing open access to the data system-wide.
- Inheritance.
  - This is a special feature of Object Oriented Programming in Java. It lets programmers create new classes that share some of the attributes of existing classes. This lets us build on previous work without reinventing the wheel.
- Polymorphism.
  - This Java OOP concept lets programmers use the same word to mean different things in different contexts. One form of polymorphism in Java is method overloading. That’s when different meanings are implied by the code itself. The other form is method overriding. That’s when the different meanings are implied by the values of the supplied variables. See more on this below.

### [Data Structures](https://www.mygreatlearning.com/blog/data-structures-using-java/)

- Arrays
  - Description
    - Linear Data Structure
    - Elements are stored in contiguous memory locations
    - Can access elements randomly using index
    - Stores homogeneous elements i.e, similar elements
    - Syntax:
    - Array declaration
    - datatype varname []=new datatype[size];
    - datatype[] varname=new datatype[size];
    - Can also do declaration and initialization at once
      - Datatype varname [] = {ele1, ele2, ele3, ele4};
  - Advantages
    - Random access
    - Easy sorting and iteration
    - Replacement of multiple variables
  - Disadvantages
    - Size is fixed
    - Difficult to insert and delete
    - If capacity is more and occupancy less, most of the array gets wasted
    - Needs contiguous memory to get allocated
  - Applications
    - For storing information in a linear fashion
    - Suitable for applications that require frequent searching
- Linked List
  - Description
    - Linear Data Structure
    - Elements can be stored as per memory availability
    - Can access elements on linear fashion only
    - Stores homogeneous elements i.e, similar elements
    - Dynamic in size
    - Easy insertion and deletion
    - Starting element or Node is the key which is generally termed as head.
  - Advantages
    - Dynamic in size
    - No wastage as capacity and size is always equal
    - Easy insertion and deletion as 1 link manipulation is required
    - Efficient memory allocation
  - Disadvantages
    - If head Node is lost, the linked list is lost
    - No random access possible
  - Applications
    - Suitable where memory is limited
    - Suitable for applications that require frequent insertion and deletion
- Stack
  - Description
    - Linear Data Structures using Java
    - Follows LIFO: Last In First Out
    - Only the top elements are available to be accessed
    - Insertion and deletion takes place from the top
    - Eg: a stack of plates, chairs, etc
    - 4 major operations:
      - push(ele) – used to insert element at top
      - pop() – removes the top element from stack
      - isEmpty() – returns true is stack is empty
      - peek() – to get the top element of the stack
    - All operation works in constant time i.e, O(1)
  - Advantages
    - Maintains data in a LIFO manner
    - The last element is readily available for use
    - All operations are of O(1) complexity
  - Disadvantages
    - Manipulation is restricted to the top of the stack
    - Not much flexible
  - Applications
    - Recursion
    - Parsing
    - Browser
    - Editors
- Queue
  - Description
    - Linear Data Structure
    - Follows FIFO: First In First Out
    - Insertion can take place from the rear end.
    - Deletion can take place from the front end.
    - Eg: queue at ticket counters, bus station
    - 4 major operations:
      - enqueue(ele) – used to insert element at top
      - dequeue() – removes the top element from queue
      - peekfirst() – to get the first element of the queue
      - peeklast() – to get the last element of the queue
    - All operation works in constant time i.e, O(1)
  - Advantages
    - Maintains data in FIFO manner
    - Insertion from beginning and deletion from end takes O(1) time
  - Applications
    - Scheduling
    - Maintaining playlist
    - Interrupt handling
- Binary Tree
  - Description
    - Hierarchical Data Structure
    - Topmost element is known as the root of the tree
    - Every Node can have at most 2 children in the binary tree
    - Can access elements randomly using index
    - Eg: File system hierarchy
    - Common traversal methods:
      - preorder(root) : print-left-right
      - postorder(root) : left-right-print
      - inorder(root) : left-print-right
  - Advantages
    - Can represent data with some relationship
    - Insertion and search are much efficient
  - Disadvantages
    - Sorting is difficult
    - Not much flexible
  - Applications
    - File system hierarchy
    - Multiple variations of the binary tree have a wide variety of applications
- Binary Search Tree
  - Description
    - Binary tree with the additional restriction
    - Restriction:
      - The left child must always be less than the root node
      - The right child must always be greater than the root node
    - Insertion, Deletion, Search is much more efficient than a binary tree
  - Advantages
    - Maintains order in elements
    - Can easily find the min and max Nodes in the tree
    - Inorder traversal gives sorted elements
  - Disadvantages
    - Random access not possible
    - Ordering adds complexity
  - Applications
    - Suitable for sorted hierarchical data
- Graph
  - Description
    - Basically it is a group of edges and vertices
    - Graph representation
      - G(V, E); where V(G) represents a set of vertices and E(G) represents a set of edges
    - The graph can be directed or undirected
    - The graph can be connected or disjoint
  - Advantages
    - finding connectivity
    - Shortest path
    - min cost to reach from 1 pt to other
    - Min spanning tree
  - Disadvantages
    - Storing graph(Adjacency list and Adjacency matrix) can lead to complexities
  - Applications
    - Suitable for a circuit network
    - Suitable for applications like Facebook, LinkedIn, etc
    - Medical science

### [Exceptions](https://www.tutorialspoint.com/java/java_exceptions.htm)

An exception (or exceptional event) is a problem that arises during the execution of a program. When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.

- Checked Exceptions
  - A checked exception is an exception that is checked (notified) by the compiler at compilation-time, these are also called as compile time exceptions. These exceptions cannot simply be ignored, the programmer should take care of (handle) these exceptions.
- Unchecked Exceptions
  - An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.
- Errors
  - These are not exceptions at all, but problems that arise beyond the control of the user or the programmer. Errors are typically ignored in your code because you can rarely do anything about an error. For example, if a stack overflow occurs, an error will arise. They are also ignored at the time of compilation.

### [Functional Interfaces and Lambda Expressions](https://www.baeldung.com/java-8-functional-interfaces)

- Lambda Expressions
  - Java 8 brought a powerful new syntactic improvement in the form of lambda expressions. A lambda is an anonymous function that we can handle as a first-class language citizen. For instance, we can pass it to or return it from a method.
  - Before Java 8, we would usually create a class for every case where we needed to encapsulate a single piece of functionality. This implied a lot of unnecessary boilerplate code to define something that served as a primitive function representation.
- Functional Interfaces
  - It's recommended that all functional interfaces have an informative @FunctionalInterface annotation. This clearly communicates the purpose of the interface, and also allows a compiler to generate an error if the annotated interface does not satisfy the conditions.
  - Any interface with a SAM(Single Abstract Method) is a functional interface, and its implementation may be treated as lambda expressions.
  - Note that Java 8's default methods are not abstract and do not count; a functional interface may still have multiple default methods.

### [Streams](https://www.geeksforgeeks.org/stream-in-java/)

- Introduced in Java 8, the Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
  The features of Java stream are:
  - A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
  - Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
  - Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.
- Stream Operations
  - Intermediate
    - map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
      > List number = Arrays.asList(2,3,4,5);<br>
      > List square = number.stream().map(x->x\*x).collect(Collectors.toList());
    - filter: The filter method is used to select elements as per the Predicate passed as argument.
      > List names = Arrays.asList("Reflection","Collection","Stream"); <br>
      > List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
    - sorted: The sorted method is used to sort the stream.
      > List names = Arrays.asList("Reflection","Collection","Stream");<br>
      > List result = names.stream().sorted().collect(Collectors.toList());
  - Terminal
    - collect: The collect method is used to return the result of the intermediate operations performed on the stream.
      > List number = Arrays.asList(2,3,4,5,3);<br>
      > Set square = number.stream().map(x->x\*x).collect(Collectors.toSet());
    - forEach: The forEach method is used to iterate through every element of the stream.
      > List number = Arrays.asList(2,3,4,5);<br>
      > number.stream().map(x->x\*x).forEach(y->System.out.println(y));
    - reduce: The reduce method is used to reduce the elements of a stream to a single value.The reduce method takes a BinaryOperator as a parameter.
      > List number = Arrays.asList(2,3,4,5);<br>
      > int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

### [Multithreading](https://www.guru99.com/multithreading-java.html)

- Multithreading in Java is a process of executing two or more threads simultaneously to maximum utilization of CPU. Multithreaded applications execute two or more threads run concurrently. Hence, it is also known as Concurrency in Java. Each thread runs parallel to each other. Mulitple threads don’t allocate separate memory area, hence they save memory. Also, context switching between threads takes less time.
- Advantages
  - The users are not blocked because threads are independent, and we can perform multiple operations at times
  - As such the threads are independent, the other threads won’t get affected if one thread meets an exception
- Life Cycle of a Thread
  - New:
    - In this phase, the thread is created using class “Thread class”.It remains in this state till the program starts the thread. It is also known as born thread.
  - Runnable:
    - In this page, the instance of the thread is invoked with a start method. The thread control is given to scheduler to finish the execution. It depends on the scheduler, whether to run the thread.
  - Running:
    - When the thread starts executing, then the state is changed to “running” state. The scheduler selects one thread from the thread pool, and it starts executing in the application.
  - Waiting:
    - This is the state when a thread has to wait. As there multiple threads are running in the application, there is a need for synchronization between threads. Hence, one thread has to wait, till the other thread gets executed. Therefore, this state is referred as waiting state.
  - Dead:
    - This is the state when the thread is terminated. The thread is in running state and as soon as it completed processing it is in “dead state”.
- Thread Creation
  - Subclass
    - The first way to specify what code a thread is to run, is to create a subclass of Thread and override the run() method. The run() method is what is executed by the thread after you call start().
  - Runnable
    - The second way to specify what code a thread should run is by creating a class that implements the java.lang.Runnable interface. A Java object that implements the Runnable interface can be executed by a Java Thread.
  - Executor Service
    - The third way to specify what code a thread should run is via an Executor Service. Executors are capable of running asynchronous tasks and typically manage a pool of threads, so we don't have to create new threads manually. All threads of the internal pool will be reused under the hood for revenant tasks, so we can run as many concurrent tasks as we want throughout the life-cycle of our application with a single executor service.
    - We can assign tasks to the Executor Service using several methods:
      - execute()
        - the execute() method is void and doesn't give any possibility to get the result of a task's execution or to check the task's status (is it running)
      - submit()
        - submit() submits a Callable or a Runnable task to an ExecutorService and returns a result of type Future
      - invokeAny()
        - invokeAny() assigns a collection of tasks to an ExecutorService, causing each to run, and returns the result of a successful execution of one task (if there was a successful execution)
      - invokeAll()
        - invokeAll() assigns a collection of tasks to an ExecutorService, causing each to run, and returns the result of all task executions in the form of a list of objects of type Future
          > ExecutorService executor = Executors.newFixedThreadPool(10);<br>
          > Runnable runnableTask = () -> {<br> >&nbsp;&nbsp;&nbsp;&nbsp;try {<br>
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TimeUnit.MILLISECONDS.sleep(300);<br>
              &nbsp;&nbsp;&nbsp;&nbsp;} catch (InterruptedException e) {<br>
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e.printStackTrace();<br>
              &nbsp;&nbsp;&nbsp;&nbsp;}<br>
          };<br>
          Callable<String> callableTask = () -> {<br>
          &nbsp;&nbsp;&nbsp;&nbsp;TimeUnit.MILLISECONDS.sleep(300);<br>
          &nbsp;&nbsp;&nbsp;&nbsp;return "Task's execution";<br>
          };<br>
          List<Callable<String>> callableTasks = new ArrayList<>();
          callableTasks.add(callableTask);<br>
          callableTasks.add(callableTask);<br>
          callableTasks.add(callableTask);<br>
          executorService.execute(runnableTask);<br>
          Future<String> future = executorService.submit(callableTask);<br>
          String result = executorService.invokeAny(callableTasks);<br>
          List<Future<String>> futures = executorService.invokeAll(callableTasks);<br>

### [Reflection API](https://www.geeksforgeeks.org/reflection-in-java/)

- Reflection is an API which is used to examine or modify the behavior of methods, classes, interfaces at runtime. The required classes for reflection are provided under java.lang.reflect package. Reflection gives us information about the class to which an object belongs and also the methods of that class which can be executed by using the object. Through reflection we can invoke methods at runtime irrespective of the access specifier used with them.
- Reflection can be used to get information about:
  - Class
    - The getClass() method is used to get the name of the class to which an object belongs.
  - Constructors
    - The getConstructors() method is used to get the public constructors of the class to which an object belongs.
  - Methods
    - The getMethods() method is used to get the public methods of the class to which an objects belongs.
- Reflection can also be used to invoke methods:
  > Class.getDeclaredMethod(name, parametertype)<br>
  > Method.invoke(Object, parameter)
- Through reflection we can access the private variables and methods of a class with the help of its class object and invoke the method by using the object as discussed above. We use below two methods for this purpose.
  - Class.getDeclaredField(FieldName) :
    - Used to get the private field. Returns an object of type Field for specified field name
  - Field.setAccessible(true) :
    - Allows to access the field irrespective of the access modifier used with the field.
- Advantages
  - Extensibility Features:
    - An application may make use of external, user-defined classes by creating instances of extensibility objects using their fully-qualified names.
  - Debugging and testing tools:
    - Debuggers use the property of reflection to examine private members on classes.
- Disadvantages
  - Performance Overhead:
    - Reflective operations have slower performance than their non-reflective counterparts, and should be avoided in sections of code which are called frequently in performance-sensitive applications.
  - Exposure of Internals:
    - Reflective code breaks abstractions and therefore may change behavior with upgrades of the platform.

### [Servlet API](https://www.geeksforgeeks.org/introduction-java-servlets/)

- Servlets are the Java programs that run on the Java-enabled web server or application server. They are used to handle the request obtained from the webserver, process the request, produce the response, then send a response back to the webserver.
- Properties of Servlets are as follows:
  - Servlets work on the server-side.
  - Servlets are capable of handling complex requests obtained from the webserver.
- Execution of Servlets basically involves six basic steps:
  1. The clients send the request to the webserver.
  2. The web server receives the request.
  3. The web server passes the request to the corresponding servlet.
  4. The servlet processes the request and generates the response in the form of output.
  5. The servlet sends the response back to the webserver.
  6. The web server sends the response back to the client and the client browser displays it on the screen.
- Servlet Hierarchy
  - Servlet (I)
  - Generic Servlet (AC)
  - Http Servlet (AC)
  - My Servlet (C)
- Servlet Lifycycle
  - Initialization
    - init()
  - Servicing
    - service()
  - Destroying
    - destroy()
- HttpServlet Methods
  - doGet()
    - used to receive get requests via HTTP
  - doPost()
    - used to receive post requests via HTTP
  - doPut()
    - used to receive put requests via HTTP
  - doDelete()
    - user to receive delete requests via HTTP
  - init()
    - initializes the servlet
  - destroy()
    - terminates the servlet instance
  - getServletInfo()
    - used to provide information about the servlet
- Servlet Container
  - Servlet container, also known as Servlet engine is an integrated set of objects that provide a run time environment for Java Servlet components.
    - In simple words, it is a system that manages Java Servlet components on top of the Web server to handle the Web client requests.
  - Services provided by the Servlet container :
    - Network Services:
      - Loads a Servlet class. The loading may be from a local file system, a remote file system or other network services. The Servlet container provides the network services over which the request and response are sent.
    - Manage Servlet container:
      - Manages the lifecycle of a Servlet.
    - Resource management:
      - Manages the static and dynamic resources, such as HTML files, Servlets, and JSP pages.
    - Security Service:
      - Handles authorization and authentication of resource access.
    - Session Management:
      - Maintains a session by appending a session ID to the URL path.

## Testing

### JUnit

### Mockito

## SQL

### RDB Basics

#### SQL Sublanguages

#### Database Objects

### Joins

### Functions/Procedures

### Constraints

### Relationships

### Normalization

## Spring Projects

### Spring Core

### Spring MVC

### Spring Boot

### Spring Data

### Spring Security

## Web

### HTTP

#### HTTP Verbs

#### Status Codes

### REST

#### Guiding Principles

#### Richardson Maturity Model
