package com.revature.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Lambdas provide us with an easier way to work with interfaces that only have 1 method.
public class Driver {

	public static void main(String[] args) {

		// (A) Instantiate custom thread object
		new Thread(new MyThread()).start(); // this is first way to call a thread.

		// we can change this by just throwing in Runnable and overriding
		// the method within an anonymous class

		/*
		 * An anonymous class is just what its name implies -- it has no name. It
		 * combines the class declaration and the creation of an instance of the class
		 * in one step.
		 */

		// (B) Use an anonymous thread
		new Thread(new Runnable() {
			// the only reason we created an anonymous class is to override the functionality of the Runnable interface
			public void run() {
				System.out.println("Printing from the anonymous class ");
			}
			
		}).start();

		/*
		 * ======= NOTICE:======
		 * 
		 * We only care about the System.out.println statement here, yet there's a bunch
		 * of other code we don't really care about.
		 * 
		 * The other code is just filler code so that we can actually execute it. The
		 * rest of the code is there to do 2 things:
		 * 
		 * 1. instantiate object 
		 * 2. implement the single method in the implemented interface.
		 * 
		 * ===== LAMBDAS let us do that! =====
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html#:~:text=Interface%20Runnable&text=This%20is%20a%20functional%20interface,lambda%20expression%20or%20method%20reference.&text=The%20Runnable%20interface%20should%20be,be%20executed%20by%20a%20thread.
		 */

		// (C) Use a Lambda!
		new Thread(() -> System.out.println("Printing from the Runnable")).start();
		
		/*
		 * Every lambda has 3 parts:
		 * 
		 * 	(1) Argument List -- ours has an empty one
		 * 	(2) Arrow Token
		 * 	(3) Body ----------- System.out.println("Printing from the Runnable")
		 * 
		 * The Compiler is able to match the lambda's parameter list with the run() method.
		 * Since the compiler needs to match the lambda expression to a method, lambdas can 
		 * only be used with interfaces that only have one method that needs to be implemented.
		 * 
		 * These Interfaces are called FUNCTIONAL INTERFACES.
		 */
		
		// (D) What if the run() method had multiple lines of code?
		new Thread(() -> {
			
			System.out.println("Printing from the Runnable");
			System.out.println("Line 2");
			System.out.format("This is line %d\n", 3);
			
		}).start();
		
		
		// (F) == Do this after creating the Employee Inner Class (BELOW)
		Employee zayn = new Employee("Zayn Smith", 40);
		Employee abby = new Employee("Abby McCormick", 30);
		Employee xavier = new Employee("Xavier Hall" , 15);
		Employee marry = new Employee("Marry Shelly", 60);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(zayn);
		employees.add(abby);
		employees.add(xavier);
		employees.add(marry);
		
		/*
		 * Internally the Sort method does call Compare method of the classes it is sorting.
		 * 
		 * A comparator interface is used to order the objects of user-defined classes. 
		 * A comparator object is capable of comparing two objects of two different classes. 
		 * 
		 * Here we use an anonymous inner class that implements Comparator. Comparator is an interface
		 * that would be implemented by a SEPARATE class to define a sorting method.
		 * 
		 * An anonymous inner class, in this case, is any class that implements Comparator. 
		 * Using it means we are not bound to instantiating a named class implementing 
		 * an interface; instead, we implement the compare() method inside the anonymous inner class.
		 * 
		 * https://www.infoworld.com/article/3323403/java-challengers-5-sorting-with-comparable-and-comparator-in-java.html
		 * 
		 * https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
		 */
		
		// (G) First Comparator with anonymous class overriding the method in an interface
		Collections.sort(employees, new Comparator<Employee>() { // https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
			// sorts Employees by name
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.getName().compareTo(emp2.getName());
			}
			
			// every Object has the equals() method which it inherits
		});
		
		// (H) 2nd Comparator with Lambda
		Collections.sort(employees, (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));
		
		/*
		 * arg list
		 * arrow token
		 * body
		 */
		
		// check values
		for(Employee employee : employees) {
			System.out.println(employee.getName());
		}
		
		
		/*
		 * LAMBDA PT. 2
		 */
		
		// (L) Using an anonymous class to override the upperAndConcat method
		String sillyString = doStringStuff(new UpperConcat() {

			@Override
			public String upperAndConcat(String s1, String s2) {
				return s1.toUpperCase() + s2.toUpperCase();
			}
	
		}, 
			employees.get(0).getName(), employees.get(1).getName());

		System.out.println(sillyString);
		
		
		/*
		 * Challenge: Above we're using an Anonymous class to override
		 * the functionality of the UpperConcat functional interface
		 */
		
		// Instead of passing an anonymous instance of an object that implements UpperConcat interface,
		// we pass a lambda instead. we are assigning a lambda to a variable
		UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
		String anotherSillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
		
	}
	
	/* (K) create final method
	 * This Method accepts an OBJECT that implements UpperConcat, 
	 * and the two strings we want to concatenate together and CAPITALIZE
	 */ 
	public final static String doStringStuff(UpperConcat uc, String s1, String s2) { 
		return uc.upperAndConcat(s1, s2); // calls the interface method to do the work.

	}

}

// (J) add a new functional interface
interface UpperConcat {
	public String upperAndConcat(String s1, String s2);
}


//Remember that if we HADN't used the Comparator anonymous class above, we would have to create a separate class that 
//overrides the compare method so we can sort it.
class NameSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getName().compareTo(emp2.getName());
	}
	
}

/*
 * ========= BASIC CREATION OF THREADS ============
 * 
 * A thread is the path followed when executing a program. All Java programs
 * have at least one thread, known as the main thread, which is created by the
 * Java Virtual Machine (JVM) at the program’s start, when the main() method is
 * invoked with the main thread.
 * 
 * Thread implementation in java can be achieved in two ways:
 * 
 * 	(1) Extending the java.lang.Thread class 
 * 
 * 	(2) Implementing the
 * java.lang.Runnable Interface
 * 
 * In Java, creating a thread is accomplished by implementing an interface or
 * extending a class. Every Java thread is created and controlled by the
 * java.lang.Thread class.
 * 
 * A single-threaded application has only one thread and can handle only one
 * task at a time. To handle multiple tasks in parallel, multi-threading is
 * used: multiple threads are created, each performing a different task.
 */
class MyThread implements Runnable {

	// When the instantiated thread's start() method is called, the run() method is
	// invoked.
	public void run() {

		System.out.println("Printing from the Runnable");

	}

}