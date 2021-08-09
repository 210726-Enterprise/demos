package com.revature.streams;

import java.util.Arrays;
import java.util.List;

public class Driver {
	
	public static void main(String[] args) {
		

		/*
		 * Introduced in Java 8, the Stream API is used to process collections of
		 * objects. 
		 * 
		 * A stream is a sequence of objects that supports various methods
		 * which can be pipelined to produce the desired result. 
		 * A stream is not a data structure! 
		 * Instead it takes input from the Collections, Arrays or I/O
		 * channels.
		 * 
		 * https://stackify.com/streams-guide-java-8/
		 */

		List<String> someBingoNumbers = Arrays.asList(
				"N40", "N36",
				"B12", "B6",
				"G53", "G49", "G60", "G50", "g64",
				"I26", "I17", "I29",
				"O71");
	
		/*
		 *  Imagine that we want to print all the bingo nums in column G:
		 *  
		 *  We could use the forEach loop...
		 */
		
		someBingoNumbers.forEach(number -> {
			
			if(number.startsWith("G")) {
				System.out.println(number);
			}
			// go back and add a lowercase g....
		});
		
		someBingoNumbers
			.stream()
			.map(String::toUpperCase) // :: notation is called a MEHTOD REFERENCE -> s -> s.toUpperCase();
									  // The map method accepts a function, and returns a value.  We use the String Object to call the method
									  // https://www.geeksforgeeks.org/method-references-in-java-with-examples/
			
									/*
									 * To refer a method in an object 
										Class :: methodName 
									 */
			.filter(s -> s.startsWith("G")) // we can only use method references when the compiler can infer the parameter (here there is no way for the compiler to infer that the param is "G"
			.sorted()
			.forEach(System.out::println); // is the same as (s -> System.out.println(s)) -- specifically FROM the Stream class
		
		// OBJECT RETURNED IS A STREAM
			
		/*
		 * If you look at the Stream documetnation...what does it actually mean?
		 * In practice, a stream is a set of object references.  The Stream creates a STREAM from a collection.
		 * Each object reference in the stream corresponds to an object in the collection, and the ordering 
		 * of the stream matches the ordering of the collection.
		 * 
		 * The original collection will NOT be changed.
		 */
	}
}
