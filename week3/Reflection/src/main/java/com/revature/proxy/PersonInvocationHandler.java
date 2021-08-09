package com.revature.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * What is this?
 * 
 * InvocationHandler is a special interface that lets us intercept any method call to our object
 * and add the additional behavior we need.
 * 
 * We need to create our own interceptor (that's what PersonInvocationHandler is_ ...it's a class
 * that implements the InvocationHandler Interface
 */

// This is a Dynamic Proxy design pattern
public class PersonInvocationHandler implements InvocationHandler {
	
	// include the interface which we're essentially overriding the methods of
	private Person person;
	
	// a constructor for the Proxy object
	public PersonInvocationHandler(Person person) {
		this.person = person;
	}
	

	// This is where we procivde the functionality we want in order to alter the behavior
	// of an objects methods at runtime
	@Override 
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("Hi!");
		System.out.println("Extra functionality");
		
		return method.invoke(person, args); 
		// the invoke() method has access to the originally invoked method and all its argument
		
	}

}
