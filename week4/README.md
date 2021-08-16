# Week 4: HTTP

> <br>
> Below are questions you should be reviewing daily.  <br> 
> They are all included on the [collective list of QC questions](https://github.com/210726-Enterprise/demos/blob/main/week4/qc-questions.md)

<br>

## `Tuesday`

1. What is multi-threading?

   - Handling multiple threads / paths of execution in your program.

2. In what ways can you create a thread?

   - By extending the Thread Class or by implementing the `Runnable` Interface. You must call Thread's `.start()` method to start it as a new thread of execution.

3. Lifecycle of a thread

   - When created, in NEW state.
   - When `.start()` is called, it goes to RUNNABLE state.
   - When `.run()` is called, goes to RUNNING state.
   - If `.sleep()` or `.wait()` is called, will go to WAITING.
   - If dependent on another thread to release a lock, it will go to BLOCKED state.
   - When finished executing, will be in DEAD state and cannot be restarted.

4. What is deadlock?

   - When two or more threads are waiting on locks held by the others, such that no thread can execute

5. What is synchronized keyword?
   - Only allowing one thread access to the method or variable at a time - enforces thread-safety

- Here is a [list of possible QC questions that will be asked on Monday](https://github.com/210517-Enterprise/demos/blob/main/week4/qc-questions.md).
  - Topics: SQL, Threads, Advanced Java, Functional Interfaces, HTTP

## `Wednesday`

:star: Use [these custom ORM examples](https://github.com/210517-Enterprise/demos/tree/main/week4/custom-orm-examples) to assist you in designing your own ORM framework.<br>
:star: Use [this](https://github.com/210726-Enterprise/demos/blob/main/week4/p1-sample-readme.md) as a template/guideline for your own Project 1's README.md file.

1. Why is JDBC pooling important?

2. What does `.wait()` do to a thread? `.notify()`? [Resource](https://www.baeldung.com/java-wait-notify)

3. What is a [Semaphore](https://www.geeksforgeeks.org/semaphore-in-java/)?

4. Explain the [Producer/Consumer Problem](https://www.geeksforgeeks.org/producer-consumer-solution-using-threads-java/).

<br>

## `Thursday`

- :star: review this [HTTP Study Guide](https://github.com/210726-Enterprise/demos/blob/main/week4/notes/http-notes.md) _You will be asked about HTTP on Monday_.

- What is HTTP?

- What are the separate levels of HTTP status codes? (_i.e_ What does 100, 200, 300, 400, 500 level mean?)

- What is the anatomry of an HTTP **request**?

- What is the anatomy of an HTTP **response**?

- What's in the `Header` and `Body` of both a response and request HTTP message?

<br>

## `Friday`

- To prepare for Monday, please study the [collective list of QC questions](https://github.com/210726-Enterprise/demos/blob/main/week4/qc-questions.md)
  - Monday: 10AM quiz, 1-on-1's, 2pm - 3:30pm QC.

<br>
