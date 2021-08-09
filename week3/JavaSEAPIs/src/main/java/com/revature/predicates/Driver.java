package com.revature.predicates;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.revature.lambdas.Employee;
/*
 * Predicate, Consumer, and Supplier are all functional interfaces in java from the java.util.function package
 */
public class Driver {

	public static void main(String[] args) {
		
		Employee zayn = new Employee("Zayn Smith", 40);
		Employee abby = new Employee("Abby McCormick", 30);
		Employee xavier = new Employee("Xavier Hall" , 15);
		Employee marry = new Employee("Marry Shelly", 60);
		Employee snow = new Employee("Snow White", 35);
		Employee spiderman = new Employee("Peter Parker", 16);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(zayn);
		employees.add(abby);
		employees.add(xavier);
		employees.add(marry);
		employees.add(snow);
		employees.add(spiderman);
		
		employees.forEach(emp -> {
			// Consumer is a functional interface that has one method called accept(), which performs an operation on an element
			// but doesn't return a value.
			// https://www.javatpoint.com/java-consumer-interface
			
			// The forEach method takes in a Consumer.  The Consumer functional interface has an accept() method which
			// does not return a value but instead performs an operation on an element.
			System.out.println(emp.getName()); // this lambda expression is defining the behavior of the accept() method
			System.out.println(emp.getAge());
		});
		
//		System.out.println("All Employees Over 30");
//		employees.forEach((emp) -> {
//			if(emp.getAge() > 30) {
//				System.out.println(emp.getName());
//			}
//		});
//		
//		System.out.println("All Employees Under 30");
//		employees.forEach((emp) -> {
//			
//			if(emp.getAge() <= 30) {
//				System.out.println(emp.getName());
//			}
//		});

		
		// Remember that The root of the Collections Hierarchy is Iterable Inteface
		// An iterator is an object that can be used to iterate (or loop ) through a collection
		Iterator<Employee> it = employees.iterator();
		System.out.println(it.next());

		// Here I'm using a lambda to define the .test() method's behavior
		printEmployeesByAge(employees, "All Employees Over 30", emp -> emp.getAge() > 30); // here, we're assigning the behavior of the test() method of the predicate
		printEmployeesByAge(employees, "All Employees Under 30", emp -> {
			
			int extraAge = 5;
			return (emp.getAge() + extraAge) <= 30;
			// must add a return statmeent to make it multiline
		});
		
	
		// Anonymous Class
		printEmployeesByAge(employees, "All Employees Under 30", new Predicate<Employee>() {

			@Override
			public boolean test(Employee emp) {
				// specify the condition for our predicate in the anonymous class (slightly longer than doing it in Lambda)
				int extraAge = 5;
				return (emp.getAge() + extraAge) <= 30;
			}
		});
		
		/*
		 * Primitive Functional Interface. We are predefining Predicates for specific data types like int, long, double, etc...
		 */
		IntPredicate greaterThan15 = i -> i > 15;
		System.out.println("Is 10 greater than 15? " + greaterThan15.test(10)); // false
		int a = 5;
		System.out.println(greaterThan15.test(a + 100)); // true
		// System.out.println(i); // I can't access the i declared in the lambda expression for IntPredicate because it's not within scope.
		// https://www.benchresources.net/java-8-primitive-predicate-functional-interface/
		
		System.out.println("======= Predicate Chaining =============");
		
		IntPredicate lessThan100 = i -> i < 100;
		System.out.println(greaterThan15.and(lessThan100).test(103)); // true // false .... .and is a chanining keyword that allows us to check for multiple
		// conditions.
		
		DoublePredicate lessThan400 = i -> i < 400;
		
		
	}
	
	
	
	private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
		
		System.out.println(ageText);
		
//		for (Employee emp : employees) {
//			
//			if (ageCondition.test(emp)) {
//				System.out.println(emp.getName());
//			}
//			
//		}
		
		// this is just a fancier way of doing it
		employees.forEach((emp) -> {
		
			if(ageCondition.test(emp)) {
				
				System.out.println(emp.getName());
			}
			
		});
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
