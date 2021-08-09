package com.revature.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * What is Reflection? **PLEASE NOTE!** There is a full fledged Reflection Project in this week
 * Please refer to the Reflection Project.
 * 
 * In OOP languages, Reflection allows inspection of classes, interfaced, fields,
 * and methods at runtime without knowing the names of those members, etc at compile time. 
 */
public class Driver {

	public static void main(String[] args) {

		try {
			Object car = Car.class.newInstance();// creating a reference to the class.
			// Class.forName("com.revature.Foo").newInstance()

			// m is referring to a definition of a method.
			Method m = car.getClass().getDeclaredMethod("drive", new Class<?>[0]);

			// I'm calling the method but I'm passing through the instance of this class
			// that I just created. So I'm invoking the method IN the instance of the Foo
			// class.
			m.invoke(car);
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
