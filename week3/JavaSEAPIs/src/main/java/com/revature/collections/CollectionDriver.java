package com.revature.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

public class CollectionDriver {
	
	public static void main(String[] args) {
		
		/*
		 * List
		 * 
		 * A List is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements.
		 * In addition to the operations inherited from Collection, the List interface includes operations for the following:
		 * 
		 * 		+ Positional access 
		 * 			— manipulates elements based on their numerical position in the list. This includes 
		 * 			  methods such as get, set, add, addAll, and remove.
		 * 
		 * 		+ Search 
		 * 			— searches for a specified object in the list and returns its numerical position. 
		 * 			  Search methods include indexOf and lastIndexOf.
		 * 
		 * 		+ Iteration 
		 * 			— extends Iterator semantics to take advantage of the list's sequential nature. 
		 * 			  The listIterator methods provide this behavior.
		 * 
		 * 		+ Range-view 
		 * 			— The sublist method performs arbitrary range operations on the list.
		 * 
		 * The Java platform contains two general-purpose List implementations. ArrayList, which performs well when adding or removing from 
		 * the collection frequently. A LinkedList which offers better performance when the collection will be accessed frequently (get and 
		 * set methods).
		 */
		List<Animal> animalList = new ArrayList<>();
		
		Animal a1 = new Animal("Dog", 12);
		Animal a2 = new Animal("Tiger", 5);
		Animal a3 = new Animal("Dog", 12);
		
		animalList.add(a1);
		animalList.add(a2);
		animalList.add(a3); // duplicates .. but right now they have different hashcodes.
		
		for(Animal a : animalList) {
			System.out.println(a);
		}
		
		List<Integer> numbers = new Vector<>();
		/*
		 * |Vector differs from ArrayList in 2 ways:
		 * 
		 * - Data Growth: A vector will double in size when it expands. (Whereas an ArrayList increases by 50%) 
		 * - Synchronization: It's slower because it blocks multiple threads from using it at once. (locking).
		 * 		- If you're dealing with a multi-threaded program, and multiple threads are accessing one List,
		 * 		- you want to make sure it's a Vector.
		 */
		numbers.add(0);
		numbers.add(25354);
		numbers.add(-232);
		numbers.add(2);
		
		for(int n : numbers) {
			System.out.println(n);
		}
		
		
		/*
		 * Set
		 * 
		 * A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction. The Set 
		 * interface contains only methods inherited from Collection and adds the restriction that duplicate elements are 
		 * prohibited. Set also adds a stronger contract on the behavior of the equals and hashCode operations, allowing Set 
		 * instances to be compared meaningfully even if their implementation types differ. Two Set instances are equal if they 
		 * contain the same elements.
		 */
		
		Set<Animal> animalSet = new HashSet<>(); // LinkedHashSet will maintain insertion order (like a List)
		
		
		animalSet.add(a1); // has the same values as a3 are Both ("Dog", 12)
		animalSet.add(a2);
		animalSet.add(a3);
		
		System.out.println("++++++++++++++++++ Hash Set ++++++++++++++++++++");
		
		for(Animal a : animalSet) {
			System.out.println(a);
		}
		

		/*
		 * Queue
		 * 
		 * A collection designed for holding elements prior to processing. Besides basic Collection operations, queues provide 
		 * additional insertion, extraction, and inspection operations. Each of these methods exists in two forms: one throws 
		 * an exception if the operation fails, the other returns a special value (either null or false, depending on the 
		 * operation). The latter form of the insert operation is designed specifically for use with capacity-restricted Queue 
		 * implementations; in most implementations, insert operations cannot fail.
		 * 
		 * For the most part, queues maintain a first-in, first-out order (FIFO). One exception to this rule is the PriorityQueue
		 * implementation, which order elements according to a supplied comparator, or the elements' natural ordering.
		 */
		
		Queue<Animal> animalQ = new LinkedList<>();
		// In a Queue you can store duplicate values.
		// A special linkedList with specific Queue operability
		animalQ.add(a1);
		animalQ.add(a2);
		animalQ.add(a3);
		animalQ.add(a3);
	
		System.out.println("+++++++++ Queue ++++++++++");
		
		System.out.println(animalQ);
		
		for(Animal a : animalQ) {
			System.out.println(a.hashCode());
		}
		// getClass().getName() + '@' + Integer.toHexString(hashCode())  <- Memory address of the object

		System.out.println("+++++++++++++ Processing A Queue +++++++++++++++");
		
		while(animalQ.size() != 0) {
			System.out.println("Queue Size: " + animalQ.size());
			System.out.println("Processing... " + animalQ.poll()); // .poll() will process by removing it from the head of the container
		}
		
	
		/*
		 * Collections Utility Class
		 * 
		 * This class consists exclusively of static methods that operate on or return collections. It contains polymorphic 
		 * algorithms that operate on collections, "wrappers", which return a new collection backed by a specified collection, 
		 * and a few other odds and ends.
		 */
		
		System.out.println("sorting vector");
		Collections.sort(numbers);
		System.out.println(numbers);
		
		
		
		
		
		
		
		
		
		
		
	}

}
