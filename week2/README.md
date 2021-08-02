# Week 2: SQL & JDBC Study Questions

You should research and be able to answer the following questions at the ned of each day:

> - Use Google and [SQL class notes](https://github.com/210726-Enterprise/demos/blob/main/week2/notes/sql.md). [AWS notes here](https://github.com/210517-Enterprise/demos/blob/main/week2/notes/aws.md)<br>
> - The [PostgreSQL Documentation](https://www.postgresqltutorial.com/) is a great resource (and easy to follow).<br>
> - :star: **[W3 Schools SQL Tutorial](https://www.w3schools.com/sql/)**
>   :star: For extra practice try the [Chinook Query Challenge](https://github.com/210726-Enterprise/demos/tree/main/week2/chinook-challenge)

<br>

## `Study Questions`

> Go over these questions to prepare for QC on August 16th or 17th (exact date TBA).

### SQL Questions

1.  Explain what SQL is. What are some SQL RDBMS Vendors? _What is an RDBMS_?
2.  Draw a simple ERD for modeling Students and Classes
3.  What are the 5 sublanguages of SQL? Which commands correspond to them?
4.  What is the difference between DELETE, DROP, and TRUNCATE commands?
5.  What are some SQL clauses you can use with SELECT statements?
6.  What is the difference between WHERE and HAVING? _`WHERE` is used to filter rows before grouping and `HAVING` is used to exclude records after grouping. Read more [here](https://www.java67.com/2019/06/difference-between-where-and-having-in-sql.html#ixzz6kwoJQmXd)_.
7.  Explain what the ORDER BY and GROUP BY clauses do.

- Practice [here](https://www.w3schools.com/sql/sql_orderby.asp).

8.  Explain the concept of relational integrity.
9.  List the integrity constraints.
10. Define the word “schema”.

11. What is a candidate key? What about a surrogate key?

12. What conditions lead to orphan records? (_Think about what happens when we delete from a table that a child table is dependent on because it feautres its Primary keys as foreign keys within the table_)

13. What are some SQL data types?

14. What is normalization? What are the levels? (0 - 3NF)

15. What are the properties a transaction must follow? (_A.C.I.D_)

16. Explain the different isolation levels. What read phenomena do each prevent?

17. What is the difference between joins and set operators?

18. What are the types of joins? Explain the differences.

19. What is a cascade delete?

20. How would you setup a primary key that automatically increments with every INSERT statement?

21. What is the difference between scalar and aggregate functions? Give examples of each

22.

### JDBC Questions

1. What is JDBC?

2. What are the core interfaces / classes in JDBC?

3. What is a stored procedure and how would you call it in Java?

4. What is the difference between Statement and PreparedStatement?

5. Steps to executing an SQL query using JDBC?

6. How to execute stored procedures using JDBC?

7. Which interface is responsible for transaction management?
   > `Connection` Interface. See this resource here about [JDBC and Transaction management](https://www.javatpoint.com/transaction-management-in-jdbc#:~:text=In%20JDBC%2C%20Connection%20interface%20provides%20methods%20to%20manage%20transaction)

### AWS & Cloud Computing Questions

1. what are the benefits of cloud services?

2. What are the 3 models of Cloud computing?

3. What is AWS RDS? What type of service is this? Iaas, Paas, Saas?

4. What is the relationship between a Region and an Availability Zone?

5. What are Security Groups?
