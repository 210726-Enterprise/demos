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
          List<Callable<String>> callableTasks = new ArrayList<>();<br>
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

### [JUnit](https://www.tutorialspoint.com/junit/index.htm)

- JUnit is a unit testing framework for Java programming language. JUnit has been important in the development of test-driven development, and is one of a family of unit testing frameworks collectively known as xUnit, that originated with JUnit.
- JUnit promotes the idea of "first testing then coding", which emphasizes on setting up the test data for a piece of code that can be tested first and then implemented. This approach is like "test a little, code a little, test a little, code a little." This concept is called Test Driven Development, or TDD for short.
- JUnit test framework provides the following important features:
  - Fixtures
    - Fixtures is a fixed state of a set of objects used as a baseline for running tests. The purpose of a test fixture is to ensure that there is a well-known and fixed environment in which tests are run so that results are repeatable. It includes:
      - setUp() method, which runs before every test invocation
      - tearDown() method, which runs after every test method.
  - Test suites
    - A test suite bundles a few unit test cases and runs them together. In JUnit, both @RunWith and @Suite annotation are used to run the suite test.
  - Test runners
    - The test runner is used for executing test cases.
  - JUnit classes
    - Assert
      - Contains a set of assert methods.
    - TestCase
      - Contains a test case that defines the fixture to run multiple tests.
    - TestResult
      - Contains methods to collect the results of executing a test case.
- Usage
  - In order for a test class to be seen by the test runner, it should have the word "test" somewhere in its name.
  - In order for a test method (test case) to be seen by the test runner, it should be placed inside of the test class and annotated with the @Test annotation.
  - In order for it to be a fully functional test, your test methods should have some form of an assertion, a method that asserts that a result value matches your expected value. When assertions fail, your test fails; when it doesn't fail, the test passes. This is how we confirm that a class is behaving as expected.
  - There are several assertion methods that we see commonly:
    - assertEquals()
    - assertFalse()
    - assertTrue()
    - assertNotNull()
    - assertNull()

### [Mockito](https://www.tutorialspoint.com/mockito/index.htm)

- Mockito is a mocking framework, JAVA-based library that is used for effective unit testing of JAVA applications. Mockito is used to mock interfaces so that a dummy functionality can be added to a mock interface that can be used in unit testing.
- Advantages
  - Most times in Java development, we end up with classes that are dependent on other classes functionality or data. When trying to test the class, it would not be considered a unit test if we were also testing the subsequent dependency that the tested class was dependent on. I.e. if I'm testing a service class but most of the methods are dependent on data from a repository, we would be entirely dependent on the data sent back from our data access layer. As such, we utilize Mocking to provide mock values from the dependency so that we can focus our tests solely on a single unit or class.
- Usage
  - Creating a mock
    - In your test class, in order to create a mock of an object, the code would be as follows:
      > Class classNameMock = Mockito.mock(Class.class);
    - The above code now allows this mock object to be used and minipulated during our following tests
  - Supplying mock values from a mock object
    - Once you have your mock object, you now need to describe some behavior or data for the mock object to return when a specific action takes place. We typically see this as when(some action).thenReturn(some value) instead of the actual value
      > Mockito.when(classNameMock.methodA(data)).thenReturn(someValue)
    - In the above example, you provide explicit return values for each method that with likely be called during the test suite
    - For example, lets say we have a class that is dependent on classNameMock and a method that calls classNameMock.methodA() in its implementation. The code for calling the inital class method does not change, we are simply providing the data that is returned from the dependency.

## SQL

- SQL stands for Structured Query Language. SQL is used to communicate with a database. According to ANSI (American National Standards Institute), it is the standard language for relational database management systems. SQL statements are used to perform tasks such as update data on a database, or retrieve data from a database.

### RDB Basics

#### SQL Sublanguages

- DDL – Data Definition Language.
  - CREATE
  - ALTER
  - DROP
  - TRUNCATE
  - RENAME
- DML – Data Manipulation Language.
  - INSERT
  - UPDATE
  - DELETE
- DRL/DQL – Data Retrieval Language/Data Query Language.
  - SELECT
- TCL – Transaction Query Language.
  - COMMIT
  - ROLLBACK
  - SAVEPOINT
  - ROLLBACK TO
- DCL – Data Control Language.
  - GRANT
  - REVOKE
  - AUDIT
  - COMMENT
  - ANALYZE
- SCL – Session Control Language.
  - ALTER SESSION
  - SET ROLL

#### Database Objects

- Table
  - This database object is used to create a table in database.
- View
  - This database object is used to create a view in database.A view is a logical table based on a table or another view. A view contains no data of its own but is like a window through which data from tables can be viewed or changed.
- Sequence
  - This database object is used to create a sequence in database.A sequence is a user created database object that can be shared by multiple users to generate unique integers. A typical usage for sequences is to create a primary key value, which must be unique for each row.
- Index
  - This database object is used to create a indexes in database. An index provides direct and fast access to rows in a table. Its purpose is to reduce the necessity of disk I/O by using an indexed path to locate data quickly.

### Joins

- A JOIN clause is used to combine rows from two or more tables, based on a related column between them.
- Different Types of SQL JOINs:
  - (INNER) JOIN:
    - Returns records that have matching values in both tables
      > SELECT columns<br>
      > FROM table1 <br>
      > INNER JOIN table2<br>
      > ON table1.column = table2.column;
  - LEFT (OUTER) JOIN:
    - Returns all records from the left table, and the matched records from the right table
      > SELECT columns<br>
      > FROM table1<br>
      > LEFT JOIN table2<br>
      > ON table1.column = table2.column;
  - RIGHT (OUTER) JOIN:
    - Returns all records from the right table, and the matched records from the left table
      > SELECT columns<br>
      > FROM table1<br>
      > RIGHT JOIN table2<br>
      > ON table1.column = table2.column;
  - FULL (OUTER) JOIN:
    - Returns all records when there is a match in either left or right table
      > SELECT columns<br>
      > FROM table1<br>
      > FULL JOIN table2<br>
      > ON table1.column = table2.column;

### Functions/Procedures

- Functions
  - For doing operations on data sql has many built-in functions, they are categorised in two categories and further sub-categorised in different seven functions under each category. The categories are:
    - Aggregate functions:
      - These functions are used to do operations from the values of the column and a single value is returned.
        - AVG()
        - COUNT()
        - FIRST()
        - LAST()
        - MAX()
        - MIN()
        - SUM()
    - Scalar functions:
      - These functions are based on user input, these too returns single value.
        - UCASE()
        - LCASE()
        - MID()
        - LEN()
        - ROUND()
        - NOW()
        - FORMAT()
    - User Defined Functions:
      - Users can also create their own functions to perform custom operations on data.
- Procedures
  - A procedure (often called a stored procedure) is a subroutine like a subprogram in a regular computing language, stored in database. SQL procedures can be used to create simple scripts for quickly querying transforming, updating data, generating basic reports, improve application performance, modularizing applications, and improve overall database design, and database security.
  - Advantages
    - Can contain SQL Procedural Language statements and features which support the implementation of control-flow logic around traditional static and dynamic SQL statements.
    - Easy to implement, because they use a simple high-level, strongly-typed language.
    - SQL procedures are more reliable than equivalent external procedures.
    - Support input, output, and input-output parameter passing modes.
    - Support a simple, but powerful condition and error-handling model.
    - Return multiple results sets to the caller or to a client application.
    - Allow you to easily access the SQLSTATE and SQLCODE values as special variables.
    - Reside in the database and are automatically backed up and restored.
    - Can be invoked wherever the CALL statement is supported.
    - Support nested procedure calls to other SQL procedures or procedures implemented in other languages.
  - Disadvantages
    - Stored procedure languages are vendor specific. Therefore if you switch to another vendor's database, it requires to rewriting the existing stored procedures.
    - Stored procedure languages from different vendors have different levels of sophistication. For example, Oracle's PL/SQL has more language features and built-in features than Microsoft's T-SQL.
    - Tool support for writing and debugging stored procedures is often not as good as for other programming languages, though it depends on vendors and languages.

### Constraints

- SQL constraints are used to specify rules for the data in a table. Constraints are used to limit the type of data that can go into a table. This ensures the accuracy and reliability of the data in the table. If there is any violation between the constraint and the data action, the action is aborted.
- The following constraints are commonly used in SQL:
  - NOT NULL
    - Ensures that a column cannot have a NULL value
  - UNIQUE
    - Ensures that all values in a column are different
  - PRIMARY KEY
    - A combination of a NOT NULL and UNIQUE. Uniquely identifies each row in a table
  - FOREIGN KEY
    - Prevents actions that would destroy links between tables
  - CHECK
    - Ensures that the values in a column satisfies a specific condition
  - DEFAULT
    - Sets a default value for a column if no value is specified
  - CREATE INDEX
    - Used to create and retrieve data from the database very quickly

### Relationships

- When creating a database, common sense dictates that we use separate tables for different types of entities. Some examples are: customers, orders, items, messages etc... But we also need to have relationships between these tables. For instance, customers make orders, and orders contain items. These relationships need to be represented in the database. Also, when fetching data with SQL, we need to use certain types of JOIN queries to get what we need.
- Types of SQL Relationships:
  - One to One
    - One-to-one requires the child table Primary Key to be associated via a Foreign Key with the parent table Primary Key column.
  - One to Many
    - one-to-many is the most common relationship, and it associates a row from a parent table to multiple rows in a child table.
  - Many to Many
    - many-to-many requires a link table containing two Foreign Key columns that reference the two different parent tables.

### Normalization

- It is the processes of reducing the redundancy of data in the table and also improving the data integrity. So why is this required? without Normalization in SQL, we may face many issues such as
  - Insertion anomaly:
    - It occurs when we cannot insert data to the table without the presence of another attribute
  - Update anomaly:
    - It is a data inconsistency that results from data redundancy and a partial update of data.
  - Deletion Anomaly:
    - It occurs when certain attributes are lost because of the deletion of other attributes.
- Normal Forms
  - 1st Normal Form (1NF)
    - In this Normal Form, we tackle the problem of atomicity. Here atomicity means values in the table should not be further divided. In simple terms, a single cell cannot hold multiple values. If a table contains a composite or multi-valued attribute, it violates the First Normal Form.
  - 2nd Normal Form (2NF)
    - The first condition in the 2nd NF is that the table has to be in 1st NF. The table also should not contain partial dependency. Here partial dependency means the proper subset of candidate key determines a non-prime attribute.
  - 3rd Normal Form (3NF)
    - The same rule applies as before i.e, the table has to be in 2NF before proceeding to 3NF. The other condition is there should be no transitive dependency for non-prime attributes. That means non-prime attributes (which doesn’t form a candidate key) should not be dependent on other non-prime attributes in a given table. So a transitive dependency is a functional dependency in which X → Z (X determines Z) indirectly, by virtue of X → Y and Y → Z (where it is not the case that Y → X)
  - Boyce Codd Normal Form (BCNF)
    - This is also known as 3.5 NF. Its the higher version 3NF and was developed by Raymond F. Boyce and Edgar F. Codd to address certain types of anomalies which were not dealt with 3NF. Before proceeding to BCNF the table has to satisfy 3rd Normal Form. In BCNF if every functional dependency A → B, then A has to be the Super Key of that particular table.

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
