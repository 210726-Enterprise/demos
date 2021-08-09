package com.revature.proxy;

import java.lang.reflect.Proxy;

public class Driver {

	public static void main(String[] args) {
		
		// Create the original object for which we will create a proxy.
		Man arnold = new Man("Arnold", 30, "Shwartz", "Austria");
		
		ClassLoader arnoldClassLoader = arnold.getClass().getClassLoader();
		// The java.lang.ClassLoader class is an object we can create that is reposnsible for loading
		// a class and its associates data
		
		// Grab all of the interfaces that the original object implements
		Class<?>[] interfaces = arnold.getClass().getInterfaces();
		// We're using a generic wildcard because type is unknown
		
		// Create the proxy!
		Person proxyArnold = (Person) Proxy.newProxyInstance(arnoldClassLoader, interfaces, new PersonInvocationHandler(arnold));
		
		// We're calling one of our original object's methods on the proxy object
		proxyArnold.introduce(arnold.getName());
	}

}
