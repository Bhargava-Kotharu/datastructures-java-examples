package com.bkotharu.example.ds;

import java.util.LinkedList;

/**
 * 
 * @author bhargavakotharu
 *
 */
public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		// Add elements to list
		addElementsToList(list);
		print(list);

		// Get first element
		String first = list.getFirst();
		print(first);

		// Get last element
		String last = list.getLast();
		print(last);

		// Get element by index
		String element = list.get(1);
		print(element);

		// Remove first element (head of the list)
		list.remove();

		// Remove element at index
		list.remove(1);

		// Remove element by object
		list.remove("Krishna");

		print(list);

		addElementsToList(list);

		// Iterating over LinkedList
		for (String elementStr : list) {
			print(elementStr);
		}

		// Poll - Retrieves and removes the first element from the stack
		String pollStr = list.poll();
		System.out.println(pollStr);
		
		// Pop - Return and remove the first element from the stack
		System.out.println(list.pop());
		
		//Peek - Returns the top element from the stack
		System.out.println(list.peek());

		// Push - pushes an element to the top of the stack.
		list.push("Pushing");
		
		print(list);
	}

	public static void addElementsToList(LinkedList<String> list) {
		// Add elements
		list.add("Bhargava");
		list.add("Krishna");
		list.add("Kotharu");

	}

	public static void print(Object o) {
		System.out.println(o);
	}
}
