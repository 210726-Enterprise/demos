# Spring
The Spring Framework is an inversion of control container that provides flexible infrastructural support to create loosely coupled Java applications by utilizing dependency injection.

## What is Spring?
Spring an umbrella term for a family of frameworks which can be utilized to rapidly create loosely coupled Java applications. These spring frameworks provide a comprehensive and configurable model for modern enterprise Java applications, which can be easily migrated to any kind of deployment platform. 
<br>
<br>
This ease is due to the core feature of the Spring frameworks, which focuses on **dependency injection** resulting from the framework acting as an **inversion of control container**.
Spring enables developers to build java applications utilizing a POJO design pattern, and applying enterprises services, as needed, non-invasively to those POJOs. This loose coupling allows developers to focus on business logic for applications as Spring handles the infrastructural needs.

<br>

* [spring.io](https://spring.io/)
* Spring is a Java Framework
* Created in 2002 by Rod Johnson
* XML configuration in `beans.xml`
  * We will see Java config later


# Modules
* core, beans, context
  * base modules of Spring
  * contains `BeanFactory` and `ApplicationContext`
* aop
* mvc
* orm
* data
* boot
* security
* test
* There are many more...

# Why Spring?

We can turn this code

```java
public class BeanAImpl implements BeanA {

	private BeanB dog = new BeanBImpl();

}
```

into this code

```java
public class BeanAImpl implements BeanA {

	private BeanB dog;

}
```
