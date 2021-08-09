## Collections / Generics

42. What are collections in Java?

- A general data structure that contains Objects. Also the name of the API

43. What are the interfaces in the Collections API?

- Iterable, Collection, List, Queue, Set, Map, SortedSet, SortedMap

44. What is the difference between a `Set` and a `List`?

- `Set` does not allow duplicates (its members are unique)

45. What is the difference between a `Array` and an `ArrayList`?

- An array is static and its size cannot be changed, but an ArrayList can grow/shrink

46. What is the difference between `ArrayList` and `Vector`?

- `Vector` is synchronized whereas `ArrayList` is not.

47. What is the difference between `TreeSet` and `HashSet`?

- The two general purpose `Set` implementations are `HashSet` and `TreeSet`. `HashSet` is much faster (constant time versus log time for most operations) but offers no ordering guarantees.

48. What is the difference between HashTable and HashMap?

- a. `Hashtable` is synchronized whereas `Hashmap` is not.

- b. `Hashmap` permits `null` values and the `null` key.

49. Are Maps in the Collections API?

- Yes, but they do not implement `Collection` or `Iterable` interfaces

50. What are generics? What is the diamond operator (`<>`)?

- A way of specifying a type within a data structure - they enforce type safety. `<>` operator lets you infer generic types from the LHS of assignment operation

## Threads

51. What is multi-threading?

- Handling multiple threads / paths of execution in your program.

52. In what ways can you create a thread?

- By extending the Thread Class or by implementing the `Runnable` Interface. You must call Thread's `.start()` method to start it as a new thread of execution.

53. Lifecycle of a thread

- When created, in NEW state.
- When `.start()` is called, it goes to RUNNABLE state.
- When `.run()` is called, goes to RUNNING state.
- If `.sleep()` or `.wait()` is called, will go to WAITING.
- If dependent on another thread to release a lock, it will go to BLOCKED state.
- When finished executing, will be in DEAD state and cannot be restarted.

54. What is deadlock?

- When two or more threads are waiting on locks held by the others, such that no thread can execute

55. What is synchronized keyword?

- Only allowing one thread access to the method or variable at a time - enforces thread-safety

## IO / Serialization

56. How do you serialize / deserialize an object in Java?

- a. Step 1: An object is marked serializable by implementing the `java.io.Serializable` interface, which signifies to the underlying API that the object can be flattened into bytes and subsequently inflated in the future.

- b. Step 2: The next step is to actually persist the object. That is done with the `java.io.ObjectOutputStream` class. That class is a filter stream--it is wrapped around a lower-level byte stream (called a node stream) to handle the serialization protocol for us. Node streams can be used to write to file systems or even across sockets. That means we could easily transfer a flattened object across a network wire and have it be rebuilt on the other side!

- c. To restore the object back, you use `ObjectInputStream.readObject()` method call. The method call reads in the raw bytes that we previously persisted and creates a live object that is an exact replica of the original. Because `readObject()` can read any serializable object, a cast to the correct type is required. With that in mind, the class file must be accessible from the system in which the restoration occurs. In other words, the object's class file and methods are not saved; only the object's state is saved.

57. What is a Marker interface?

- A marker interface is an interface which has no methods at all. Example: `Serializable`, `Remote`, `Cloneable`. Generally, they are used to give additional information about the behavior of a class.

58. What are transient variables?

- Transient variables are those variables which cannot be serialized.

59. Difference between FileReader and BufferedReader?

- `FileReader` is just a `Reader` which reads a file, so it reads characters and uses the platform-default encoding.

- `BufferedReader` reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines (e.g. can read one line at a time).

- So you can wrap a `BufferedReader` around a `FileReader`

## Design patterns

67. What are Singleton / Factory design patterns?

- Singleton - allows for creation of only 1 object. Method for retrieving object returns reference to the same object in memory. Implement via private constructor

- Factory - abstracts away instantiation logic, usually used in conjunction with singleton pattern

## JDBC

68. What is JDBC?

- A Java API used to execute queries on various databases. Uses JDBC drivers to connect with the database

69. What are the core interfaces / classes in JDBC?

- `DriverManager`, `Connection`, `Statement`, `PreparedStatement`, `CallableStatement`, `ResultsSet`

70. What is a stored procedure and how would you call it in Java?

- A stored procedure is an executable block of code that is written in PL/SQL and stored in the Oracle database. A stored procedure is called from a Java class using a CallableStatement object. When the procedure is called, its name and any relevant parameters are sent over the JDBC connection to the DBMS, which executes the procedure and returns the results (if applicable) via the connection.

71. What is the difference between Statement and PreparedStatement?

- PreparedStatements are pre-compiled by the JVM. The database doesn't have to compile the SQL each and every time it is executed. PreparedStatement can be parameterized, which can make the SQL more readable. Furthermore, PreparedStatement will properly escape reserved characters to prevent SQL injection attacks.

72. Steps to executing an SQL query using JDBC?

- 1. Register the driver using `.forName()` (or let `DriverManager` detect and load automatically from classpath)
- 2. Create the connection (`DriverManager.getConnection(url,username,password)`)
- 3. Create a statement for executing the SQL query (`Statement st = conn.createStatement()`);
- 4. Execute the SQL query (`ResultSet rs = st.executeQuery(String sql)`)
- 5. Use `ResultSet` to get values returned (`rs.getInt(1)`, etc)
- 6. Close the connection (`conn.close()`)

73. How to execute stored procedures using JDBC?

- Use the `Callable` statement interface

74. Which interface is responsible for transaction management?

- The `Connection` interface - can `commit`, `rollback`, etc

## JUnit

75. What is JUnit?

- A Java unit testing framework for testing code - use it for TDD

76. What is TDD?

- Test-driven development - write unit tests before application code, then write code to make tests pass. Repeat this process until functionality is complete.

77. What are the annotations in JUnit? Order of execution?

- BeforeClass, AfterClass, Before, After, Test, Ignore

78. Give an example of a test case?

- Adding two numbers, check that the method returns the sum

## Log4j

79. What is an advantage to using a logging library?

- Allows you to set logging thresholds

80. What is log4j?

- Logging library for Java

81. What are the logging levels of log4j?

- TRACE, DEBUG, INFO, WARN, ERROR, FATAL

## Maven

82. What is Maven?

- A build automation and dependcy management tool for Java applications

83. What is the default Maven build lifecycle?

- process resources - copy and process the resources into destination directory
- compile - compile the source code
- process-test-resources - same for test directory
- test-compile - compile the test code
- test - run the test code
- package - combine compiled source code into a .jar or .war file
- install - install package to local repo
- deploy - copy package and install in remote repo

84. Where / when does Maven retrieve dependencies from? Where are they stored locally?

- Maven first looks to see if the dependency is in the local repo under `.m2` directory. If not, it will download the necessary .jar file(s) from the remote central Maven repository into the `.m2` directory

85. What is the POM and what is the pom.xml?

- POM stands for project object model and is the model used by Maven to understand project attributes and dependencies. The pom.xml is the xml document which lists those attributes and dependencies

## Advanced

86. What are functional interfaces?

- Functional interfaces only have one method, and can be used in conjuntion with lambdas

87. What are lambdas?

- Like anonymous functions, they allow implementation of functional interfaces directly without creating a class

88. What is try-with-resources? What interface must the resource implement to use this feature?

- Try-with-resources allows for automatically closing resources in a try/catch block using `try(resource) {...}` syntax. Must implement the `AutoCloseable` interface

89. How to make numbers in your code more readable?

- Use the `_` for numeric literals - must be placed between numbers

90. Which collections cannot hold null values?

- `HashTable`, `TreeSet`, `ArrayDeque`, `PriorityQueue`

91. If 2 interfaces have default methods and you implement both, what happens?

- The code will NOT compile unless you override the method. However, the code WILL compile if one interface is implemented further up in the class hierarchy than the other - in this case, the closest method implementation in the hierarchy will be called

92. If 2 interfaces have same variable names and you implement both, what happens?

- The code will compile unless you make a reference to the variable (this is an ambiguous reference). You must explicitly define the variable by using the interface name: `int a = INTERFACENAME.a;`

93. Why does `HashTable` not take `null` key?

- The hash table hashes the keys given as input, and the `null` value cannot be hashed

94. What new syntax for creating variables was introduced with Java 10?

- The `var` keyword was introduced - with type inference

95. Is there an interactive REPL tool for Java like there is for languages like Python?

- Yes, the `jshell` tool introduced in Java 9

96. What are collection factory methods?

- They allow you to directly populate collections, e.g. `Set.of(1,2,3)`
