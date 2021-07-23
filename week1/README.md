# Week 1 Study Questions & Assignments
You should research and be able to answer the following questions:

## `Friday`
> :exclamation: **Assignments** ❗
> - Hackerrank Problem: [Solve `Diagonal Difference`](https://www.hackerrank.com/210517-enterprise-hr0) 🕙 *Due by Monday May 24th 10:00am EST* 
   > Talk me through your code in our 1-on-1 interview on Monday <br>
   > Need some practice? Try [these](https://www.hackerrank.com/domains/data-structures) 👈 <br>
> - **[Project-0: Banking API](https://classroom.github.com/a/371I_oZ4)**: 🕙*Due Wednesday June 2nd*
> - **Optional Extra Practice**: [Custom Algorithm Assignment](https://classroom.github.com/a/6-0WFWWc) <br>
> - Review **all questions below** and **[this comprehensive QC studyguide](https://github.com/210517-Enterprise/demos/blob/main/week1/qc-questions.md)** to prepare you for QC next Monday.


## `Thursday`
- When do you use `ArrayList` instead of `LinkedList`?
   - Great resource [here](https://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist-in-java)
- What is the Collections API?
   - How does "Collections API" differ from `Collection`? Check [here](https://www.tutorialspoint.com/difference-between-collection-and-collections-in-java#:~:text=Collection%20framework%20contains%20multiple%20wrapper,Hashtable%2C%20collection%20interfaces%20and%20etc.&text=Java%20util%20collection%20%2D%20It%20contains,%2C%20queue%20%2C%20List%20and%20etc.)
   - How does `Map` Interface relate to the Collection Framework? (Does it extend `java.util.Collection`?)

- What are the interfaces in the Collections API?

- What is the difference between a Set and a List?

- What is the difference between a Array and an ArrayList?

- What is the difference between ArrayList and Vector?
   - Vector is synchronized whereas ArrayList is not. 

- What is the difference between TreeSet and HashSet?
   - The two general purpose Set implementations are HashSet and TreeSet. HashSet is much faster (constant time versus log time for most operations) but offers no ordering guarantees.
   
- What is the difference between HashTable and HashMap?
   - Hashtable is synchronized whereas Hashmap is not.
   - Hashmap permits null values and the null key.
   
Binary Search: 
<a href="https://gyazo.com/c8aa9f554a7081e2b4a9dbcf1c2b5f02"><img src="https://i.gyazo.com/c8aa9f554a7081e2b4a9dbcf1c2b5f02.gif" alt="Image from Gyazo" width="462"/></a>

<br>

<hr>

## `Wednesday`
- :star: Begin [**Java-Problems**](https://classroom.github.com/a/DNzxX6Hm) *due Friday June 4th*

- How do we handle Exceptions in Java?
   - Checked vs. Unchecked?  
   - Check out this [guide to exceptions](https://www.protechtraining.com/content/java_fundamentals_tutorial-exceptions).
   - Great [video on exceptions](https://www.youtube.com/watch?v=8WTVLa1Xtsk).
   - [Guide](https://www.geeksforgeeks.org/throw-throws-java/) to `throw` and `throws` keyword in java.

-  What is Maven?
   - You can review the demo we did [here](https://github.com/210517-Enterprise/demos/blob/main/week1/maven.md)
   - Solid resource on [Intro to Maven](https://www.studytonight.com/maven/introduction-to-maven)

<br>

<hr>

## `Tuesday`
- :star: Try the [Array sort challenge](https://github.com/210517-Enterprise/demos/blob/main/week1/FirstJavaProject/src/com/revature/E/arrays/ArrayChallenge.java).

- What are access modifiers? Explain all 4.

- Tell me about Arrays:
   - What is an Array?
   - Can I change the size of an Array?

- What is Abstraction?

- What's the difference between an Abstract class and an Interface?
   - Here's a [great thread on Stack Overflow about this topic](https://stackoverflow.com/questions/479142/when-to-use-an-interface-instead-of-an-abstract-class-and-vice-versa).

   - Check out [this resource as well](https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/).

- How many classes can a Class extend? In other words, does Java support **multi-inheritance**?

- How many interfaces can a class implement?

- How is memory managed in Java
   - [Here is a page about `Gabage Collection`.](https://www.geeksforgeeks.org/garbage-collection-java/#:~:text=Garbage%20collector%20is%20best%20example,memory%20by%20destroying%20unreachable%20objects.)

- Why are Strings immutable in Java?

- What is the difference between String, StringBuilder, and StringBuffer 

- How many objects are created? What is the output?
```java
String s1 = "hello";
String s2 = "hello";
String s3 = new String("hello");

System.out.println(s1 == s2);       // a
System.out.println(s1.equals(s2));  // b
System.out.println(s1 == s3);       // c
System.out.println(s1.equals(s3));  // d

s1.concat("goodbye");
System.out.println(s1 == s2);       // e
System.out.println(s1.equals(s2));  // f
```

> Here is the answer to the above 2 questions for your reference: <br>
> *Answer*: 2 objects are created.

> *Explanation*: Identical String literals are collected in the "String pool" in an effort to conserve memory. Reference variables will then point to the same String object instance. **Changing the object's state in the String pool will make changes to all references to that String object**. Instead, when a change to a String is made, the JVM makes a new String object, and the reference variable points to the new String in the String pool.

<br>

<hr>

<br>

## `Monday`

- :star: Try this challenge [here](https://github.com/210517-Enterprise/demos/blob/main/week1/FirstJavaProject/src/com/revature/C/scanner/GradeCalcChallenge.java). 

- What is Java and why is it so great?

- What is JRE / JDK / JVM?
   
- How is Java code compiled and executed? In otherwords, explain src code --> byte code --> Target machine's JVM

   - [Here](https://www.dummies.com/programming/java/what-is-a-java-virtual-machine/#:~:text=Generally%2C%20computers%20don't%20execute,in%20a%20slightly%20different%20way.) is a great resource and example.

- What are some useful features in Java 8 (*It's ok if you list them with a brief conceptual overview)*.

- What are the 8 primitive datatypes in Java?

- What is an object?  What is a class?

- What is a wrapper class?

- What is autoboxing / unboxing?

- Tell me the full syntax of the `main` method. What is its purpose?

<br>

### Resources: :mag:
The first place you should be looking for the answers is in Google and your notes from class. Google will most likely lead you to the following websites which I reccomend you frequently refer to for accurate explanations of the concepts above:

- [Stack OverFlow](https://stackoverflow.com/)
- [GeeksForGeeks](https://www.geeksforgeeks.org/)
- [JavaTPoint](https://www.javatpoint.com/)
- YouTube! There are tons of great videos like [this](https://www.youtube.com/watch?v=tppI4lJDnY4)
- [Oracle Documentation](https://docs.oracle.com/javase/8/docs/)
